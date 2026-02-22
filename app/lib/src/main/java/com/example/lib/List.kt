package com.example.lib

fun main(){
    /*
    * Dada un lita d numeros desordenados, encuentra e imprime cul es el
    * numero mas grande SIN usar la funcion MAX
    * */

    val numbers=listOf(1,4,4,3,2,6,7,8,9,10,23,23,12)
    val numeroX = numbers [2]
    var maxNumber=numbers[0]
    for (number in numbers){
        if (number > maxNumber){
            maxNumber = number
        }
    }
    println("el numero mas rande es $maxNumber")
}