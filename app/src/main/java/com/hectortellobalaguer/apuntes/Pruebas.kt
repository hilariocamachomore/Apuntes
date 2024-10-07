package com.hectortellobalaguer.apuntes

fun main() {

    medias()
}

fun medias(){
    val numeros = mutableListOf<Double>()
    var contador = 0

    while (contador < 5) {
        print("Introduce el número ${contador + 1}: ")
        val input = readlnOrNull()

        try {
            val numero = input?.toDouble() ?: throw NumberFormatException()
            numeros.add(numero)
            contador++
        } catch (e: NumberFormatException) {
            println("Entrada inválidass. Introduce un número válidorross.")
        }
    }

    val media = numeros.average()
    println("La media de los números es: $media")
}