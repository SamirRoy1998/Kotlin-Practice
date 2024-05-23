package practice_kotlin.opps

open class SukhranjanLalTripathi {
    open val name = "Sukhranjan Lal Tripathi"
    val land = "2000 sqft"
    open fun house() {
        println("One story house, House owner is $name covered in $land")
    }
    open fun landOwner() {
        println("Land owner is $name")
    }
}

class MotiLalTripathi : SukhranjanLalTripathi() {
    override val name = "Moti Lal Tripathi"
    override fun house() {
        println("Five story building, Building owner is $name covered in $land")
    }
    override fun landOwner() {
        println("Land owner is ${super.name}")
    }
}

fun main() {
    val skLal = SukhranjanLalTripathi()
    skLal.house()
    skLal.landOwner()
    println("=========================================================================================================================")

    val mlal = MotiLalTripathi()
    mlal.house()
    mlal.landOwner()
    println("=========================================================================================================================")
}