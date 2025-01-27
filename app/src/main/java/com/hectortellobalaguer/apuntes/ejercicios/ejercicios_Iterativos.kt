package com.hectortellobalaguer.apuntes.ejercicios

fun main(){
//    Iterativos_01_SumaPositivos()
//    Iterativos_02_UsuarioContrase()
    Iterativos_03_Divisibles()
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

