package com.marianunez.katas

/*
 * Challenge #8
 * DECIMAL A BINARIO
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa se encargue de transformar un número decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 */

fun main() {
    println(convertToBinary(248))
}

private fun convertToBinary(decimalNumber: Int): String {
    // por una parte necesito un número decimal, que le asignaré a una var
    // porque necesito ir actualizando esa variable y haciendo operaciones con ella
    val binaryNumber = mutableListOf<Int>()
    var updatedNumber: Int = decimalNumber

    while (updatedNumber != 0) {
        val division = updatedNumber / 2
        val module = updatedNumber % 2

        updatedNumber = division
        binaryNumber.add(module)
    }

    return binaryNumber.reversed().joinToString("")
}