package com.hectortellobalaguer.apuntes

import java.io.File

fun main() {

    creaYEscribeArchivo()
//    añadeAlArchivo()
//    leeArchivo()
//    leeLinea()
//    leeArchivoControlErrores()

}

fun creaYEscribeArchivo() {
    val file = File("C:/PRUEBAS/mi_archivo.txt")
    file.writeText("Este es el contenido que se escribirá en el archivo.\n")
}

fun añadeAlArchivo() {
    val file = File("C:/PRUEBAS/mi_archivo.txt")
    file.appendText("Añado una linea al final del archivo.")
}

fun leeArchivo() {
    val file = File("C:/PRUEBAS/mi_archivo.txt")
    val contenido = file.readText()
    println("El conenido completo es " + contenido)
}

fun leeLinea() {
    val file = File("C:/PRUEBAS/mi_archivo.txt")
    val lines = file.readLines()
    println("El contenido linea a linea es :")
    for (line in lines) {
        println(line)
    }
}

fun leeArchivoControlErrores() {
    try{
        val file = File("C:/PRUEBAS/mi_archivo.txt")
        val contenido = file.readText()
        println("El conenido completo es " + contenido)
    }catch (e: Exception){
        println("Hubo un error al leer el mensaje " + e.message)
    }

}