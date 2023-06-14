package be.technifutur.decouvertekotlin.designPattern.superCanard

fun main(args: Array<String>) {
    val marre: List<Canard> = listOf(Mandarin(),Colvert(),Leurre(),CanardEnPlastique())

    marre.forEach{
        it.afficher()
        println(it.nager())
        println(it.effectuerCancan())
        println(it.effectuerVol())
    }

    //Transforme le comportement de vol du Mandarin en Vol à réaction
    marre[0].comportementVol = VolAReaction()

    //Créer un begaiement au mandarin
    marre[0].comportementCancan = Begayer(marre[0].comportementCancan)

    //Fais hurler le canard
    marre[1].comportementCancan = Hurler(marre[1].comportementCancan)

    println("***************************************")
    marre.forEach{
        it.afficher()
        println(it.nager())
        println(it.effectuerCancan())
        println(it.effectuerVol())
    }

}

