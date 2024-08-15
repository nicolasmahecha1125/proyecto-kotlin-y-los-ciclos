package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 7 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema7()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema7() {
    // Desarrolle aquí la lógica
    println("N:")
    var N = readln().toInt()
    var s = 1
    if (N>0){
        for (i in 1..N){
            s+=i*i*i
        }
        println("s = ${s-1}")

    }else{
        println("Error")
    }

}