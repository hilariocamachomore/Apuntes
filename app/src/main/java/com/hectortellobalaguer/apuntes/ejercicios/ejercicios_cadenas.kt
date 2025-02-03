package com.hectortellobalaguer.apuntes.ejercicios

fun main() {

    cadenas_01_repitecadena()
    cadenas_02_iniciales()

}

fun cadenas_01_repitecadena(){
    println("Ejemplo de cadenas_01_repitecadena:")
    val numero = 4
    val palabra = "Kotlin"
    var cadena = ""
    for (i in 1..numero) {
        cadena += palabra
    }
    println("La cadena repetida $numero veces es: $cadena")
}

fun cadenas_02_iniciales(){
    val nombreCompleto = "Hector Tello Balaguer"
    val palabras = nombreCompleto.split(" ")
    var iniciales = ""
    for (palabra in palabras) {
        if (palabra.isNotEmpty()) {
            iniciales += palabra[0].uppercase()
        }
    }
    println("Las iniciales de $nombreCompleto son: $iniciales")
}

