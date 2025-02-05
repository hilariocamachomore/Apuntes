package com.hectortellobalaguer.apuntes

class Persona(val nombre:String, val edad:Int){
    fun saludar(){
        println("Hola, soy $nombre y tengo $edad años")
    }
}

class PersonaDos(val nombre:String, val edad:Int){

    constructor(nombre:String):this(nombre, 0)
    constructor():this("Fulanito", 0)

    fun saludar(){
        println("Hola, soy $nombre y tengo $edad años")
    }
}

class Coche(private var marca:String, var modelo:String){
    fun muestraMarca(){
        println("La marca del coche es $marca")
    }
    fun cambiaMarca(nuevaMarca:String){
        marca = nuevaMarca
    }

}

open class Animal(val nombre:String, val edad:Int){
    open fun hacerSonido(){
        println("El animal hace un sonido")
    }
}

class Perro(nombre:String, edad:Int):Animal(nombre, edad){
    override fun hacerSonido(){
        println("El perro $nombre de $edad años de edad hace guau")
    }
}

open class Vehiculo() {
    open fun tipoDeVehiculo() {
        println("Vehículo")
    }
}

class Moto : Vehiculo() {
    override fun tipoDeVehiculo() {
        println("Este es un amoto")
    }
}
class Barco : Vehiculo() {
    override fun tipoDeVehiculo() {
        println("Este es un barco")
    }
}
abstract class Figura {
    abstract fun calcularArea(): Double
    fun mostrar(){
        println("Es una figura geométrica")
    }
}
class Cuadrado(val lado: Double) : Figura() {
    override fun calcularArea(): Double {
        return lado * lado
    }
}


fun main(){

//    InstanciaObjetos()
//    Constructores()
//    Encapsulamiento()
//    Herencia()
//    Polimorfismo()
    Abstraccion()

}

fun InstanciaObjetos() {
    val persona1 = Persona("Miguela", 25)
    persona1.saludar()
}

fun Constructores() {
    val pepe = PersonaDos("Pepe",45)
    pepe.saludar()
    val pepeDos = PersonaDos("Pepe")
    pepeDos.saludar()
    val pepeTres = PersonaDos()
    pepeTres.saludar()
}

fun Encapsulamiento() {
    var micoche = Coche("Toyota", "Corolla")
    micoche.muestraMarca()
    println(micoche.modelo)
    micoche.cambiaMarca("Ford")
    micoche.modelo = "Mustang"
    micoche.muestraMarca()
    println(micoche.modelo)
}

fun Herencia() {
    val animal = Animal("Fido", 3)
    animal.hacerSonido()
    val migoss = Perro("Migue", 5)
    migoss.hacerSonido()
}

fun Polimorfismo() {
    val vehiculo1: Vehiculo = Moto()
    val vehiculo2: Vehiculo = Barco()
    vehiculo1.tipoDeVehiculo()
    vehiculo2.tipoDeVehiculo()
}

fun Abstraccion() {
    val cuadrado = Cuadrado(5.0)
    cuadrado.mostrar()
    println("El área del cuadrado es: ${cuadrado.calcularArea()}")
}

