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

const val FIRST_NUMBER = 1
const val LAST_NUMBER = 100

private fun main() {
    renderPrime(Random.nextInt(FIRST_NUMBER, LAST_NUMBER))
}

private fun renderPrime(input: Int) {
    val totalOfNumbers = FIRST_NUMBER..LAST_NUMBER

    println("1ª part: Guess if its prime")

    if (isPrime(input)) {
        println("****** Is prime: $input")
    } else {
        println("Number $input is not prime")
    }

    println("2ª part: Print prime numbers from 1 to 100")
    totalOfNumbers.forEach {
        if (isPrime(it)) {
            print("$it ")
        }
    }
}

private fun isPrime(number: Int): Boolean {
    for (i in number - 1 downTo 2) {
        if (number % i == 0) {
            return false
            // break
        }
    }
    return true
}