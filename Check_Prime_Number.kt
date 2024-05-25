package practice_kotlin

fun checkPrime1(number: Int): Boolean { // Inefficient
    var factorCount = 0
    for (i in 1..number) {
        if (number % i == 0) {
            factorCount++
        }
    }
    return factorCount == 2
}

fun checkPrime2(number: Int): Boolean { //Efficient
    var isPrime = true
    for (i in 2..<number) {
        if (number % i == 0) {
            isPrime = false
            break
        }
    }
    return isPrime
}

fun main() {
    while (true) {
        try {
            val input = readln().toInt()
            println(checkPrime1(input)) // Inefficient
            println(checkPrime2(input)) // Efficient
            break
        } catch (e: Exception) {
//            println(e)
        }
    }
}
