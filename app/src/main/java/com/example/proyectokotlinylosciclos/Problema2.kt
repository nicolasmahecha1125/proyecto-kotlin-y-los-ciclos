package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 2 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema2()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema2() {
    // Desarrolle aquí la lógica
    println("Ingresa x:")
    var x = readln().toDouble()
    println("Ingresa y:")
    var y = readln().toShort()
    var d = 1
    while(x < y){
        x=x+x*0.1
        d++
    }
    println("Necesitas $d días para correr bien los $y Km")

}