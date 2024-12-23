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

fun main(){
    val persona1 = Persona("Juan", 25)
    persona1.saludar()

    //Constructores
    val pepe = PersonaDos("Pepe",45)
    pepe.saludar()
    val pepeDos = PersonaDos("Pepe")
    pepeDos.saludar()
    val pepeTres = PersonaDos()
    pepeTres.saludar()

    //Encapsulamiento
    var micoche = Coche("Toyota", "Corolla")
    micoche.muestraMarca()
    println(micoche.modelo)
    micoche.cambiaMarca("Ford")
    micoche.modelo = "Mustang"
    micoche.muestraMarca()
    println(micoche.modelo)




}