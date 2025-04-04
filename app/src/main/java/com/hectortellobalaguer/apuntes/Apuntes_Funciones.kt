package com.hectortellobalaguer.apuntes

fun main() {
    printMesage("Hello amigüito querido")
    printMessageWithPrefix("Hellooooooooooooo", "Log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    println(sum(6,77))
    println(multiply(547,4))


}

fun printMesage(message: String) {
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun multiply(x: Int, y: Int) = x * y



