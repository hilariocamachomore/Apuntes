package com.hectortellobalaguer.apuntes


class MiClase {
    var miPropiedad: String = "Hola"
        get() = field // Getter personalizado (opcional)
        set(value) { // Setter personalizado (opcional)
            // Lógica del setter
            field = value
        }
}

class MiClasePublica {
    var miPropiedadPublica: Int = 0
        get() = field + 1 // Getter personalizado
        set(value) {
            field = if (value >= 0) value else 0 // Setter personalizado
        }
}

fun pruebasGetterSetter() {
    val objMiClase: MiClase = MiClase()
    println(objMiClase.miPropiedad)
    objMiClase.miPropiedad = "Hola Mundo"
    println(objMiClase.miPropiedad)

    val obj = MiClasePublica()
    println(obj.miPropiedadPublica) // Acceso público (llama al getter)
    obj.miPropiedadPublica = -5 // Acceso público (llama al setter)
    println(obj.miPropiedadPublica)
}

class MiClasePrivada {
    private var miPropiedadPrivada: String = "Valor inicial"
        get() = field.uppercase() // Getter personalizado
        set(value) {
            field = value.trim() // Setter personalizado
        }

    fun mostrarPropiedad() {
        println(miPropiedadPrivada) // Acceso permitido dentro de la clase
    }
    fun modificarPropiedad(nuevoValor: String) {
        miPropiedadPrivada = nuevoValor // Acceso permitido dentro de la clase
    }
}

fun pruebasGetterSetter2() {
    val obj = MiClasePrivada()
    // println(obj.miPropiedadPrivada) // Error: Acceso no permitido desde fuera
    obj.mostrarPropiedad()
    //obj.miPropiedadPrivada = " Nuevo valor" //Error:Acceso no permitido desde fuera
    obj.modificarPropiedad("      Nuevo valor")
    obj.mostrarPropiedad()

}

open class ClaseBase {
    protected var miPropiedadProtegida: Boolean = false
        get() = !field // Getter personalizado
        set(value) {
            field = value // Setter personalizado
        }
}

class SubClase : ClaseBase() {
    fun modificarPropiedad() {
        miPropiedadProtegida = true // Acceso permitido desde la subclase
    }

    fun mostrarPropiedad() {
        println(miPropiedadProtegida)
    }
}

fun pruebasGetterSetter3() {
    val objBase = ClaseBase()
    // println(objBase.miPropiedadProtegida) // Error: Acceso no permitido desde fuera de la clase base o subclases

    val objSub = SubClase()
    objSub.modificarPropiedad()
    objSub.mostrarPropiedad()
}


class MiClaseControlada {
    var miPropiedad: Int = 0
        get() = field
        private set(value) { // Setter privado
            if (value >= 0) {
                field = value
            }
        }

    fun modificarPropiedad(nuevoValor: Int) {
        miPropiedad = nuevoValor // Acceso al setter privado desde dentro de la clase
    }
}

fun pruebasGetterSetter4() {
    val obj = MiClaseControlada()
    println(obj.miPropiedad) // Acceso al getter público
    // obj.miPropiedad = -5 // Error: Setter privado, no accesible desde fuera
    obj.modificarPropiedad(10) // Llama al método que usa el setter privado
    println(obj.miPropiedad)
}

//class Personaje(var nombre: String, var edad: Int) {
//    var nombre: String = nombre
//        get() = field.trim() // Getter personalizado: elimina espacios en blanco
//        set(value) {
//            field = value.capitalize() // Setter personalizado: capitaliza el nombre
//        }
//
//    var edad: Int = edad
//        set(value) {
//            field = if (value >= 0) value else 0 // Setter personalizado: valida la edad
//        }
//}

class Personaje(nombreInicial: String, edadInicial: Int) {
    var nombre: String = nombreInicial
        get() = field.trim()
        set(value) {
            field = value + "personaje"
        }

    var edad: Int = if (edadInicial >= 0) edadInicial else 0
        set(value) {
            field = if (value >= 0) value else 0
        }
}

fun pruebasGetterSetter5() {
    val persona = Personaje("  juan pérez  ", -5)
    println(persona.nombre) // Salida: Juan pérez (getter: sin espacios, setter: capitalizado)
    println(persona.edad)   // Salida: 0 (setter: validación, no puede ser negativa)

    persona.nombre = "  maría  garcía  "
    persona.edad = 25
    println(persona.nombre) // Salida: María  garcía (getter: sin espacios, setter: capitalizado)
    println(persona.edad)   // Salida: 25
}

class Circulo(val radio: Double) {
    val area: Double
        get() = Math.PI * radio * radio // Getter personalizado: calcula el área
}

fun pruebasGetterSetter6() {
    val circulo = Circulo(5.0)
    println(circulo.radio) // Salida: 5.0 (getter predeterminado)
    println(circulo.area)  // Salida: 78.53981633974483 (getter personalizado)
    // circulo.radio = 10.0 // Error: radio es inmutable (val)
}

class Producto(val nombre: String, var precio: Double) {
    val nombreFormateado: String
        get() = nombre.uppercase() // Getter personalizado para nombre

    var precioConDescuento: Double = precio
        get() = if (field < precio) field else precio // Getter personalizado para precioConDescuento
        set(value) {
            field = if (value >= 0) value else 0.0 // Setter personalizado para precioConDescuento
        }
}

fun pruebasGetterSetter7() {
    val producto = Producto("Camiseta", 25.0)
    println(producto.nombre)           // Salida: Camiseta (getter predeterminado)
    println(producto.nombreFormateado) // Salida: CAMISETA (getter personalizado)
    println(producto.precio)           // Salida: 25.0 (getter predeterminado)
    println(producto.precioConDescuento) // Salida: 25.0 (getter personalizado)

    producto.precioConDescuento = 20.0
    println(producto.precioConDescuento) // Salida: 20.0 (getter personalizado)

    producto.precioConDescuento = 30.0 // No aplica el descuento porque es mayor que el precio original
    println(producto.precioConDescuento) // Salida: 25.0 (getter personalizado)
}

fun main() {

//    pruebasGetterSetter()
//    pruebasGetterSetter2()
//    pruebasGetterSetter3()
//    pruebasGetterSetter4()
//    pruebasGetterSetter5()
//    pruebasGetterSetter6()
    pruebasGetterSetter7()

}





