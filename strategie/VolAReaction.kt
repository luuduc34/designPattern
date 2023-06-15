package be.technifutur.decouvertekotlin.designPattern.strategie

class VolAReaction: ComportementVol {
    override fun voler(): String {
        return "Voler à réaction"
    }
}