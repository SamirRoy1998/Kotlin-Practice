package practice_kotlin

fun sum1(num1: Int=0, num2: Int=0): Int {
    val sum= num1 + num2
    if (sum==0) println("Numbers should be grater than 0")
    return sum
}
// ↓ We can't put any default parameters in any lambda ↓
val lambdaSum1 = { x: Int, y: Int -> x + y }

fun main() {
    val num1 =0;
    val num2 =0;
    println("The sum of num1 and num2 is: ${sum1(num1, num2)}")

    print("Now Re-Enter your 1st Number: ")
    val input1 = readln().toInt()

    print("Now Re-Enter your 2st Number: ")
    val input2 = readln().toInt()

    println("The sum is using function: ${sum1(input1, input2)}")
    println("The sum is using lambda: ${lambdaSum1(input1, input2)}")
}
