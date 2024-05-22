package practice_kotlin.opps

class Cars {
    var model: String
    var color: String
    var type: String

    constructor() : this("N/A", "N/A","N/A") {
        println("---- I'm Default Constructor ----")
    }

    constructor(model: String) : this("N/A", "N/A","N/A") {
        this.model = model
        println("---- I am Parameterize Constructor ----")
    }

    constructor(model: String, color: String) : this("N/A", "N/A","N/A") {
        this.model = model
        this.color = color
        println("---- I am Parameterize Overloaded Constructor ----")
    }

    constructor(model: String, color: String, type: String) {
        this.model = model
        this.color = color
        this.type = type
        println("---- I am Parameterize Another Overloaded Constructor ----")
    }

    fun printDetails() {
        println("---------------------------------------------------")
        println("Car Model: $model")
        println("Car Type: $type")
        println("Car Color: $color")
        println("---------------------------------------------------")
    }
}

fun main() {
    val test = Cars()
    test.model = "GT-R"
    test.color = "Red"
    test.type = "Sports"
//    Cars()
    test.printDetails()
//===========================================================
    val m1 = Cars("BMW")
    m1.printDetails()
//===========================================================
    val m2 = Cars("Lamborghini", "Yellow")
    m2.printDetails()
//===========================================================
    val m3 = Cars("Scorpio", "Black", "SUV")
    m3.printDetails()
}
