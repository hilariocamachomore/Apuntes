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

fun main(){
    val persona1 = Persona("Juan", 25)
    persona1.saludar()
    val pepe = PersonaDos("Pepe",45)
    pepe.saludar()
    val pepeDos = PersonaDos("Pepe")
    pepeDos.saludar()
    val pepeTres = PersonaDos()

    pepeTres.saludar()



}