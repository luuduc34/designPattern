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

class LabyrintheBuilder<K>(val factory:IAbstractFactory):ILabyrintheBuilder<K>{

    var labyrinthe : Labyrinthe<K>? = null

    override fun begin() {
        labyrinthe = Labyrinthe()
        println("Je me lance")
    }

    override fun addPiece(position: K) {
        labyrinthe?.labyMap?.set(position, factory.createPiece())
        //labyrinthe?.labyMap?.set(position, piece)
        println("J'ajoute une pièce")
    }

    override fun addMur(position: K) {
        labyrinthe?.labyMap?.set(position, factory.createMur())
        //labyrinthe?.labyMap?.set(position, piece)
        println("J'ajoute un mur")
    }

    override fun addPorte(position: K) {
        labyrinthe?.labyMap?.set(position, factory.createPorte())
        //labyrinthe?.labyMap?.set(position, piece)
        println("J'ajoute une porte")
    }

    override fun stop() {

        println("Je stop")
    }
}

fun main() {

    val builder = getFactory("Jardin")?.let { factory -> LabyrintheBuilder<Position2D>(factory) }
    val path = "monfichier.txt"

    if (builder != null) {
        readTextLabyrinthe(builder, path)
        val labyrinthe = builder.labyrinthe
        if (labyrinthe != null) {
            val builderText = LabyrintheBuilderText()
            readObjectLabyrinthe(builderText, labyrinthe)
            println(builderText.text)
        }
    }
}
fun readObjectLabyrinthe(builder: ILabyrintheBuilder<Position2D>, labyrinthe: Labyrinthe<Position2D>){
    builder.begin()
    labyrinthe.labyMap.forEach{ key, value ->
        when (value){
            is IPorte -> builder.addPorte(key)
            is IMur -> builder.addMur(key)
            is IPiece -> builder.addPiece(key)
        }
    }
    builder.stop()
}

private fun readTextLabyrinthe(builder: LabyrintheBuilder<Position2D>, path: String) {
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
}

