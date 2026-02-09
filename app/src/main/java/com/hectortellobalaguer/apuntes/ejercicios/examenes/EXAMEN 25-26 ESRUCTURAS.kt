package com.hectortellobalaguer.apuntes.ejercicios.examenes

fun sumarNumerosPares(numeros: List<Int>): Int {
    // Filtramos la lista para quedarnos solo con los números pares (it % 2 == 0)
    // y luego sumamos los elementos de la lista resultante.
    return numeros.filter { it % 2 == 0 }.sum()
}

fun elementosUnicosOrdenados(elementos: List<String>): List<String> {
    // Convierte la lista a un Set para eliminar duplicados automáticamente.
    // Luego, `sorted()` devuelve una nueva lista con los elementos ordenados.
    return elementos.toSet().sorted()
}

fun contarFrecuenciaDePalabras(palabras: List<String>): Map<String, Int> {
    // `groupingBy` agrupa los elementos por sí mismos ('it').
    // `eachCount()` cuenta las ocurrencias en cada grupo, devolviendo un Map.
    return palabras.groupingBy { it }.eachCount()
}

fun main() {


    println("--- Probando Ejercicio 1: Suma de Números Pares")
    val lista1 = listOf(1, 2, 3, 4, 5, 6)
    println("Suma de pares en $lista1: ${sumarNumerosPares(lista1)} (Esperado: 12)")
    val lista2 = listOf(10, 21, 30, 43)
    println("Suma de pares en $lista2: ${sumarNumerosPares(lista2)} (Esperado: 40)")
    val lista3 = listOf(1, 3, 5, 7)
    println("Suma de pares en $lista3: ${sumarNumerosPares(lista3)} (Esperado: 0)")
    println("----------------------------------------------------\n")

    println("--- Probando Ejercicio 2: Elementos Únicos Ordenados")
    val palabras1 = listOf("manzana", "pera", "platano", "manzana", "uva")
    println("Únicos y ordenados de $palabras1: ${elementosUnicosOrdenados(palabras1)} (Esperado: [manzana, pera, platano, uva])")
    val palabras2 = listOf("coche", "moto", "coche", "bici", "avion")
    println("Únicos y ordenados de $palabras2: ${elementosUnicosOrdenados(palabras2)} (Esperado: [avion, bici, coche, moto])")
    println("----------------------------------------------------------\n")

    println("--- Probando Ejercicio 3: Contador de Palabras")
    val texto1 = listOf("hola", "mundo", "hola", "kotlin", "hola")
    println("Frecuencia en $texto1: ${contarFrecuenciaDePalabras(texto1)} (Esperado: {hola=3, mundo=1, kotlin=1})")
    val texto2 = listOf("a", "b", "c", "a", "b", "a")
    println("Frecuencia en $texto2: ${contarFrecuenciaDePalabras(texto2)} (Esperado: {a=3, b=2, c=1})")
    println("--------------------------------------------------")

}
