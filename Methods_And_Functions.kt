package practice_kotlin

fun test1() {
    println("I'm a function, coz I don't have a any class")
}

class Example1 {
    fun test1() {
        println("I'm a method, coz I have a any class")
    }

    fun main() {
        val ex = Example1()
        ex.test1()          //  <- Bug That have to fix
    }
}

fun main() {
    val ex = Example1()     //  <- Object a Create to call method
    test1()                 //  <- Calling a function
    ex.test1()              //  <- Calling a method
}
