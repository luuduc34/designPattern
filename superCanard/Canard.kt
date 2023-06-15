package be.technifutur.decouvertekotlin.designPattern.superCanard

interface ICanard {
    fun afficher(): Unit
    fun nager(): String
    fun effectuerVol() : String
    fun effectuerCancan() : String
}
abstract class Canard(var comportementCancan: ComportementCancan, var comportementVol: ComportementVol) : ICanard {


    override fun nager(): String {
        return "Plouf Plouf"
    }

    override fun afficher() {

    }

    override fun effectuerCancan(): String {
        return comportementCancan.cancaner()
    }

    override fun effectuerVol(): String {
        return comportementVol.voler()
    }


}