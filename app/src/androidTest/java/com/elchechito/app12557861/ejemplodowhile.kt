package com.elchechito.app12557861

fun main() {
     do {
         println("iingrese un numero entero entre 0 y 999")
         val numero= readln().toInt()
         if (numero<10){
             println("el numero tiene 1 digito")

         }else if (numero<100){
             println("el numero tiene 2 digitos ")

         }else{
             println("el numero tiene 3 digitos ")
         }
     } while ( numero !=0)
}