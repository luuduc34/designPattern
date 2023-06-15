package be.technifutur.decouvertekotlin.designPattern.strategie

import java.util.*

class Hurler(var comportementCancan: ComportementCancan): ComportementCancan {
    override fun cancaner(): String {
        return "${comportementCancan.cancaner().uppercase(Locale.getDefault())}!"
    }
}