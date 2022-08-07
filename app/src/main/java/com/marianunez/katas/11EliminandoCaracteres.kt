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

    val out1 = mutableSetOf<String>()
    val out2 = mutableSetOf<String>()

    str1.splitToSequence("").map {
        if (str2.contains(it).not()) {
            out1.add(it)
        }
    }.toSet()

    str2.splitToSequence("").map {
        if (str1.contains(it).not()) {
            out2.add(it)
        }
    }.toSet()

    println("Estos elementos están en la str1 pero no están en la str2: $out1")
    println("Estos elementos están en la str2 pero no están en la str1: $out2")
}