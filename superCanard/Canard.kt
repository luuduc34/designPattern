package be.technifutur.decouvertekotlin.designPattern.superCanard

abstract class Canard(var comportementCancan: ComportementCancan, var comportementVol: ComportementVol) {


    fun nager(): String {
return "Plouf Plouf"
    }
    open fun afficher(){

    }

    fun effectuerCancan():String {
        return comportementCancan.cancaner()
    }

    fun effectuerVol():String {
        return comportementVol.voler()
    }


}