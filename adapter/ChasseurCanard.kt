package be.technifutur.decouvertekotlin.designPattern.adapter

import be.technifutur.decouvertekotlin.designPattern.strategie.Canard
import be.technifutur.decouvertekotlin.designPattern.strategie.Mandarin

class ChasseurCanard {
}

fun main() {

    val chasseur = Chasseur()
    val canard: Canard = Mandarin()


    chasseur.tirer(Solution(canard))
}