package com.hectortellobalaguer.apuntes

class Persona(var nombre:String, val edad:Int){
    fun saludart(){
        println("Hola, soy $nombre y tengo $edad años")
    }
}

class PersonaDos(val nombre:String, val edad:Int){

    constructor(nombre:String):this(nombre, 0)
    constructor():this("Fulanito", 0)
    constructor(edad:Int):this("Menganito", edad)

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
    fun comer(){
        println("El animal está comiendo")
    }
    fun dormir(){
        println("El animal está durmiendo")
    }
    fun moverse(){
        println("El animal está moviéndose")
    }
    fun respirar(){
        println("El animal está respirando")
    }
    fun reproducirse(){
        println("El animal está reproduciéndose")
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


fun Polimorfismo() {
    val vehiculo1: Vehiculo = Moto()
    val vehiculo2: Vehiculo = Barco()
    vehiculo1.tipoDeVehiculo()
    vehiculo2.tipoDeVehiculo()
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
    Polimorfismo()
//    Abstraccion()

}

fun InstanciaObjetos() {
    val Sara = Persona("Sara", 17)
    Sara.saludart()
    Sara.saludart()
    Sara.nombre = "Sara Maria"
    Sara.saludart()

    val Hugo = Persona("Hugo", 18)
    Hugo.saludart()

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




fun Abstraccion() {
    val cuadrado = Cuadrado(5.0)
    cuadrado.mostrar()
    println("El área del cuadrado es: ${cuadrado.calcularArea()}")
}

