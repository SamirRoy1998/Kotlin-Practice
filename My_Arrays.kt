package practice_kotlin

fun main() {
    // array 1 ↓
    val arr1 = arrayOf(20, 30, 40, 45.5, 36.40, "Samir")
    println(arr1[5])
    println(arr1[4])
    arr1[4] = 36
    println(arr1[4])
    println()

    // array 2 ↓
    val arr2: Array<Int> = arrayOf(20, 30, 40, 50, 60)
    println(arr2[0] + arr2[1] + arr2[2] + arr2[3] + arr2[4]) //wrong print like (20+30+40+50+60) = 200
    println("${arr2[0]} ${arr2[1]} ${arr2[2]} ${arr2[3]} ${arr2[4]}")

    // No1 ↓ Example of changing value
    arr2[0] = 10
    // No2 ↓ Example of changing value
    arr2.set(index = 1, value = 20)

    // No1 ↓ Example concatenation of printing
    println("Setting 0 th index 20 to " + arr2[0])
    // No2 ↓ Example concatenation of printing
    println("Setting 1 th index 30 to ${arr2[1]}")
    println("${arr2[0]} ${arr2[1]} ${arr2[2]} ${arr2[3]} ${arr2[4]}")
}
