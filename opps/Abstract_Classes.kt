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
}
