package be.technifutur.decouvertekotlin.designPattern.superCanard

class Begayer:ComportementCancan, Cancan() {

    override fun cancaner(): String {
        val cri = Cancan()
        return cri.cancaner() + cri.cancaner()
    }
}