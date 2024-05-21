package practice_kotlin

fun mySum(vararg nums: Int) {
    var sum = 0
    for (value in nums) {
        println(value)
        sum += value
    }
    println("Sum is: $sum\n")
}

fun main() {
    mySum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    mySum(12,14,30,29)
    mySum(nums = (1..100000).toList().toIntArray())
    mySum(nums = (1..100000 step 365).toList().toIntArray())
}