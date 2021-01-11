fun main() {
    val player1 = "rruyzz"
    var healthPoints = 100
    var isBlessed = true
    var isImmortal = false
    var karma = (Math.pow(Math.random(), (110 - healthPoints.toDouble())/100)*20).toInt()

    if(healthPoints==100){
        println(player1 + " is in excellent conditions")
    } else if (healthPoints in 90..99){
        println(player1 + " has a few scratches")
    } else if (healthPoints in 75..89){
        if (isBlessed) {
            println(player1 + " has some minor wounds but is healing fast")
        } else {
            println(player1 + " has some minor wounds")
        }
    } else if (healthPoints in 15..74){
        println(player1 + " looks pretty hurt")
    } else {
        println(player1 + " is in awfull conditions")
    }

    //Aura
    if(isBlessed && healthPoints > 50 || isImmortal){
        println("GREEN")
    } else {
        println("NONE")
    }
    //removendo chave
    val auraColor = when(karma){
        in 0..5 -> "red"
        in 6..10 -> "orange"
        in 11..15 -> "purple"
        else ->"gren"
    }
    println(auraColor)


    //HealthStatus
    val healthStatus = if(healthPoints == 100){
        "is gret"
    } else if (healthPoints in 50..99){
        "is bad"
    } else {
        "is fuckup"
    }
    println(healthStatus)
    val statusFomartString = "(HP: $healthPoints) (A: $auraColor) -> $healthStatus "
    println(statusFomartString)

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

    val healthStatusWhen = when(healthPoints){
        100 -> "is great"
        in 50..99 -> "is bads"
        else -> "is awfull"
    }
    println(healthStatusWhen)
    var a = 2
    var b = 3
    println("A soma é ${a+b}")

    println("Blessed : ${if (isBlessed) "Yes" else "No"}") //${} usado em expressoes ou funções
}