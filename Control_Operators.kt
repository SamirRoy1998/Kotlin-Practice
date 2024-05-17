package practice_kotlin

fun main() {
    print("Enter a Integer Number: ")
    val input = readln().toInt()
//    if (input > 0) println("$input is Positive Number")
//    else println("$input is Negative Number")

    if (input > 0) println("$input is Positive Number")
    else if (input < 0) println("$input is Negative Number")
    else println("$input is Zero")

    println("Enter your second Integer Number")
    val input2 = readln().toInt()
    if (input > input2) println("$input is bigger than $input2")
    else if (input < input2) println("$input is Small than $input2")
    else println("$input is equal to $input2")

    val max =
        if (input > input2) input
        else if (input < input2) input2
        else println("Both number is equal")
    println("$max is max")
}