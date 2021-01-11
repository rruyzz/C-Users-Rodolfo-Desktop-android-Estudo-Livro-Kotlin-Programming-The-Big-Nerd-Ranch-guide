import java.io.File

class Player(_name: String,
             var healthPoints: Int = 100,
             val isBlessed: Boolean,
             private val isImmortal: Boolean){

    var name = _name
        get()="${field.capitalize()} of $homeTown"
        private set(value){
            field=value.trim()
    }

    val homeTown by lazy {selectHomeTown()}

    init{
        require(healthPoints>0, {"healtPoints must be greater than 0"})
        require(name.isNotBlank(), {"Name can't be blank"})
    }
    constructor(name: String) : this(name,
            isBlessed = true,
            isImmortal = false){
        if(name.toLowerCase()=="kar")healthPoints=40
    }
    fun auraColor() : String{
        val auraViseble = isBlessed && healthPoints > 50 || isImmortal
        val auraColor = if (isBlessed && healthPoints > 50 || isImmortal) "green" else "none"
        return auraColor
    }

   fun formatHealthStatus() =
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

    fun castFireball(numFireball : Int )=
            println("A glass of fireball spring into existence. (x$numFireball)")

    private fun selectHomeTown() = File("data/towns.txt").readText().split("\n").shuffled().first()

}
