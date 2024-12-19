package com.hectortellobalaguer.apuntes

fun main() {
//   muestraDeVariables()
//    entradaSalidaDatos()
    controlNulos()
//    operadores()

}
fun controlNulos(){
    /*En este procedimiento se van a explicar los operadores de control de nulos*/

    var nombre:String? = null

//    println(nombre.length)
    if(nombre != null){
        println(nombre.length)
    }
}

fun entradaSalidaDatos(){
    //Escribir por consola
    print("Hola")
    println(" como estass")

    println("Hola \n como estass")

    //Leer de teclado
    val nombre = readLine()
    println("Holass $nombre")
    println("Holass " + nombre)
}

fun muestraDeVariables(){

    var varIntExplicito:Int = 100
    var varIntInferido = 214875

    var varLongExplicito:Long = 325684874512
    var varLongInferido = 214875L

    var varFloatExplicito:Float = 3256848745.12F
    var varFloatInferido = 214.875F

    var varDoubleExplicito:Double = 325684874512.5
    var varDoubleInferido = 214875.546523123

    var numeroFavoritoChar: Char = '1'
    var letraFavoritaChar: Char = 'q'
    var caracterFavorito = '@'

    var numeroFavorito: String = "Mi número favorito es el 3"
    var test = "Test. 12345!·$%&/"

    var estoyTriste: Boolean = false
    var estoyFeliz = true

    println("varIntExplicito: $varIntExplicito")
    println("varLongExplicito: $varLongExplicito")
    println("varFloatExplicito: $varFloatExplicito")
    println("varDoubleInferido : $varDoubleInferido")
    println("caracterFavorito : $caracterFavorito")
    println("numeroFavorito : $numeroFavorito")
    println("test : $test")
    println("estoyFeliz : $estoyFeliz")

}

