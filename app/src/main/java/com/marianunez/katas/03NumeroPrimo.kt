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
var counter = 0

private fun main() {
    renderPrime(Random.nextInt(FIRST_NUMBER, LAST_NUMBER))
}

private fun renderPrime(input: Int) {
    val rangeOfNumbers = FIRST_NUMBER..input
    val totalOfNumbers = FIRST_NUMBER..LAST_NUMBER

    println("1ª part: Check if a number is prime or not")
    countPrimes(input, rangeOfNumbers)
    println("-")
    println("2ª part: Print prime numbers from 1 to 100")
    totalOfNumbers.forEach { countAllPrimes(it, totalOfNumbers) }
}

private fun countPrimes(number: Int, rangeOfNumbers: IntRange) {
    counter = 0 // el counter checkea las veces que, dividiendo el número, su resto da 0
    rangeOfNumbers.forEach { if (number % it == 0) counter++ }

    if (counter == 2) {
        println("****** Is prime: $number")
    } else println("Number $number is not prime")
}

private fun countAllPrimes(number: Int, rangeOfNumbers: IntRange) {
    counter = 0
    rangeOfNumbers.forEach { if (number % it == 0) counter++ }

    if (counter == 2) print("$number ")
}
