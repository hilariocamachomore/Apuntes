package com.hectortellobalaguer.apuntes

fun main(){
//    listas()
//    conjuntos()
    mapas()
//    vectores()
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

fun conjuntos() {
    val conjuntoDeNumeros = setOf(1, 2, 3, 3)
    println("Conjunto de números: $conjuntoDeNumeros") // Imprime: Conjunto de números: [1, 2, 3]
    println("Tamaño del conjunto: ${conjuntoDeNumeros.size}") // Imprime: Tamaño del conjunto: 3
    println("¿El número 2 está en el conjunto? ${conjuntoDeNumeros.contains(4)}") // Imprime: ¿El número 2 está en el conjunto? true

    val numeros = mutableSetOf(1, 2, 3, 4)
    val letras = setOf('a', 'b', 'c')

    numeros.add(5) // Agrega el número 5 al conjunto
    numeros.remove(3) // Elimina el número 3 del conjunto

    println(numeros.contains(3)) // Imprime: false

    for(letra in letras) {
        println(letra)
    }
}

fun mapas() {
    val capitales = mapOf("España" to "Madrid", "Francia" to "París", "Alemania" to "Berlin")
    println("Capitales: $capitales") // Imprime: Capitales: {España=Madrid, Francia=París, Alemania=Berlin}
    println("Tamaño del mapa: ${capitales.size}") // Imprime: Tamaño del mapa: 3
    for ((pais, capital) in capitales) {
        println("$pais: $capital")

    }
    println("Capital de Francia: ${capitales["Francia"]}") // Imprime: Capital de Francia: París


    val edades = mutableMapOf("Alice" to 25, "Bob" to 30, "Charlie" to 35)
    println("Edades: $edades") // Imprime: Edades: {Alice=25, Bob=30, Charlie=35}
    println("Edad de Bob: ${edades["Bob"]}") // Imprime: Edad de Bob: 30
    println("¿Alice está en el mapa? ${edades.containsKey("Alice")}") // Imprime: ¿Alice está en el mapa? true

    val edadDeAlice = edades.getOrDefault("Alice", 0)
    println("Edad de Alice: $edadDeAlice") // Imprime: Edad de Alice: 25
    edades["Bob"] = 31 // Actualiza la edad de Bob
    edades.remove("Charlie") // Elimina a Charlie del mapa
    edades["David"] = 28 // Agrega a David al mapa

}

fun vectores() {
    val frutas = arrayOf("manzana", "banana", "cereza")
    val ceros = Array(5) { 0 } // Crea un array de enteros de tamaño 5 y lo inicializa con ceros

    val primerafrutav = frutas[0] // Obtiene la primera fruta del array
    frutas[1] = "naranja" // Cambia la segunda fruta
    println("Frutas: ${frutas.contentToString()}") // Imprime: Frutas: [manzana, naranja, cereza]
    println("Tamaño del array: ${frutas.size}") // Imprime: Tamaño del array: 3
    println("¿La fruta está en el array? ${"manzana" in frutas}") // Imprime: ¿La fruta está en el array? true
    println("Índice de la fruta: ${frutas.indexOf("naranja")}") // Imprime: Índice de la fruta: 1
    for (fruta in frutas) {
        println(fruta)
    }
}