package com.module05.myfirstappkotlin

fun main() {

    val ninos = 15000
    val adultos = 30000
    val mayores = 20000
    val diasSemana = arrayOf("lunes","martes")

    try {
        println("Ingrese su edad:")
        val n = readln().toInt()
        println("Ingresa el día de la semana")
        val dia = readln()

        when(n){
            in 0..4 -> println("No paga entrada")
            in 5..15 -> println("El valor de la entrada es de $ninos")
            in 16..60 -> {
                if(diasSemana.contains(dia.toLowerCase())){
                    println("El valor de la entrada es de ${adultos-5000}")
                }else{
                    println("El valor de la entrada es de $adultos")
                }
            }
            in 61..100 -> println("El valor de la entrada es de $mayores")
            else -> println("La edad ingresada no está en el rango 0 - 100")
        }

    }catch (e: NumberFormatException){
        println("Error: ingresa un dato valido - $e")
    }
}