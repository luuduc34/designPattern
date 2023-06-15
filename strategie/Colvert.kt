package be.technifutur.decouvertekotlin.designPattern.strategie

class Colvert: Canard(Cancan(), VolerAvecDesAiles()), ICanard {
    override fun afficher() {
        println("vol")
    }
}