package com.hectortellobalaguer.apuntes.ejercicios.examenes

import java.time.LocalDate
import java.time.Period

class Persona(var nombre: String, private var dni: String, fechaEntrada: LocalDate) {

    // Propiedad para la fecha con la lógica de validación
    var fechaNacimiento: LocalDate

    // BLOQUE INIT: Se ejecuta siempre después del constructor principal
    init {
        val fechaMinima = LocalDate.of(1900, 1, 1)

        // Si la fecha es anterior a 1900, se queda con 1900, si no, usa la introducida
        if (fechaEntrada.isBefore(fechaMinima)) {
            this.fechaNacimiento = fechaMinima
        } else {
            this.fechaNacimiento = fechaEntrada
        }
    }

    // CONSTRUCTOR SECUNDARIO: Se usa cuando no se dispone de fecha de nacimiento
    // Llama al principal (this) y pasa la fecha por defecto: 1 de enero de 2000
    constructor(nombre: String, dni: String) : this(nombre, dni, LocalDate.of(2000, 1, 1))

    // Método para imprimir los datos (necesario ya que el DNI es privado)
    fun mostrarInfo() {
        println("Nombre: $nombre | DNI: [PRIVADO] | Fecha: $fechaNacimiento")
    }

    // Si necesitas ver el DNI con permiso de la clase:
    fun mostrarDniSeguro() {
        println("El DNI de $nombre es: $dni")
    }


    // --- NUEVO MÉTODO: Calcular Edad ---
    fun calcularEdad(): Int {
        val hoy = LocalDate.now()
        // Period.between calcula la diferencia en años, meses y días
        return Period.between(this.fechaNacimiento, hoy).years
    }

    // --- NUEVO MÉTODO: Verificar DNI ---
    fun verificarDni(): Boolean {
        // 1. Verificamos que tenga 9 caracteres (8 números + 1 letra)
        if (dni.length != 9) return false

        // 2. Extraemos la parte numérica y la letra
        val numeroParte = dni.substring(0, 8)
        val letraDada = dni.last().uppercaseChar()

        // 3. Comprobamos que los primeros 8 sean dígitos
        val numero = numeroParte.toIntOrNull() ?: return false

        // 4. Lógica del algoritmo del DNI (Resto de dividir por 23)
        val letrasValidas = "TRWAGMYFPDXBNJZSQVHLCKE"
        val letraCorrecta = letrasValidas[numero % 23]

        return letraDada == letraCorrecta
    }
}

// --- Función Principal de Pruebas ---
fun main() {
    println("--- PRUEBAS DE LA CLASE PERSONA ---")

    // 1. Caso Normal: Usando constructor principal con fecha válida
    val p1 = Persona("Carlos Ruiz", "12345678X", LocalDate.of(1985, 6, 20))
    print("Persona 1 (Normal): ")
    p1.mostrarInfo()
    println("Edad de p1: ${p1.calcularEdad()} años")
    val esValido = if (p1.verificarDni()) "SÍ" else "NO"
    println("¿Es el DNI de p1 correcto?: $esValido")


    // 2. Caso Sin Fecha: Usando constructor secundario (debe poner año 2000)
    val p2 = Persona("Marta Sanz", "87654321Y")
    print("Persona 2 (Sin fecha): ")
    p2.mostrarInfo()

    // 3. Caso Fecha Antigua: Usando fecha anterior a 1900 (debe poner 1900)
    val p3 = Persona("Abuelo", "11111111H", LocalDate.of(1850, 5, 10))
    print("Persona 3 (Fecha < 1900): ")
    p3.mostrarInfo()

    // 4. Prueba de Privacidad:
    // println(p1.dni) // ERROR DE COMPILACIÓN: 'dni' is private
    println("Privacidad: No se puede acceder a p1.dni directamente desde el main.")
}