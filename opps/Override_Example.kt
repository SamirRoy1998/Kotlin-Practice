package practice_kotlin.opps

open class SukhranjanLalTripathi {
    open val name = "Sukhranjan Lal Tripathi"
    open val land = "2000 sqft"
    open fun house() {
        println("One story house, House owner is $name covered in $land")
    }

    open fun landOwner() {
        println("Land owner is $name")
    }
}

open class MotiLalTripathi : SukhranjanLalTripathi() {
    override val name = "Moti Lal Tripathi"
    override fun house() {
        println("Five story building, Building owner is $name covered in $land")
    }

    override fun landOwner() {
        println("Land owner is ${super.name}")
    }
}

class JohnTripathi : MotiLalTripathi() {
    override val name = "John Tripathi"
    override val land = "5000 sqft"
    override fun house() {
        println("Ten story mansion, Mansion owner is $name covered in $land")
    }

    override fun landOwner() {
        println("Land owner is $name")
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

    val jt = JohnTripathi()
    jt.house()
    jt.landOwner()
    println("=========================================================================================================================")
}
