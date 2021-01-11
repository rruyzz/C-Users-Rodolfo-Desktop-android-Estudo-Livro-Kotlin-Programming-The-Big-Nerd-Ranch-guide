fun main() {
    
    val player1 = "rruyzz"
    var healthPoints = 89
    var isBlessed = true
    var isImmortal = false

    //Aura
    val auraColor = auraColor(isBlessed, healthPoints, isImmortal)
    val healthStatus = formatHealthStatus(healthPoints, isBlessed)
    val healthStatus2 = formatHealthStatus(50, true)
    val auraColor2 = auraColor(true, 50, false)

    //player Status
    printPlayerStatus(auraColor, isBlessed, player1, healthStatus)
    printPlayerStatus(auraColor2, true, "player 2", healthStatus2)
    //When
    val race = "gnome"
    var faction = when (race) {
        "dwarf" -> "Keeps of the mine"
        "gnome" -> "keeps of the mine"
        "orc" -> "Free people of the rolling hills"
        "human" -> "Free people of the rolling hills"
        else -> ""
    }
    println(faction)
    castFireball(49)
}

private fun printPlayerStatus(auraColor: String, isBlessed: Boolean, player1: String, healthStatus: String) {
    println("(Aura: $auraColor) " +
            "(Blessed : ${if (isBlessed) "Yes" else "No"})")
    println("$player1 $healthStatus")
}

private fun auraColor(isBlessed: Boolean, healthPoints: Int, isImmortal: Boolean) =
        if (isBlessed && healthPoints > 50 || isImmortal) "green" else "none"


private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean) =
        when (healthPoints) {
            100 -> "is greats"
            in 90..99 -> "has a few scratches"
            in 75..89 -> if (isBlessed) {
                "has some minor wounds, but is healing fast"
            } else {
                "has some minor wounds"
            }
            in 15..74 -> "looks pretty hurt"
            else -> "is in awful conditions"
        }
private fun castFireball(numFireball : Int ) {
    println("A glass of fireball spring into existence. (x$numFireball)")
    var inebration = ((1..50).random()*numFireball/50).toInt()
    if(numFireball<50){
        println("Inebatrion level: $inebration" +
                "\n ${when (inebration) {
                    in 1..10 -> "tipsy"
                    in 11..20 -> "sloshed"
                    in 21..30 -> "soused"
                    in 31..40 -> "stewed"
                    in 41..50 -> "T0aSt3d"
                    else -> ""
                }}")
    } else ("Inebration level: 50" +
            "T0aSt3d")

}
