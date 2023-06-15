package be.technifutur.decouvertekotlin.designPattern.decorator

import be.technifutur.decouvertekotlin.designPattern.strategie.Colvert
import be.technifutur.decouvertekotlin.designPattern.strategie.ICanard

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