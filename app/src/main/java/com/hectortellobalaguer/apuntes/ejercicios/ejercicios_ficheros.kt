package com.hectortellobalaguer.apuntes.ejercicios

import java.io.File
import java.io.IOException
import java.util.Scanner

fun main() {
//    ficheros_01_escribenumeros()
//    ficheros_01_escribenumerosDOS()fi
    ficheros_02_muestrafichero()
    //ficheros_03_sumanumeros()
}

fun ficheros_01_escribenumeros() {
    val ruta = "C:/PRUEBAS/"
    val nombreArchivo = "numeros.txt"
    val rutaCompleta = ruta + nombreArchivo
    val file = File(rutaCompleta)
    file.parentFile?.mkdirs()

    try {
        val writer = file.bufferedWriter()
        val scanner = Scanner(System.`in`)
        var numero: Int

        do {
            print("Introduce un número (0 para finalizar): ")
            numero = scanner.nextInt()
            if (numero != 0) {
                writer.write("$numero ")
            }
        } while (numero != 0)

        writer.close()
        println("Números guardados en $rutaCompleta")
    } catch (e: IOException) {
        println("Error al escribir en el archivo: ${e.message}")
    }
}

fun ficheros_01_escribenumerosDOS() {
    val ruta = "C:/PRUEBAS/"
    val nombreArchivo = "numerosDOS.txt"
    val rutaCompleta = ruta + nombreArchivo
    val file = File(rutaCompleta)
    file.delete()

    try {
        var numero: Int

        do {
            print("Introduce un número (0 para finalizar): ")
            numero = readLine().toString().toInt()
            if (numero != 0) {
                file.appendText("$numero ")
            }
        } while (numero != 0)

        println("Números guardados en $rutaCompleta")
    } catch (e: IOException) {
        println("Error al escribir en el archivo: ${e.message}")
    }
}

fun ficheros_02_muestrafichero() {
    val scanner = Scanner(System.`in`)
    print("Introduce el nombre del fichero: ")
    val nombreArchivo = scanner.nextLine()
    val ruta = "C:/PRUEBAS/"
    val rutaCompleta = ruta + nombreArchivo
    val file = File(rutaCompleta)

    if (!file.exists()) {
        println("El fichero $nombreArchivo no existe.")
        return
    }

    try {
        val lines = file.readLines()
        var start = 0
        val linesPerPage = 23

        while (start < lines.size) {
            val end = minOf(start + linesPerPage, lines.size)
            for (i in start until end) {
                println(lines[i])
            }
            start = end
            if (start < lines.size) {
                print("Pulsa Intro para mostrar las siguientes líneas...")
                scanner.nextLine() // Espera a que se pulse Intro
            }
        }
    } catch (e: IOException) {
        println("Error al leer el archivo: ${e.message}")
    }
}

fun ficheros_03_sumanumeros() {
    val ruta = "C:/PRUEBAS/"
    val nombreArchivo = "numeros.txt"
    val rutaCompleta = ruta + nombreArchivo
    val file = File(rutaCompleta)

    if (!file.exists()) {
        println("El fichero $nombreArchivo no existe.")
        return
    }

    try {
        val contenido = file.readText()
        val numeros = contenido.split(" ")
        var suma = 0
        for (numeroStr in numeros) {
            if (numeroStr.isNotEmpty()) {
                suma += numeroStr.toInt()
            }
        }
        println("La suma de los números es: $suma")
    } catch (e: IOException) {
        println("Error al leer el archivo: ${e.message}")
    } catch (e: NumberFormatException) {
        println("Error: El archivo contiene datos no numéricos.")
    }
}

