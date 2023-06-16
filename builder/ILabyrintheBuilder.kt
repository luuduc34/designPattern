package be.technifutur.decouvertekotlin.designPattern.builder

import be.technifutur.decouvertekotlin.designPattern.factory.*

interface ILabyrintheBuilder<K> {

    fun begin()
    fun addPiece(position: K)
    fun addMur(position: K)
    fun addPorte(position: K)
    fun stop()
}

class LabyrintheBuilder<K>(val factory: IAbstractFactory): ILabyrintheBuilder<K> {
    var labyrinthe: Labyrinthe<K>? = null ; private set
    override fun begin() {
        labyrinthe = Labyrinthe()
    }

    override fun addPiece(position: K) {
        labyrinthe?.labyMap?.set(position, factory.createPiece())
    }

    override fun addMur(position: K) {
        labyrinthe?.labyMap?.set(position, factory.createMur())
    }

    override fun addPorte(position: K) {
        labyrinthe?.labyMap?.set(position, factory.createPorte())
    }

    override fun stop() {
    }
}

fun main() {
    val builder = getFactory("Jardin")?.let {LabyrintheBuilder<Position2D>(it)}

    if (builder != null) {
        builder.begin()
        builder.addPorte(Position2D(0, 0))
        builder.addMur(Position2D(0, 1))
        builder.addMur(Position2D(0, 2))
        builder.addPiece(Position2D(1,2))
        builder.addPiece(Position2D(3,3))
        builder.stop()

        val labyrinthe = builder.labyrinthe

        println(labyrinthe)
    }
}