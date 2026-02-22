package com.example.lib

fun main() {
    val name : String="Juan"
    var age : Int=28
    age=29

    //For
    /** *for(int i = 0; i<10 ; i++) {
     * }
     *
     * */
    for (i in 1..10){
        println(i)
    }
    for (i in 100 downTo 0 step 10){
        println(i)
    }

    //Calculadora de propinas..
    /**
     * Crea un programa que tega un precio de comida y un
     * porcentaje de propina.El programa debe imprimir
     * cuantoesdepropins y cunto es el total a pagar
     * */

    //String Interpolaion
    val cost = 500.0
    val porcentaje = 0.15
    val  tip = cost * porcentaje
    val total= cost + tip
    println("El total es  $total de pesos")
    println("La propna es $tip")
 }