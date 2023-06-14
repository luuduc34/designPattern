package be.technifutur.decouvertekotlin.designPattern.superCanard

class CanardEnPlastique : Canard(Coincoin(), NePasVoler()) {
    override fun afficher() {
        println("Canard en plastique")
    }
}