package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 4 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema4()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema4() {
    // Desarrolle aquí la lógica
    println("n:")
    var n = readln().toInt()
    var s = n
    var p = 1
    while(n != 0){
        if (s<n ){
            p++
            s=n
        }

        println("n:")
        n = readln().toInt()

    }
    println("Posición del mayor = $p")

}