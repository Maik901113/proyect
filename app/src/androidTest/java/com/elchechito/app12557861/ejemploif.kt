package com.elchechito.app12557861

fun main() {
    println("ingrese el salario del empleado")
    var impuesto:Double=0.0
    var total:Double=0.0
    val salario= readln().toDouble()
    if(salario>=3000000 && salario<=5000000){
        impuesto= 0.1
        total=salario*impuesto
        println("ud debe pagar impuesto en total $total")
    }else if(salario>5000000 ){
        impuesto=0.2
        total=salario*impuesto
        println("ud debe pagar impuesto en total $total")
    }
    else{
        println("ud no paga impuesto")
    }
}