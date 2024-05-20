package practice_kotlin

fun sumOfCubeOfEachDigit(num: Int): Int {
    var n = Math.abs(num) //Math.abs() used for treat negative number as a positive number
    var sum = 0
    while (n != 0) {
        val digit = n % 10
        sum = sum + digit * digit * digit
        n /= 10
    }
    return sum
}

fun main() {
    val input = readln().toInt()
    println(sumOfCubeOfEachDigit(input))
}