package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 1 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema1()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema1() {
    // Desarrolle aquí la lógica
    println("Ingresa N:")
    var N = readln().toInt()
    var s = 1
    while (N >= s*s) {
        print("${s*s} ")
        s++
    }
}