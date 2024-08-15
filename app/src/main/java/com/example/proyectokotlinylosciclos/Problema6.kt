package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 6 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema6()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema6() {
    // Desarrolle aquí la lógica
    println("A:")
    var A = readln().toInt()
    println("B:")
    var B = readln().toInt()
    if (A<B || A==B){
        for (i in A..B){
            print("$i ")
        }
    }else{
        for (i in B.. A){
            print("${A - (i-1)} ")

        }
    }


}