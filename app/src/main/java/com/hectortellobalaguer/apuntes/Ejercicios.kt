package com.hectortellobalaguer.apuntes

fun main() {
    println("Introduce un número entero:")
    val numero = readLine()?.toIntOrNull() ?: 0
    if (esPrimo(numero)) {
        println("$numero es un número primo.")
    } else {
        println("$numero no es un número primo.")
    }
}


fun esPrimo(numero: Int): Boolean {
    if (numero <= 1) return false
    for (i in 2 until numero) {
        if (numero % i == 0) return false
    }
    return true
}

fun ejercicio1() {

}

fun ejercicio2() {

}

fun ejercicio3() {

}
