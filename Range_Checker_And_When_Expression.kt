package practice_kotlin

fun main() {
    val marks = readln().toInt()

    // Normal if else statement ↓
    if (marks >= 91 && marks <= 100) println("A")
    else if (marks >= 81 && marks <= 90) println("B")
    else if (marks >= 71 && marks <= 80) println("C")
    else if (marks >= 61 && marks <= 70) println("D")
    else if (marks >= 51 && marks <= 60) println("E")
    else if (marks >= 0 && marks <= 50) println("F")
    else println("Enter marks correctly")

    // if else statement with range checker ↓
    if (marks in 91..100) println("A")
    else if (marks in 81..90) println("B")
    else if (marks in 71..80) println("C")
    else if (marks in 61..70) println("D")
    else if (marks in 51..60) println("E")
    else if (marks in 0..50) println("F")
    else println("Enter marks correctly")

    // when expression ↓
    when (marks) {
        in 91..100 -> println("A")
        in 81..90 -> println("B")
        in 71..80 -> println("C")
        in 61..70 -> println("D")
        in 51..60 -> println("E")
        in 0..50 -> println("F")
        else -> println("Enter marks correctly")
    }
}