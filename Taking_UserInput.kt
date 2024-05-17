package practice_kotlin

fun main() {
    println("Enter your name: ")
    val a = readLine() //nullable
    val b = readln().toInt() //non-nullable if null throw run time exceptions
    println(a)
    println(b*2)

    print("Age: ")
    val age = readln().toInt()
    print("Id: ")
    val id = readln()
    print("Name: ")
    val name = readln()

    println(id)
    println(name)
    println(age)
}