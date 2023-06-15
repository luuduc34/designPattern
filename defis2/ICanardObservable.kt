package be.technifutur.decouvertekotlin.designPattern.defis2

import be.technifutur.decouvertekotlin.designPattern.strategie.Colvert
import be.technifutur.decouvertekotlin.designPattern.strategie.ICanard
import be.technifutur.decouvertekotlin.designPattern.strategie.Mandarin

interface ICanardObservable : ICanard {
    fun addObserver(observer: ICanardObserver)
    fun removeObserver(observer: ICanardObserver)
}

interface ICanardObserver {
    fun CanardCancanne(canard: ICanard)
    fun CanardVol(canard: ICanard)
}

fun createCanardObservable(canard: ICanard): ICanardObservable {
    return CanardObservable(canard)
}

class CanardObserver() : ICanardObserver {

    override fun CanardCancanne(canardDeBase: ICanard) {
        println("Aie mes oreilles")
    }

    override fun CanardVol(canardDeBase: ICanard) {
        println("Dommage que j'ai pas mon fusil")
    }
}

class CanardObservable(val canardDeBase: ICanard) : ICanardObservable {
    val setObserver = mutableSetOf<ICanardObserver>()
    override fun addObserver(observer: ICanardObserver) {
        setObserver.add(observer)
    }

    override fun removeObserver(observer: ICanardObserver) {
        setObserver.remove(observer)
    }

    override fun afficher() {
        canardDeBase.afficher()
    }

    override fun nager(): String {
        return canardDeBase.nager()
    }

    override fun effectuerVol(): String {

        val vol = canardDeBase.effectuerVol()
        setObserver.forEach {
            it.CanardVol(this)
        }
        return vol
    }

    override fun effectuerCancan(): String {
        val cancan = canardDeBase.effectuerCancan()
        setObserver.forEach {
            it.CanardCancanne(this)
        }
        return cancan
    }
}

fun main() {
    val canard = createCanardObservable(Colvert())
    val Toto = CanardObserver()
    canard.addObserver(Toto)
    canard.effectuerVol()
    canard.effectuerCancan()

}