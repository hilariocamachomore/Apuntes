package com.hectortellobalaguer.apuntes.ejercicios

fun main() {
    Mapas_01_traductor()
    Mapas_02_notas()
    Mapas_03_libro()
}

fun Mapas_01_traductor() {
    val diccionario = mapOf(
        "hola" to "hello",
        "adiós" to "goodbye",
        "gracias" to "thank you",
        "por favor" to "please",
        "sí" to "yes"
    )

    println("Diccionario completo:")
    println(diccionario)

    println("Introduce una palabra en español:")
    val palabra = readLine()?.lowercase() ?: ""

    if (diccionario.containsKey(palabra)) {
        println("La traducción de '$palabra' es '${diccionario[palabra]}'")
    } else {
        println("La palabra '$palabra' no está en el diccionario.")
    }
    println("--------------------------------------------------")
}

fun Mapas_02_notas() {
    val notasAlumnos = mapOf(
        "Ana" to listOf(7.5, 8.0, 9.0),
        "Juan" to listOf(6.0, 7.0, 5.5),
        "María" to listOf(9.5, 10.0, 8.5),
        "Pedro" to listOf(5.0, 6.5, 7.0),
        "Laura" to listOf(8.0, 8.5, 9.0)
    )

    println("Notas de los alumnos:")
    notasAlumnos.forEach { (alumno, notas) ->
        val media = notas.average()
        println("La nota media de $alumno es: $media")
    }
    println("--------------------------------------------------")
}

fun Mapas_03_libro() {
    val libros = mapOf(
        "El Señor de los Anillos" to 1200,
        "Cien años de soledad" to 400,
        "1984" to 350,
        "Don Quijote de la Mancha" to 1000,
        "Orgullo y prejuicio" to 450
    )

    println("Lista original de libros:")
    println(libros)

    println("Introduce el número mínimo de páginas:")
    val paginasMinimas = readLine()?.toIntOrNull() ?: 0

    val librosFiltrados = libros.filter { (_, numPaginas) -> numPaginas >= paginasMinimas }

    println("Libros con al menos $paginasMinimas páginas:")
    println(librosFiltrados)
    println("--------------------------------------------------")
}