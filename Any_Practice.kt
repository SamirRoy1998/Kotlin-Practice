package practice_kotlin

fun main() {
    //20-05-2024
    println("Enter any number (1 to 99999999999999999)")
    val num1 = readln().toLong()

    for (i in 1..10) println("$num1 + $i = ${i + num1}")
    println()

    for (i in 0..9) println("${i+num1} - $num1 = $i")
    println()

    for (i in 1..10) println("$num1 x $i = ${i * num1}")
    println()

    for (i in num1..num1*10 step num1) println("$i / $num1 = ${i/num1}")
//--------------------------------------------------------------------------------------------
}
