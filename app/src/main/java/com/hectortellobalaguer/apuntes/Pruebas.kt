package com.hectortellobalaguer.apuntes

fun main() {
    val numeros = mutableListOf<Double>()
    var contador = 0

    while (contador < 5) {
        print("Introduce eel número ${contador + 1}: ")
        val input = readlnOrNull()

        try {
            val numero = input?.toDouble() ?: throw NumberFormatException()
            numeros.add(numero)
            contador++
        } catch (e: NumberFormatException) {
            println("Entrada inválida. Introduce un número válido.")
        }
    }

    val media = numeros.average()
    println("La media de los números es: $media")
}