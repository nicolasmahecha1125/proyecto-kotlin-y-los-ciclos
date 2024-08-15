package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 9 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema9()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema9() {
    // Desarrolle aquí la lógica
    println("n:")
    var n = readln().toInt()
    var f = 1
    var p = 0
    if (n>0){
        for (i in 1..n){
            f*= i
            p+=f

        }
        println("s = $p")
    }else{
        println("Error")
    }

}