package com.hectortellobalaguer.apuntes


class MiClase {
    var miPropiedad: String = "Mierda"
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





