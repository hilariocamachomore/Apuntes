package com.hectortellobalaguer.apuntes.ejercicios

import kotlin.math.pow

fun main(){
//    Iterativos_01_SumaPositivos()
//    Iterativos_02_UsuarioContrase()
//    Iterativos_03_Divisibles()
//    Iterativos_04_Media()
    Iterativos_05_Interes()
}

fun Iterativos_01_SumaPositivos() {
    println("Programa para sumar números positivos.")
    println("Introduce números positivos. Introduce 0 o un número negativo para finalizar.")

    var suma = 0
    var numero: Int=0

    do {
        print("Introduce un número: ")
        val input = readLine()
        numero = if (input != null && input.matches(Regex("-?\\d+"))) {
            input.toInt()
        } else {
            println("Entrada no válida. Introduce un número entero.")
            continue
        }

        if (numero > 0) {
            suma += numero
        } else if(numero <0){
            println("Se ha introducido un numero negativo, el programa finalizara. ")
        }
    } while (numero > 0)

    println("La suma de los números positivos introducidos es: $suma")
}

fun Iterativos_02_UsuarioContrase() {
    println("Programa de autenticación de usuario.")

    var usuario: Int
    var contrasena: Int

    do {
        // Solicitar usuario
        print("Introduce el usuario (1024 para acceder): ")
        val inputUsuario = readLine()
        usuario = if (inputUsuario != null && inputUsuario.matches(Regex("-?\\d+"))) {
            inputUsuario.toInt()
        } else {
            println("Usuario no válido. Debe ser un número entero.")
            -1 // Valor inválido para que el bucle continúe
        }

        // Solicitar contraseña si el usuario es válido
        if (usuario != -1) {
            print("Introduce la contraseña (7890 para acceder): ")
            val inputContrasena = readLine()
            contrasena = if (inputContrasena != null && inputContrasena.matches(Regex("-?\\d+"))) {
                inputContrasena.toInt()
            } else {
                println("Contraseña no válida. Debe ser un número entero.")
                -1 // Valor inválido para que el bucle continúe
            }
        } else {
            contrasena = -1
        }

        if (usuario != 1024 || contrasena != 7890) {
            println("Usuario o contraseña incorrectos. Inténtalo de nuevo.")
        }
    } while (usuario != 1024 || contrasena != 7890)

    println("¡Acceso concedido!")
}

fun Iterativos_03_Divisibles() {
    println("Programa para mostrar los números divisibles entre 3.")

    // Pedir al usuario un número positivo
    print("Introduce un número positivo: ")
    val input = readLine()
    val numero = if (input != null && input.matches(Regex("\\d+"))) {
        input.toInt()
    } else {
        println("Entrada no válida. Introduce un número entero positivo.")
        return // Salir de la función si la entrada no es válida
    }

    if (numero <= 0) {
        println("El número debe ser positivo.")
        return // Salir de la función si el número no es positivo
    }

    println("Los números divisibles entre 3 entre 1 y $numero son:")

    // Recorrer los números del 1 al número dado por el usuario
    for (i in 1..numero) {
        // Comprobar si el número es divisible entre 3
        if (i % 3 == 0) {
            println(i)
        }
    }
}

fun Iterativos_04_Media() {
    var sumaNotas = 0.0
    var contadorNotas = 0
    var continuar = true

    while (continuar) {
        println("Introduce una nota (o escribe 'fin' para terminar):")
        val entrada = readLine()

        if (entrada.equals("fin", ignoreCase = true)) {
            continuar = false
        } else {
            val nota = entrada?.toDoubleOrNull()
            if (nota != null) {
                sumaNotas += nota
                contadorNotas++
            } else {
                println("Entrada inválida. Por favor, introduce un número o 'fin'.")
            }
        }
    }

    if (contadorNotas > 0) {
        val media = sumaNotas / contadorNotas
        println("La media de las notas introducidas es: $media")
    } else {
        println("No se ha introducido ninguna nota.")
    }
}



fun Iterativos_05_Interes() {
    var continuar = true

    while (continuar) {
        println("Introduce la cantidad de euros (E):")
        val euros = readLine()?.toDoubleOrNull()

        println("Introduce el interés (R) (ejemplo: 0.05 para 5%):")
        val interes = readLine()?.toDoubleOrNull()

        println("Introduce el número de períodos de tiempo (N):")
        val periodos = readLine()?.toIntOrNull()

        if (euros == null || interes == null || periodos == null) {
            println("Entrada inválida. Por favor, introduce valores numéricos válidos.")
        } else {
            val dineroFinal = euros * (1 + interes).pow(periodos)
            println("El dinero que se obtendrá es: $dineroFinal euros")
        }

        println("¿Desea realizar otro cálculo? (s/n)")
        val respuesta = readLine()?.lowercase()
        continuar = respuesta == "s"
    }
}

