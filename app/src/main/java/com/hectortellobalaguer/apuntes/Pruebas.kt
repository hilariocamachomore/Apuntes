package com.hectortellobalaguer.apuntes
import kotlin.random.Random

fun ma48in() {
    var preguntasCorrectas = 0
    val totalPreguntas = 10

    while (preguntasCorrectas < totalPreguntas) {
        val numero1 = Random.nextInt(1, 11) // Números del 1 al 10
        val numero2 = Random.nextInt(1, 11)

        println("¿Cuánto es $numero1 x $numero2?")
        val respuestaUsuario = readLine()?.toIntOrNull()

        if (respuestaUsuario == null || respuestaUsuario != numero1 * numero2) {
            println("Incorrecto. La respuesta correcta es ${numero1 * numero2}.")
            preguntasCorrectas = 0 // Reiniciar la cuenta
        } else {
            println("¡Correcto!")
            preguntasCorrectas++
        }
    }

    println("¡Felicidades! Has completado las $totalPreguntas preguntas correctamente.")
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