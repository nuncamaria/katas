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



fun main() {
    renderAnagram("roma", "amor")
}

private fun renderAnagram(firstWord: String, secondWord: String) {
    if (firstWord.isNotBlank() && secondWord.isNotBlank()) {
        isAnagram(firstWord, secondWord)
    } else println("Write in both fields!")
}

private fun isAnagram(firstWord: String, secondWord: String): Boolean {
    var flag = false
    val transformedSecondWord = secondWord.split("").reversed().joinToString("")

    if (firstWord == transformedSecondWord) {
        flag = true
        println("$flag - $firstWord and $secondWord is an Anagram")
    } else {
        println("$flag - $firstWord and $secondWord is not an Anagram")
    }
    return flag
}