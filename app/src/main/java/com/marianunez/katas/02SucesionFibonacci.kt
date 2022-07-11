package com.marianunez.katas

/*
 * Challenge #2
 * LA SUCESIÓN DE FIBONACCI
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Escribe un programa que imprima los 50 primeros números de la sucesión de Fibonacci empezando en 0.
 * La serie Fibonacci se compone por una sucesión de números en la que el siguiente siempre es la suma de los dos anteriores.
 * 0, 1, 1, 2, 3, 5, 8, 13...
 */

private fun main() {
    renderFibonacci()
}

// create empty list
// add the first two numbers: 0 y 1
// con eso ya podemos plantear la operación de que los dos últimos se sumen
// que la lista se vaya llenando con esos resultados hasta que llegue a 50

private fun renderFibonacci() {
    val fibonacciNumbers = mutableListOf<Int>()

    calcFibonacci(fibonacciNumbers)
    println(fibonacciNumbers)
}

private fun calcFibonacci(list: MutableList<Int>){
    list.add(0)
    list.add(1)
    var position = 1

    while (list.size <= 50) {
        val fibonacciNumber = list.last() + list[position - 1]
        list.add(fibonacciNumber)
        position++
    }
}