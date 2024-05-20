package practice_kotlin

fun checkPrime(number: Int): Boolean {
    var factorCount = 0
    for (i in 1..number) {
        if (number % i == 0) {
            factorCount++
        }
    }
    return factorCount==2
}

fun main() {
    val input = readln().toInt()
    println(checkPrime(input))
}