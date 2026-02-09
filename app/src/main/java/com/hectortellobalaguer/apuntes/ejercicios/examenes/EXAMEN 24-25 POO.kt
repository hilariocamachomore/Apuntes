package com.hectortellobalaguer.apuntes.ejercicios.examenes

import kotlin.math.PI

// Clase base Figura
open class Figurax(protected var color: String) {
    open fun mostrarInformacion() {
        println("Color: $color")
    }

    protected open fun calcularArea(): Double {
        return 0.0
    }

    protected open fun calcularPerimetro(): Double {
        return 0.0
    }
}

// Clase Rectangulo
class Rectangulo(color: String, base: Double, altura: Double) : Figurax(color) {
    var base: Double = base
        get() = field
        set(value) {
            field = if (value >= 0) value else 0.0
        }
    private var altura: Double = altura
        get() = field
        set(value) {
            field = if (value >= 0) value else 0.0
        }

    override fun calcularArea(): Double {
        return base * altura
    }

    override fun calcularPerimetro(): Double {
        return 2 * (base + altura)
    }

    override fun mostrarInformacion() {
        super.mostrarInformacion()
        println("Área: ${calcularArea()}")
        println("Perímetro: ${calcularPerimetro()}")
        println("---")
    }
}

// Clase Circulo
class Circulox(color: String, radio: Double) : Figurax(color) {
    var radio: Double = radio
        get() = field
        set(value) {
            field = if (value >= 0) value else 0.0
        }

    override fun calcularArea(): Double {
        return PI * radio * radio
    }

    override fun calcularPerimetro(): Double {
        return 2 * PI * radio
    }

    override fun mostrarInformacion() {
        super.mostrarInformacion()
        println("Área: ${calcularArea()}")
        println("Perímetro: ${calcularPerimetro()}")
        println("---")
    }
}

fun main() {
    // Crear objetos
    val rectangulo = Rectangulo("rojo", 5.0, 3.0)
    val circulo = Circulox("azul", 4.0)

    // Mostrar información inicial
    println("Información inicial:")
    rectangulo.mostrarInformacion()
    circulo.mostrarInformacion()

    // Modificar valores
    rectangulo.base = -2.0
    circulo.radio = -1.0

    // Mostrar información después de la modificación
    println("Información después de la modificación:")
    rectangulo.mostrarInformacion()
    circulo.mostrarInformacion()
}