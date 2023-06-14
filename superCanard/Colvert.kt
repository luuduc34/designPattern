package be.technifutur.decouvertekotlin.designPattern.superCanard

class Colvert:Canard(Cancan(), VolerAvecDesAiles()) {
    override fun afficher() {
        println("vol")
    }
}