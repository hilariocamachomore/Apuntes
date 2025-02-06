package com.hectortellobalaguer.apuntes.ejercicios.poo

class Libro(titulo: String, autor: String, numPaginas: Int) {
    // Propiedades
    var titulo: String = titulo
        private set // Encapsulamiento: Solo se puede modificar desde dentro de la clase

    var autor: String = autor
        private set // Encapsulamiento: Solo se puede modificar desde dentro de la clase

    var numPaginas: Int = numPaginas
        set(value) { // Setter personalizado para la validación
            field = if (value >= 0) value else 0
        }
        get() = field // Getter personalizado

    // Método para mostrar la información del libro
    fun mostrarInformacion() {
        println("Título: $titulo")
        println("Autor: $autor")
        println("Número de páginas: $numPaginas")
        println("------------------------")
    }
}

fun main() {
    // Crear objetos Libro
    val libro1 = Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1200)
    val libro2 = Libro("Cien años de soledad", "Gabriel García Márquez", 400)
    val libro3 = Libro("1984", "George Orwell", -350) // Intentamos asignar un valor negativo
    val libro4 = Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1000)

    // Mostrar la información de cada libro
    libro1.mostrarInformacion()
    libro2.mostrarInformacion()
    libro3.mostrarInformacion()
    libro4.mostrarInformacion()

}