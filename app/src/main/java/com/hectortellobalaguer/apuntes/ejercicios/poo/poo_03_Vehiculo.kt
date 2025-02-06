package com.hectortellobalaguer.apuntes.ejercicios.poo

// Clase base Vehiculo
open class Vehiculo(val marca: String, val modelo: String) {

    // Método para mostrar la información del vehículo
    open fun mostrarInformacion() {
        println("Marca: $marca")
        println("Modelo: $modelo")
    }
}

// Clase Coche que hereda de Vehiculo
class Coche(marca: String, modelo: String, val numPuertas: Int) : Vehiculo(marca, modelo) {

    // Sobrescritura del método mostrarInformacion()
    override fun mostrarInformacion() {
        super.mostrarInformacion() // Llama al método de la clase padre
        println("Número de puertas: $numPuertas")
        println("------------------------")
    }
}

// Clase Moto que hereda de Vehiculo
class Moto(marca: String, modelo: String, val cilindrada: Int) : Vehiculo(marca, modelo) {

    // Sobrescritura del método mostrarInformacion()
    override fun mostrarInformacion() {
        super.mostrarInformacion() // Llama al método de la clase padre
        println("Cilindrada: $cilindrada cc")
        println("------------------------")
    }
}

fun main() {
    // Crear objetos Coche y Moto
    val coche1 = Coche("Seat", "Ibiza", 5)
    val coche2 = Coche("Renault", "Megane", 3)
    val moto1 = Moto("Honda", "CBR", 600)
    val moto2 = Moto("Yamaha", "MT-07", 700)

    // Mostrar la información de cada vehículo
    coche1.mostrarInformacion()
    coche2.mostrarInformacion()
    moto1.mostrarInformacion()
    moto2.mostrarInformacion()
}