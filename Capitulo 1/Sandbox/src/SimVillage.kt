fun main(args: Array<String>) {
//    runSimulation("Guyal", ::printConstructionCost) { playerName, numBuilding ->
//        val currentYear = 2018
//        println("Adding $numBuilding houses")
//        "Welcome to SimVillage, $playerName!( copyright $currentYear)"
//    }
    runSimulation()
//}
//inline fun runSimulation(playerName: String,
//                         costPrinter: (Int) -> Unit,
//                         greetingFunction : (String, Int) -> String) {
//    val numBuilding = (1..3).shuffled().last()
//    costPrinter(numBuilding)
//    println(greetingFunction(playerName, numBuilding))
}
fun runSimulation(){
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("guyal"))
    println(greetingFunction("guyal"))

}
fun printConstructionCost(numBuilding : Int){
    val cost = 500
    println("Construction cost; ${cost*numBuilding}")
}
fun configureGreetingFunction(): (String) -> String {
    val structureType = "hospitals"
    var numBuildings = 5
    return { playerName: String ->
        val currentYear = 2018
        numBuildings += 1
        println("Adding $numBuildings $structureType")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
}