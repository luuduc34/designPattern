package be.technifutur.decouvertekotlin.designPattern.builder

import be.technifutur.decouvertekotlin.designPattern.factory.IPiece

interface ILabyrintheBuilder<K>{

    fun begin()
    fun addPiece(piece:IPiece, position:K)
    fun stop()
}

class LabyrintheBuilder<K>:ILabyrintheBuilder<K>{
    override fun begin() {
        TODO("Not yet implemented")
    }

    override fun addPiece(piece: IPiece, position: K) {
        TODO("Not yet implemented")
    }

    override fun stop() {
        TODO("Not yet implemented")
    }
}