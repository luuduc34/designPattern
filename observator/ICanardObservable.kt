package be.technifutur.decouvertekotlin.designPattern.observator

import be.technifutur.decouvertekotlin.designPattern.strategie.Colvert
import be.technifutur.decouvertekotlin.designPattern.strategie.ICanard

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

class ObserverBug() : ICanardObserver {
    override fun CanardCancanne(canard: ICanard) {
        println(canard.effectuerCancan())
    }

    override fun CanardVol(canard: ICanard) {
        println(canard.effectuerVol())
    }
}
class CanardObservable(val canardDeBase: ICanard) : ICanardObservable {
    private val setObserver = mutableSetOf<ICanardObserver>()
    private var propage = false
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
        if (!propage){
            propage = true
            setObserver.forEach {
                it.CanardVol(this)
            }
            propage = false
        }
        return vol
    }

    override fun effectuerCancan(): String {
        val cancan = canardDeBase.effectuerCancan()
        if (!propage){
            propage = true
            setObserver.forEach {
                it.CanardCancanne(this)
            }
            propage = false
        }
        return cancan
    }
}

fun main() {
    val canard = createCanardObservable(Colvert())
    val Toto = CanardObserver()
    val dédé = ObserverBug()
    canard.addObserver(Toto)
    canard.addObserver(dédé)
    println(canard.effectuerVol())
    println(canard.effectuerCancan())
}