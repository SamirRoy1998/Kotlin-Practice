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
    if (dayNum == 1) println("Monday")
    else if (dayNum == 2) println("Tuesday")
    else if (dayNum == 3) println("Wednesday")
    else if (dayNum == 4) println("Thursday")
    else if (dayNum == 5) println("Friday")
    else if (dayNum == 6) println("Saturday")
    else if (dayNum == 7) println("Sunday")
    else println("Enter correct number")
}