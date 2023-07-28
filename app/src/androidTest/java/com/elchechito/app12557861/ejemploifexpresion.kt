package com.elchechito.app12557861

fun main() {
    println("ingrese numero1")
    val numero1= readln().toInt()
    println("ingrese numero2")
    val numero2= readln().toInt()
    val mayor=if(numero1>numero2)numero1 else numero2
    println("el mayor entre $numero1 y $numero2 es : $mayor")

}