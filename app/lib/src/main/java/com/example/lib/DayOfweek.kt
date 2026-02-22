package com.example.lib
/*
1,2,3,4,5,6,7
* Escribir un programa que e muestreen consola los dias de la semana
Y si es sabado o dmingo que escriba fin de semana
*/
fun main(){
    val dayOfWeek= 2
    //eso  es para comentar rapido seleccionas y das estos comandos
    //Ctrl K Ctrl C /Cmd K Cmd C (MAC)
    //Ctrl K Ctrl U /Cmd K Cmd U (MAC)
//    if (dayOfWeek == 1){
//        println("Es lunes")
//    }else if (dayOfWeek == 2){
//        println("Es martes")
//    }

    when(dayOfWeek){
        1 ->println("Es lunes")
        2->{
            println("Es martes")
            println("Haciendo cositas")
        }
        3->println("Es miercoles")
        4->println("Es jueves")
        5->println("Es viernes")
        6,7->println("Es fin d semana")
        else -> println("no es u dia de la semana ")

    }
}