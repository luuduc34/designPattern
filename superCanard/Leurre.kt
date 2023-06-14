package be.technifutur.decouvertekotlin.designPattern.superCanard

class Leurre:Canard(CanardMuet(), NePasVoler()) {
    override fun afficher() {
        println("Leurre")
    }
}