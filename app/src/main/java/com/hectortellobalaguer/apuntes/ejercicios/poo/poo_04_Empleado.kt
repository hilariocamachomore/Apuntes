package com.hectortellobalaguer.apuntes.ejercicios.poo

// Clase base Empleado
open class Empleado(val nombre: String, val salario: Double) {

    // Método para calcular el salario
    open fun calcularSalario(): Double {
        return salario
    }
}

// Clase Gerente que hereda de Empleado
class Gerente(nombre: String, salario: Double, val bono: Double) : Empleado(nombre, salario) {

    // Sobrescritura del método calcularSalario()
    override fun calcularSalario(): Double {
        return salario + bono
    }
}

fun main() {
    // Crear objetos Empleado y Gerente
    val empleado1 = Empleado("Juan Pérez", 2000.0)
    val empleado2 = Empleado("María López", 2200.0)
    val gerente1 = Gerente("Carlos García", 3000.0, 500.0)
    val gerente2 = Gerente("Ana Martínez", 3500.0, 700.0)

    // Calcular y mostrar el salario de cada empleado
    println("Salario de ${empleado1.nombre}: ${empleado1.calcularSalario()}")
    println("Salario de ${empleado2.nombre}: ${empleado2.calcularSalario()}")
    println("Salario de ${gerente1.nombre}: ${gerente1.calcularSalario()}")
    println("Salario de ${gerente2.nombre}: ${gerente2.calcularSalario()}")
}