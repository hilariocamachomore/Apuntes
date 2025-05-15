package com.hectortellobalaguer.apuntes.ejercicios


fun main() {
    // Ejemplo de uso de funciones_01_saluda
    println("Ejemplo de funciones_01_saluda:")
    funciones_01_saluda(5) // Imprime "Hola " 5 veces

    // Ejemplo de uso de funciones_02_tabla
    println("\nEjemplo de funciones_02_tabla:")
    funciones_02_tabla(7) // Imprime la tabla del 7

    // Ejemplo de uso de funciones_03_suma
    println("\nEjemplo de funciones_03_suma:")
    val suma = funciones_03_suma(2, 3, 4)
    println("La suma es: $suma") // Imprime "La suma es: 9"

    // Ejemplo de uso de funciones_04_esPrimo
    println("\nEjemplo de funciones_04_esPrimo:")
    val numero1 = 17
    val numero2 = 15
    println("$numero1 es primo: ${funciones_04_esPrimo(numero1)}") // Imprime "17 es primo: true"
    println("$numero2 es primo: ${funciones_04_esPrimo(numero2)}") // Imprime "15 es primo: false"

    // Ejemplo de uso de funciones_05_intercambia
    println("\nEjemplo de funciones_05_intercambia:")
    val numeros = intArrayOf(10, 20)
    println("Antes del intercambio: ${numeros.contentToString()}") // Imprime "Antes del intercambio: [10, 20]"
    funciones_05_intercambia(numeros)
    println("Después del intercambio: ${numeros.contentToString()}") // Imprime "Después del intercambio: [20, 10]"
}

fun funciones_01_saluda(veces: Int) {
    for (i in 1..veces) {
        print("Hola ")
    }
    println() // Añade un salto de línea al final
}

fun funciones_02_tabla(numero: Int) {
    println("Tabla de multiplicar del $numero:")
    for (i in 1..10) {
        println("$numero x $i = ${numero * i}")
    }
}

fun funciones_03_suma(num1: Int, num2: Int, num3: Int): Int {
    return num1 + num2 + num3
}

fun funciones_04_esPrimo(numero: Int): Boolean {
    if (numero <= 1) {
        return false
    }
    for (i in 2 until numero) {
        if (numero % i == 0) {
            return false
        }
    }
    return true
}

fun funciones_05_intercambia(numeros: IntArray) {
    if (numeros.size == 2) {
        val temp = numeros[0]
        numeros[0] = numeros[1]
        numeros[1] = temp
    } else {
        println("La función intercambia necesita un array de dos números")
    }
}
