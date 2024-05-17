package practice_kotlin

fun main() {
    print("Enter a Integer Number: ")
    val input = readln().toInt()
//    if (input > 0) println("$input is Positive Number")
//    else println("$input is Negative Number")

    if (input > 0) println("$input is Positive Number")
    else if (input<0) println("$input is Negative Number")
    else println("$input is Zero")
}