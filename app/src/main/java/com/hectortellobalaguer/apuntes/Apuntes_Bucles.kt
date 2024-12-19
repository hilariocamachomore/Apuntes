package com.hectortellobalaguer.apuntes

fun main(){
    alternativas()
    repetitivas()
}

fun alternativas(){
    println("-----------Sentencias alternativas----------------")
    val a = 10
    val b = 20

    if (a>b) {
        println("a es mayor que b")
    }else if(a<b) {
        println("a es menor que b")
    }else{
        println("a es igual que b")
    }

    when(a) {
        1 -> println("a es 1")
        2 -> println("a es 2")
        3 -> println("a es 3")
        else -> println("a no es 1, 2 o 3")
    }


}
fun repetitivas(){
    println("-----------Sentencias repetitivas----------------")
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

    println("BUCLE FOR para rangos")
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
    println(" ")

    println("BUCLE for para caracteres")
    for (c in 'a'..'d') {
        print(c)
    }
    println(" ")

    for (c in 'z' downTo 's' step 2) {
        print(c)
    }
    println(" ")



}

