package be.technifutur.decouvertekotlin.designPattern.superCanard

class Begayer(var comportementCancan: ComportementCancan): ComportementCancan {

    override fun cancaner(): String {
        return "${comportementCancan.cancaner()} ${comportementCancan.cancaner()}"
    }
}