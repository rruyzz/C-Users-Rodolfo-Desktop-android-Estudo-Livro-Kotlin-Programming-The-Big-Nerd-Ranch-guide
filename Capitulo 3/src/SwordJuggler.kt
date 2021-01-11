fun main() {
    var swordsJuggling: Int? = null
    val isJugglingProficiente = (1..3).shuffled().last() == 3
    if (isJugglingProficiente){
        swordsJuggling = 2
    }
    try {
        proficiencyCheck(swordsJuggling)
        swordsJuggling = swordsJuggling!!.plus(1)
    }catch (e: Exception){
        println(e)
    }
    println("You juggle $swordsJuggling swords!")
}
fun proficiencyCheck(swordsJuggling: Int?) {
    checkNotNull(swordsJuggling, {"Player cannot juggle swords!"})
}
class UnskilledSwordJugglerException() :
        IllegalStateException("player cannot juggle swords")
fun JuggleSwords(swordsJuggling: Int){
    require(swordsJuggling >= 3, {"Juggle at least 3 swords to be exciting"})
}
