package practice_kotlin

fun main() {
    print("Enter a value: ")
    var input = readln().toInt()
    var count = 0
    while (input > 0) {
        input = input / 10
        count++
    }
    println("you entered value has $count-digit.")
}