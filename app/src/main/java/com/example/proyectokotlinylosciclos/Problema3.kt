package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 3 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema3()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema3() {
    // Desarrolle aquí la lógica
    println("n:")
    var n = readln().toInt()
    var s = n
    while(n != 0){
        println("n:")
        n = readln().toInt()
        s=s+n
    }
    println("Suma = $s")

}