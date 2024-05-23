package practice_kotlin.opps

abstract class Animal {
    open fun eat() {
        println("Animal is eating")
    }

    fun sleep() {
        println("Animal is sleeping")
    }

    fun breathe() {
        println("Animal is breathing")
    }

    abstract fun roam()
    abstract fun speak()
}

class Cat : Animal() {
    override fun roam() {
        println("Cat is walking")
    }

    override fun speak() {
        println("Meow Meow Meow")
    }
}

class Dog : Animal() {
    override fun eat() {
        println("Dog is eating")
    }

    override fun roam() {
        println("Dog is running")
    }

    override fun speak() {
        println("Bow wow wow wow")
    }

    fun bite() {
        println("Dog is biting")
    }
}

fun main() {
    val cat = Cat()
    cat.eat()
    cat.sleep()
    cat.breathe()
    cat.roam()
    cat.speak()
    println("=== === === === === === === ===")
    val dog = Dog()
    dog.eat()
    dog.sleep()
    dog.breathe()
    dog.roam()
    dog.speak()
    dog.bite()
}
