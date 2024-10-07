package com.hectortellobalaguer.apuntes

fun main() {
    var numero:Int = 45
    var cadena:String ="654"
    var bandera:Boolean = true
    var decimal:Double = 34.789
    var caracter:Char = '4'

    // Conversion a Entero
    numero = cadena.toInt()
    println(numero)
    numero = decimal.toInt()
    println(numero)
    numero = caracter.toInt()
    println(numero)

    // Conversion a Cadena
    cadena = numero.toString()
    println(cadena)
    cadena = bandera.toString()
    println(cadena)
    cadena = decimal.toString()
    println(cadena)
    cadena = caracter.toString()
    println(cadena)

    // Conversion a Double
    decimal = numero.toDouble()
    println(decimal)
    decimal = cadena.toDouble()
    println(decimal)
    decimal = caracter.toDouble()
    println(decimal)

}