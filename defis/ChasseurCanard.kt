package be.technifutur.decouvertekotlin.designPattern.defis

import be.technifutur.decouvertekotlin.designPattern.Mandarin
import be.technifutur.decouvertekotlin.designPattern.Canard

class ChasseurCanard {
}

fun main() {

    val chasseur = Chasseur()
    val canard: Canard = Mandarin()


    chasseur.tirer(Solution(canard))
}