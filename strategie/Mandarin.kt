package be.technifutur.decouvertekotlin.designPattern.strategie

class Mandarin: Canard(Cancan(), VolerAvecDesAiles()) {
    override fun afficher() {
        println("Mandarin")
    }
}