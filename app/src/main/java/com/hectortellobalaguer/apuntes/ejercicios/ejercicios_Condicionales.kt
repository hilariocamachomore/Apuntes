package com.hectortellobalaguer.apuntes.ejercicios

fun main() {
//    Condicionales_01_Par()
//    Condicionales_02_Division()
//    Condicionales_03_Multiplo()
//    Condicionales_04_Mayor()
    Condicionales_05_Nota()


}

fun Condicionales_01_Par() {
    println("Introduce un número:")
    val numero = readLine()?.toIntOrNull()

    if (numero == null) {
        println("Entrada inválida. Por favor, introduce un número entero.")
    } else {
        if (numero % 2 == 0) {
            println("El número $numero es par.")
        } else {
            println("El número $numero es impar.")
        }
    }
}

fun Condicionales_02_Division() {
    println("Introduce el primer número:")
    val numero1 = readLine()?.toDoubleOrNull()

    println("Introduce el segundo número:")
    val numero2 = readLine()?.toDoubleOrNull()

    if (numero1 == null || numero2 == null) {
        println("Entrada inválida. Por favor, introduce números válidos.")
    } else if (numero2 == 0.0) {
        println("Error: No se puede dividir por cero.")
    } else {
        val resultado = numero1 / numero2
        println("El resultado de la división es: $resultado")
    }
}


fun Condicionales_03_Multiplo() {
    println("Introduce el primer número:")
    val numero1 = readLine()?.toIntOrNull()

    println("Introduce el segundo número:")
    val numero2 = readLine()?.toIntOrNull()

    if (numero1 == null || numero2 == null) {
        println("Entrada inválida. Por favor, introduce números enteros válidos.")
    } else if (numero2 == 0) {
        println("Error: El segundo número no puede ser cero.")
    } else {
        if (numero1 % numero2 == 0) {
            println("El número $numero1 es múltiplo de $numero2.")
        } else {
            println("El número $numero1 no es múltiplo de $numero2.")
        }
    }
}

fun Condicionales_04_Mayor() {
    println("Introduce el primer número:")
    val numero1 = readLine()?.toDoubleOrNull()

    println("Introduce el segundo número:")
    val numero2 = readLine()?.toDoubleOrNull()

    println("Introduce el tercer número:")
    val numero3 = readLine()?.toDoubleOrNull()

    if (numero1 == null || numero2 == null || numero3 == null) {
        println("Entrada inválida. Por favor, introduce números reales válidos.")
    } else {
        val mayor = maxOf(numero1, numero2, numero3)
        println("El número mayor es: $mayor")
    }
}

fun Condicionales_05_Nota() {
    println("Introduce un número del 1 al 10:")
    var nota = readLine()?.toIntOrNull()

    if (nota == null || nota !in 1..10) {
        println("Entrada inválida. Por favor, introduce un número del 1 al 10.")
    }else{
        val nombreNota = when (nota) {
            1, 2, 3, 4 -> "Suspenso"
            5 -> "Suficiente"
            6 -> "Bien"
            7, 8 -> "Notable"
            9, 10 -> "Sobresaliente"
            else -> "Error" // Esto no debería ocurrir, pero se incluye por seguridad
        }
        println("La nota correspondiente al número $nota es: $nombreNota")
    }

}
