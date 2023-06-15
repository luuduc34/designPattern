package be.technifutur.decouvertekotlin.designPattern.strategie

class Leurre: Canard(CanardMuet(), NePasVoler()) {
    override fun afficher() {
        println("Leurre")
    }
}