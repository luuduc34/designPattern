package be.technifutur.decouvertekotlin.designPattern.strategie

class CanardEnPlastique : Canard(Coincoin(), NePasVoler()) {
    override fun afficher() {
        println("Canard en plastique")
    }
}