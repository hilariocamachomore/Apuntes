package com.hectortellobalaguer.apuntes.ejercicios.poo

// Clase abstracta Animal
abstract class Animal(val nombre: String) {
    // Método abstracto para hacer un sonido
    abstract fun hacerSonido()
}

// Clase Perro que hereda de Animal
class Perro(nombre: String) : Animal(nombre) {
    // Implementación del método hacerSonido()
    override fun hacerSonido() {
        println("$nombre dice: Guau")
    }
}

// Clase Gato que hereda de Animal
class Gato(nombre: String) : Animal(nombre) {
    // Implementación del método hacerSonido()
    override fun hacerSonido() {
        println("$nombre dice: Miau")
    }
}

fun main() {
    // Crear una lista de Animales
    val animales = listOf<Animal>(
        Perro("Buddy"),
        Gato("Whiskers"),
        Perro("Max"),
        Gato("Luna")
    )

    // Recorrer la lista y llamar al método hacerSonido() para cada animal
    animales.forEach { animal ->
        animal.hacerSonido()
    }
}