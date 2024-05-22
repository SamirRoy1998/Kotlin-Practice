package practice_kotlin.opps

class Car {
    var carModel: String = "No Details"
    var carColor: String = "No Details"
    var carType: String = "No Details"

    constructor() {
        println("---------------------------------------------------")
        println("I'm Default Constructor")
    }

    constructor(model: String) {
        carModel = model
        println("---------------------------------------------------")
        println("I am Parameterize Constructor")
        println("Car Model: $model")
    }

    constructor(model: String, color: String) {
        carModel = model
        carColor = color
        println("---------------------------------------------------")
        println("I am Parameterize Overloaded Constructor")
        println("Car Model: $model")
        println("Car Color: $color")
    }

    constructor(model: String, color: String, type: String) {
        carModel = model
        carColor = color
        carType = type
        println("---------------------------------------------------")
        println("I am another Parameterize Overloaded Constructor")
        println("Car Model: $model")
        println("Car Color: $color")
        println("Car Type: $type")
    }
}

fun main() {
    val test = Car()
    test.carModel = "GT-R"
    test.carColor = "Red"
    test.carType = "Sports"
    println(test.carType)
    println(test.carColor)
    println(test.carModel)
//===========================================================
    val m1=Car("BMW")
    println(m1.carModel)
    println(m1.carColor)
    println(m1.carType)
//===========================================================
    Car("Lamborghini", "Yellow")
//===========================================================
    val m3 = Car("Scorpio", "Black", "SUV")
    m3.carModel
    m3.carColor
    m3.carType
}
