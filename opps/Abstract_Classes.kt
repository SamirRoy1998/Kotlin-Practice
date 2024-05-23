package practice_kotlin.opps

abstract class Animal{
    fun eat(){
        println("Animal is eating")
    }
    fun sleep(){
        println("Animal is sleeping")
    }
    fun breathe(){
        println("Animal is breathing")
    }
    abstract fun roam()
}
