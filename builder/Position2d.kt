package be.technifutur.decouvertekotlin.designPattern.builder

class Position2D(val line:Int, val column : Int): IPosition {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Position2D

        if (line != other.line) return false
        if (column != other.column) return false

        return true
    }

    override fun hashCode(): Int {
        var result = line
        result = 31 * result + column
        return result
    }

    override fun toString(): String {
        return "\n Position2D(line=$line, column=$column)"
    }
}
interface IPosition{

}