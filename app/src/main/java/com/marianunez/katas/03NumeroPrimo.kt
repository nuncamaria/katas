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

private fun main() {
    isPrime(57)
}

private fun isPrime(input: Int = Random.nextInt(1, 100)) {
    println("Output 1: $input")

    val listOfNumbers = listOf(FIRST_NUMBER..input)
    for (eachNumber in listOfNumbers) {
        println("Output 2: $eachNumber")
        eachNumber.map {
            println(it)
            println(calc(it, eachNumber))
        }
    }
}

fun calc(a: Int, b: IntRange) {
    b.map {
        if (a % it == 0) {
            println("Output 3: Este número: $a se puede dividir entre $it")
        }
    }
}

