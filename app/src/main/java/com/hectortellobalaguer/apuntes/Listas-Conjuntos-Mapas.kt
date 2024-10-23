package com.hectortellobalaguer.apuntes

fun main(){
    listas()
//    conjuntos()
//    mapas()
}

fun listas() {
    val numbers = mutableListOf(5, 2, 8, 1, 9)

    numbers.add(3) // Agrega el número 3 al final
    numbers.remove(8) // Elimina el número 8
    numbers.sort() // Ordena la lista

    println("Números: $numbers") // Imprime: Números: [1, 2, 3, 5, 9]

    val evenNumbers = numbers.filter { it % 2 == 0 } // Filtra los números pares
    println("Números pares: $evenNumbers") // Imprime: Números pares: [2]
}