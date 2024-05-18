package practice_kotlin

fun main() {
    println("Enter a number (1-7)")
    val dayNum = readln().toInt()
    when (dayNum) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Enter correct number")
    }
}