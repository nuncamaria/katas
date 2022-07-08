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

private fun main() = isPrime()

private fun isPrime(input: Int = Random.nextInt(FIRST_NUMBER, LAST_NUMBER)) {
    val listOfNumbers = FIRST_NUMBER..input
    listOfNumbers.map { number ->
        calc(number, listOfNumbers)
    }
}

fun calc(a: Int, b: IntRange) {
    var counter = 0
    b.map {
        if (a % it == 0) {
            counter++
        }
    }

    if (counter == 2) {
        println("El número $a es primo")
    } else {
        println("El número $a no es primo")
    }
}