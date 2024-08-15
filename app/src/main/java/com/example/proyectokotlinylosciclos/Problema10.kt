package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 10 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema10()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema10() {
    // Desarrolle aquí la lógica
    println("n:")
    var n = readln().toInt()
    var p = "0"
    var s = ""
    if (n>0 && n<10){
        for (i in 1..n){
            p=(i).toString()
            s+= p
            println(s)
        }

        }else{
            println("Error")
    }

}