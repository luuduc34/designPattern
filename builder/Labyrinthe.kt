package be.technifutur.decouvertekotlin.designPattern.builder

import be.technifutur.decouvertekotlin.designPattern.factory.IElementLabyrinthe

class Labyrinthe<K> {
    val labyMap:MutableMap<K,IElementLabyrinthe> = mutableMapOf()
    override fun toString(): String {
        return "Labyrinthe(labyMap=$labyMap)"
    }

}