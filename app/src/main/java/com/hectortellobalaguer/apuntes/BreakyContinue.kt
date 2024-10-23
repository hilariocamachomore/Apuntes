package com.hectortellobalaguer.apuntes


fun main() {
//    ejemplo1()
//    ejemplo2()
    ejemplo3()
}

fun ejemplo1() {
    loop@ for (i in 1..10) {
        for (j in 1..10) {
            if (j == 4) break@loop
            println("$i - $j")
        }
    }
}

fun ejemplo2() {

    for (i in 1..4) {
        for (j in 1..4) {
            if (j == 3) break
            println("$i - $j")
        }
    }
}

fun ejemplo3() {

    for (i in 1..4) {
        for (j in 1..4) {
            if (j == 3) continue
            println("$i - $j")

        }
    }
}
