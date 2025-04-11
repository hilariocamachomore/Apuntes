package com.hectortellobalaguer.apuntes.ejercicios.poo


import java.time.LocalDate
import java.time.temporal.ChronoUnit


class PrestamoLibro(
    val idLibro: Int,
    val titulo: String,
    val autor: String,
    val isbn: String,
    val numPaginas: Int,
    val genero: String
) {
    var estado: EstadoLibro = EstadoLibro.DISPONIBLE
        private set // El estado solo se puede modificar desde dentro de la clase
    var usuarioPrestamo: String? = null
        private set
    var fechaPrestamo: LocalDate? = null
//        private set //La he comentado yo para poder hacer la simulacion de que han pasado 18 días.

    enum class EstadoLibro {
        DISPONIBLE, PRESTADO
    }

    fun prestarLibro(usuario: String): Boolean {
        return if (estado == EstadoLibro.DISPONIBLE) {
            estado = EstadoLibro.PRESTADO
            usuarioPrestamo = usuario
            fechaPrestamo = LocalDate.now()
            println("Libro '$titulo' prestado a $usuario el $fechaPrestamo.")
            true
        } else {
            println("El libro '$titulo' no está disponible para préstamo.")
            false
        }
    }

    fun devolverLibro(): Double {
        return if (estado == EstadoLibro.PRESTADO && usuarioPrestamo != null && fechaPrestamo != null) {
            val fechaDevolucion = LocalDate.now()
            val diasPrestamo = ChronoUnit.DAYS.between(fechaPrestamo, fechaDevolucion)
            estado = EstadoLibro.DISPONIBLE
            usuarioPrestamo = null
            fechaPrestamo = null
            if (diasPrestamo > 15) {
                val penalizacion = (diasPrestamo - 15) * 0.5 // 0.5 euros por día de retraso
                println("Libro '$titulo' devuelto con retraso. Penalización: $penalizacion euros.")
                penalizacion
            } else {
                println("Libro '$titulo' devuelto correctamente.")
                0.0
            }
        } else {
            println("Error: El libro '$titulo' no se puede devolver (no está prestado o falta información).")
            0.0 // No hay penalización si no se puede devolver
        }
    }

    fun mostrarInformacion() {
        println("ID: $idLibro")
        println("Título: $titulo")
        println("Autor: $autor")
        println("ISBN: $isbn")
        println("Páginas: $numPaginas")
        println("Género: $genero")
        println("Estado: $estado")
        if (estado == EstadoLibro.PRESTADO) {
            println("Prestado a: $usuarioPrestamo")
            println("Fecha de préstamo: $fechaPrestamo")
        }
        println("---")
    }
}

fun main() {
    val libro1 = PrestamoLibro(1, "El Señor de los Anillos", "J.R.R. Tolkien", "978-84-450-7179-9", 1200, "Fantasía")
    libro1.mostrarInformacion()

    libro1.prestarLibro("Ana")
    libro1.mostrarInformacion()

    //Simulamos que pasan 18 dias
    libro1.fechaPrestamo = LocalDate.now().minusDays(18)

    val penalizacion = libro1.devolverLibro()
    libro1.mostrarInformacion()
    println("Penalización total: $penalizacion euros")
}