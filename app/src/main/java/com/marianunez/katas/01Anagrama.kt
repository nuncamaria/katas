package com.marianunez.katas

/*
 * Challenge #1
 * ¿ES UN ANAGRAMA?
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 */

private fun main() {
    renderAnagram("roma", "amor")
}

private fun renderAnagram(firstWord: String, secondWord: String) {
    if (areEmptyInputs(firstWord, secondWord)) {
        println("Write in both fields!")
        return
    }

    if (isAnagram(firstWord, secondWord)) {
        println("$firstWord and $secondWord is an Anagram")
    } else {
        println("$firstWord and $secondWord is not an Anagram")
    }
}

private fun isAnagram(firstWord: String, secondWord: String): Boolean =
    firstWord == secondWord.reversed()

private fun areEmptyInputs(firstWord: String, secondWord: String) =
    firstWord.isBlank() || secondWord.isBlank()