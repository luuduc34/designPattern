package be.technifutur.decouvertekotlin.designPattern.defis1

import be.technifutur.decouvertekotlin.designPattern.Colvert
import be.technifutur.decouvertekotlin.designPattern.superCanard.ICanard

interface INommable {
    val name :String
}

interface ICanardNommable : ICanard, INommable

class CanardNommableFactory{
    fun createColvert(nom:String):ICanardNommable{
        return CanardNommable(nom, Colvert())
    }
}

fun main() {
    val monCanard = CanardNommableFactory().createColvert("toto")

    println(monCanard.name)
    println(monCanard.effectuerCancan())
}