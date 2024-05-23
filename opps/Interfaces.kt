package practice_kotlin.opps

interface Animal2 {
    val color: String
    val bread: String

    fun eat() {
        println("Eating")
    }

    fun sleep()
    fun walk()
}

interface Bird2 {
    val color: String
    fun fly()
    fun eat()
    fun sleep()
}

abstract class HomoSapien2 {
    fun sleep() {
        println("Sleeping")
    }
}

interface NonFlyableBird2 : Bird2 {
    override fun fly() {
        println("I can't fly")
    }
}

class Eagle2 : Animal2, Bird2 {
    override val color: String = "Black Eagle"
    override val bread: String = "Harpy Eagle"

    override fun eat() {
        println("Eagle is eating")
    }

    override fun sleep() {
        println("Eagle is sleeping.")
    }

    override fun walk() {
        println("Eagle is walking")
    }

    override fun fly() {
        println("Eagle is flying")
    }
}

class Human2 : HomoSapien2(), NonFlyableBird2, Animal2 {
    override val bread: String = "Asian"
    override val color: String = "Brown"
    override fun eat() {
        println("Human is eating")
    }

    override fun walk() {
        println("Human is walking")
    }
}

fun main() {
    val baj = Eagle2()
    baj.eat()
    baj.sleep()
    baj.walk()
    baj.fly()
    println(baj.color)
    println(baj.bread)
    println("===================")

    val ranga = Human2()
    ranga.eat()
    ranga.sleep()
    ranga.walk()
    ranga.fly()
    println(ranga.color)
    println(ranga.bread)
}
