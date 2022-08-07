package com.marianunez.katas

/*
 * Challenge #11
 * ELIMINANDO CARACTERES
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que reciba dos cadenas como parámetro (str1, str2) e imprima otras dos cadenas como salida (out1, out2).
 * - out1 contendrá todos los caracteres presentes en la str1 pero NO estén presentes en str2.
 * - out2 contendrá todos los caracteres presentes en la str2 pero NO estén presentes en str1.
 */

private fun main() {
    compareStrings("aasdlqweffa", "alqweffaggg")
}

private fun compareStrings(str1: String, str2: String) {

    val regex = str1.toRegex()

    val out1 = str1.splitToSequence("").map { str2.contains(it) }.toList()
    val out2 = str2.splitToSequence("").map { str1.contains(it) }.toList()

    val matchResult = regex.matchEntire(str2)

    println(out1)
    println(out2)
    println(matchResult)

}