package be.technifutur.decouvertekotlin.designPattern.builder

import be.technifutur.decouvertekotlin.designPattern.factory.*
import java.io.File
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Paths

interface ILabyrintheBuilder<K> {

    fun begin()
    fun addPiece(position: K)
    fun addMur(position: K)
    fun addPorte(position: K)
    fun stop()
}

class LabyrintheBuilder<K>(val factory: IAbstractFactory) : ILabyrintheBuilder<K> {
    var labyrinthe: Labyrinthe<K>? = null; private set
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
    val builder = getFactory("Jardin")?.let { LabyrintheBuilder<Position2D>(it) }
    if (builder != null) {
        var line = 0
        builder.begin()
        File("monfichier.txt").forEachLine {
            var column = 0
            it.forEach {
                when (it) {
                    'm' -> builder.addMur(Position2D(line, column))
                    'x' -> builder.addPiece(Position2D(line, column))
                    'p' -> builder.addPorte(Position2D(line, column))
                }
                column++
            }
            line++
        }
        builder.stop()

        val labyrinthe = builder.labyrinthe

        println(labyrinthe)
    }
}