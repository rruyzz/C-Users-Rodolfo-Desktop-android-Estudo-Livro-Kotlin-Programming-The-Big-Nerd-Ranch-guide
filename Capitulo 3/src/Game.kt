fun main() {

    val player = Player("Madrigal")
    player.castFireball(3)

    val currentRoom = TownSquare()
    println(currentRoom.description())
    println(currentRoom.load())

    //Aura
    val auraColor = player.auraColor()

    //player Status
    printPlayerStatus(player)

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
}

private fun printPlayerStatus(player: Player) {
    println("(Aura: ${player.auraColor()}" +
            "(Blessed : ${if (player.isBlessed) "Yes" else "No"})")
    println("$player $player.healthStatus")
}


