package com.hectortellobalaguer.apuntes.ejercicios.examenes

import java.util.ArrayDeque
//import kotlin.collections.removeFirstOrNull

// --- Ejercicio 1: Solución ---
fun filtrarTareasPorEstado(tareas: List<Map<String, String>>, estado: String): List<Map<String, String>> {
    // Usamos 'filter' para iterar sobre la lista.
    // Para cada tarea (que es un mapa), comprobamos si el valor de la clave "estado" es el que buscamos.
    return tareas.filter { it["estado"] == estado }
}

// --- Ejercicio 2: Solución ---
fun contarNumVecesPalabras(palabras: List<String>): Map<String, Int> {
    // `groupingBy` agrupa los elementos por sí mismos ('it').
    // `eachCount()` cuenta las ocurrencias en cada grupo, devolviendo un Map.
    // Es la forma más idiomática y concisa en Kotlin.
    return palabras.groupingBy { it }.eachCount()
}

fun procesarColaImpresion(acciones: List<String>) {
    // ArrayDeque es una implementación eficiente de una cola en Kotlin.
    val cola = ArrayDeque<String>()
    println("--- Iniciando simulación de cola de impresión ---")

    for (accion in acciones) {
        if (accion.equals("IMPRIMIR", ignoreCase = true)) {
            // 1. Comprobamos si la cola NO está vacía antes de intentar sacar algo.
            if (cola.isNotEmpty()) {
                // 2. Si no está vacía, usamos removeFirst() para sacar el primer elemento.
                //    Estamos seguros de que no dará error porque acabamos de comprobar que hay algo.
                val documentoAImprimir = cola.removeFirst()
                println("🖨️ Imprimiendo: $documentoAImprimir. Documentos restantes: ${cola.size}")
            } else {
                // Si la cola está vacía, lo indicamos.
                println("✔️ La cola de impresión está vacía.")
            }
        } else {
            // Añadimos un nuevo documento al final de la cola.
            cola.addLast(accion)
            println("📄 Añadido a la cola: $accion. Documentos en cola: ${cola.size}")
        }
    }
    println("--- Simulación finalizada ---")
}



// --- Función Principal con Casos de Prueba ---
fun main() {
    println("### Probando Ejercicio 1: Gestión de Tareas (con Mapas) ###")
    val listaDeTareas = listOf(
        mapOf("id" to "1", "descripcion" to "Hacer la compra", "estado" to "completada"),
        mapOf("id" to "2", "descripcion" to "Estudiar Kotlin", "estado" to "en_progreso"),
        mapOf("id" to "3", "descripcion" to "Sacar al perro", "estado" to "pendiente"),
        mapOf("id" to "4", "descripcion" to "Limpiar la habitación", "estado" to "pendiente")
    )
    val tareasPendientes = filtrarTareasPorEstado(listaDeTareas, "pendiente")
    println("Tareas pendientes: $tareasPendientes")
    println("(Esperado: [ {id=3, ...}, {id=4, ...} ])")
    println("----------------------------------------------------\n")

    println("### Probando Ejercicio 2: Contador de Frecuencia de Palabras ###")
    val texto1 = listOf("hola", "mundo", "hola", "kotlin", "hola")
    println("Frecuencia en $texto1: ${contarNumVecesPalabras(texto1)} (Esperado: {hola=3, mundo=1, kotlin=1})")
    val texto2 = listOf("a", "b", "c", "a", "b", "a")
    println("Frecuencia en $texto2: ${contarNumVecesPalabras(texto2)} (Esperado: {a=3, b=2, c=1})")
    println("----------------------------------------------------------\n")

    println("### Probando Ejercicio 3: Cola de Impresión ###")
    val secuenciaDeAcciones = listOf(
        "informe.docx",
        "foto_vacaciones.jpg",
        "IMPRIMIR",
        "presentacion.pptx",
        "IMPRIMIR",
        "IMPRIMIR",
        "IMPRIMIR"
    )
    procesarColaImpresion(secuenciaDeAcciones)
    println("----------------------------------------------------")
}
