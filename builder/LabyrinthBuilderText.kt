package be.technifutur.decouvertekotlin.designPattern.builder

import kotlin.math.max

class LabyrintheBuilderText : ILabyrintheBuilder<Position2D> {
    var text: String = ""; private set

    private val charMap: MutableMap<Int, MutableMap<Int, Char>> = mutableMapOf()
    private var maxLine: Int = 0
    private var maxColumn: Int = 0

    fun addToMap(line: Int, column: Int, value: Char) {
        maxLine = max(maxLine, line)
        maxColumn = max(maxColumn, column)
        var lineMap = charMap[line]
        if (lineMap == null) {
            lineMap = mutableMapOf()
            charMap[line] = lineMap
        }
        lineMap[column] = value
    }

    override fun begin() {
        charMap.clear()
        text = ""
        maxLine = 0
        maxColumn = 0
    }

    override fun stop() {
       for (l in 0..maxLine){
           val lineMap = charMap[l]
           if (lineMap != null)
               for (c in 0..maxColumn) {
                   text += if (lineMap[c] == null)' ' else lineMap[c]
               }
           text += '\n'
       }
    }

    override fun addPorte(position: Position2D) {
        addToMap(position.line, position.column, 'p')
    }

    override fun addMur(position: Position2D) {
        addToMap(position.line, position.column, 'm')
    }

    override fun addPiece(position: Position2D) {
        addToMap(position.line, position.column, 'x')
    }
}