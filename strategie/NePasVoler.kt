package be.technifutur.decouvertekotlin.designPattern.strategie

class NePasVoler : ComportementVol {
    override fun voler(): String {
        return "Ne vole pas"
    }
}
