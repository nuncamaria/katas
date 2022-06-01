package com.marianunez.katas

/*
 * Challenge #00
 * "FIZZ BUZZ"
 * Dificultad: FÁCIL
 * Enunciado: Escribe un programa que muestre por consola (con un print) los números de 1 a 100 (ambos incluidos y con un salto de línea entre cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */

fun main() {
//  val numberList = (1).rangeTo(100).forEach { println(it) }
    (1..100).forEach {

        if (it % 3 == 0 && it % 5 == 0) {
            println("FizzBuzz = $it")
        } else if (it % 3 == 0) {
            println("Fizz = $it")
        } else if (it % 5 == 0) {
            println("Buzz = $it")
        } else {
            println(it)
        }
    }
}