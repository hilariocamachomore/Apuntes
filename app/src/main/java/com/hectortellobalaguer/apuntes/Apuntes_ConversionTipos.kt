package com.hectortellobalaguer.apuntes

fun main() {
    var numero:Int = 45
    var cadena:String ="654"
    var bandera:Boolean = true
    var decimal:Double = 34.789
    var caracter:Char = '4'

    println("Conversion a Entero")
    numero = cadena.toInt()
    println(numero)
    numero = decimal.toInt()
    println(numero)
    numero = caracter.toInt()
    println(numero)

    numero = 45
    cadena ="654"
    bandera = true
    decimal = 34.789
    caracter = '4'

    println("Conversion a Cadena")
    cadena = numero.toString()
    println(cadena)
    cadena = bandera.toString()
    println(cadena)
    cadena = decimal.toString()
    println(cadena)
    cadena = caracter.toString()
    println(cadena)

    numero = 45
    cadena ="654"
    bandera = true
    decimal = 34.789
    caracter = '4'

    println("Conversion a Double")
    decimal = numero.toDouble()
    println(decimal)
    decimal = cadena.toDouble()
    println(decimal)
    decimal = caracter.toDouble()
    println(decimal)

}