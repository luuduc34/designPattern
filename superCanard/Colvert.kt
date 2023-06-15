package be.technifutur.decouvertekotlin.designPattern.superCanard

class Colvert:Canard(Cancan(), VolerAvecDesAiles()), ICanard {
    override fun afficher() {
        println("vol")
    }
}