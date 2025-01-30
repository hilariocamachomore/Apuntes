package com.hectortellobalaguer.apuntes.ejercicios

fun main() {
    Listas_01_Nombres()
    Listas_02_Buscar()
    Listas_03_SinRepetir()
}

fun Listas_01_Nombres() {
    val nombres = listOf("Ana", "Juan", "María", "Pedro", "Laura")

    println("Lista completa de nombres:")
    println(nombres)

    println("Primer nombre: ${nombres[0]}")
    println("Último nombre: ${nombres[nombres.size - 1]}")
    println("--------------------------------------------------")
}

fun Listas_02_Buscar() {
    val palabras = listOf("manzana", "pera", "plátano", "uva", "naranja", "kiwi", "limón", "sandía")

    println("Introduce una palabra:")
    val palabraUsuario = readLine() ?: ""

    if (palabras.contains(palabraUsuario)) {
        println("La palabra '$palabraUsuario' está en la lista.")
    } else {
        println("La palabra '$palabraUsuario' no está en la lista.")
    }
    println("--------------------------------------------------")
}

fun Listas_03_SinRepetir() {
    val numeros = listOf(1, 2, 3, 2, 4, 5, 1, 6, 7, 8, 5, 9, 10, 3, 1)

    println("Lista original de números:")
    println(numeros)

    val numerosSinRepetir = numeros.distinct()

    println("Lista de números sin repetir:")
    println(numerosSinRepetir)
    println("--------------------------------------------------")
}