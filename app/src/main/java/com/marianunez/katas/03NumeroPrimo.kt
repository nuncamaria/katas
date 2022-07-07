package com.marianunez.katas

import kotlin.random.Random

/*
 * Challenge #3
 * ¿ES UN NÚMERO PRIMO?
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 *
 * Si es 2 es primo
 * Si no es par excepto si es 2, no es primo
 *
 */


private fun main() {
    calcPrimeNumber()
    isPrime()
}

private fun calcPrimeNumber() {
    val listOfNumbers = listOf(0..100)

    listOfNumbers.forEach {
        println(it)
    }
}


private fun isPrime(number: Int = Random.nextInt(0, 100)) {
    if ((number > 2) && (number % 2 == 0)) {
        println("$number no es primo SEGURO")
    } else {
        println("$number quizás es primo")
    }
}