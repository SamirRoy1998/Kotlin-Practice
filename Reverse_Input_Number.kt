package practice_kotlin

fun reverseNumber(number: Int): Int {
    var n = number
    var r = 0
    while (n != 0) {
        val digit = n % 10
        r = r * 10 + digit
        n /= 10
    }
    return r
}

fun main() {
    val input = readln().toInt()
    println(reverseNumber(input))
}