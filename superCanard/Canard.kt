package be.technifutur.decouvertekotlin.designPattern.superCanard

abstract class Canard(var comportementCancan: ComportementCancan, var comportementVol: ComportementVol) {


    fun nager(): String {
return "Plouf Plouf"
    }
    open fun afficher(){

    }

    fun effectuerCancan() {
        return comportementCancan.cancaner()
    }

    fun effectuerVol(){
        return comportementVol.voler()
    }


}