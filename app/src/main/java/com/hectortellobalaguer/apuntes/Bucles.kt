package com.hectortellobalaguer.apuntes

fun main(){
    alternativas()
    repetitivas()
}

fun alternativas(){
    println("Sentencias alternativas")
}
fun repetitivas(){

    var cakesEaten = 0
    var cakesBaked = 0

    println("BUCLE WHILE")
    while (cakesEaten < 5) {
        println("eat a cake")
        cakesEaten ++
    }

    println("BUCLE DO..WHILE")
    do {
        println("bake a cake")
        cakesBaked++
    } while (cakesBaked < cakesEaten)

    println("BUCLE FOR")
    for(i in 0..3) {
        print(i)
    }
    print(" ")

    for(i in 0 until 3) {
        print(i)
    }
    print(" ")

    for(i in 2..8 step 2) {
        print(i)
    }
    print(" ")

    for (i in 3 downTo 0) {
        print(i)
    }
    print(" ")

    println("BUCLE for para caracteres")
    for (c in 'a'..'d') {
        print(c)
    }
    print(" ")

    for (c in 'z' downTo 's' step 2) {
        print(c)
    }
    print(" ")


}

