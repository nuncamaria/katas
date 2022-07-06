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

    isAnagram("roma", "amor")

}

fun isAnagram(firstWord: String, secondWord: String): Boolean {

    if (firstWord.length == secondWord.length) {

    }

    return true
}
