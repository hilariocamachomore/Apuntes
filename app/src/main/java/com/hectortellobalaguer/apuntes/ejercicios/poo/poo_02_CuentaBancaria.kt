package com.hectortellobalaguer.apuntes.ejercicios.poo

class CuentaBancaria(val titular: String, saldoInicial: Double = 0.0) {
    // Propiedad
    var saldo: Double = saldoInicial
        private set // Encapsulamiento: Solo se puede modificar desde dentro de la clase

    // Constructor secundario
    constructor(titular: String) : this(titular, 0.0)

    // Método para depositar
    fun depositar(cantidad: Double) {
        if (cantidad > 0) {
            saldo += cantidad
            println("Se han depositado $cantidad euros. Nuevo saldo: $saldo")
        } else {
            println("La cantidad a depositar debe ser mayor que 0.")
        }
    }

    // Método para retirar
    fun retirar(cantidad: Double) {
        if (cantidad > 0) {
            if (saldo >= cantidad) {
                saldo -= cantidad
                println("Se han retirado $cantidad euros. Nuevo saldo: $saldo")
            } else {
                println("Error: No hay suficiente saldo para retirar $cantidad euros.")
            }
        } else {
            println("La cantidad a retirar debe ser mayor que 0.")
        }
    }

    // Método para mostrar el saldo
    fun mostrarSaldo() {
        println("Saldo actual de $titular: $saldo euros")
    }
}

fun main() {
    // Crear objetos CuentaBancaria
    val cuenta1 = CuentaBancaria("Juan Pérez") // Constructor primario con saldo inicial 0
    val cuenta2 = CuentaBancaria("María López", 500.0) // Constructor primario con saldo inicial

    // Mostrar saldos iniciales
    cuenta1.mostrarSaldo()
    cuenta2.mostrarSaldo()
    println("------------------------")

    // Realizar depósitos
    cuenta1.depositar(100.0)
    cuenta2.depositar(250.0)
    println("------------------------")

    // Realizar retiradas
    cuenta1.retirar(50.0)
    cuenta2.retirar(700.0) // Intentar retirar más de lo que hay
    cuenta2.retirar(100.0)
    println("------------------------")

    // Mostrar saldos finales
    cuenta1.mostrarSaldo()
    cuenta2.mostrarSaldo()
    println("------------------------")

    // Intentar depositar una cantidad negativa
    cuenta1.depositar(-50.0)
    println("------------------------")

    // Intentar retirar una cantidad negativa
    cuenta1.retirar(-20.0)
}