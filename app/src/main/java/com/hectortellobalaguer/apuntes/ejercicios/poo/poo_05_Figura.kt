package com.hectortellobalaguer.apuntes.ejercicios.poo

import kotlin.math.PI

// Clase abstracta Figura
abstract class Figura {
    // Método abstracto para calcular el área
    abstract fun calcularArea(): Double
}

// Clase Circulo que hereda de Figura
class Circulo(val radio: Double) : Figura() {

    // Implementación del método calcularArea()
    override fun calcularArea(): Double {
        return PI * radio * radio
    }
}

// Clase Cuadrado que hereda de Figura
class Cuadrado(val lado: Double) : Figura() {

    // Implementación del método calcularArea()
    override fun calcularArea(): Double {
        return lado * lado
    }
}

fun main() {
    // Crear objetos Circulo y Cuadrado
    val circulo1 = Circulo(5.0)
    val cuadrado1 = Cuadrado(4.0)
    val circulo2 = Circulo(2.5)
    val cuadrado2 = Cuadrado(6.0)

    // Calcular y mostrar el área de cada figura
    println("Área del círculo 1: ${circulo1.calcularArea()}")
    println("Área del cuadrado 1: ${cuadrado1.calcularArea()}")
    println("Área del círculo 2: ${circulo2.calcularArea()}")
    println("Área del cuadrado 2: ${cuadrado2.calcularArea()}")
}