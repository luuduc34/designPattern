package be.technifutur.decouvertekotlin.designPattern.defis1

import be.technifutur.decouvertekotlin.designPattern.superCanard.ICanard

class CanardNommable(override val name: String, val canardDeBase: ICanard): ICanardNommable {
    override fun afficher() {
        canardDeBase.afficher()
    }

    override fun nager(): String {
        return canardDeBase.nager()
    }

    override fun effectuerVol(): String {
        return canardDeBase.effectuerVol()
    }

    override fun effectuerCancan(): String {
        return canardDeBase.effectuerCancan()
    }

}