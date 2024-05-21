package practice_kotlin

fun sumTwoNum(num1: Int, num2: Int, callback: () -> Unit) {
    print(num1 + num2)
    callback()
}

fun cube1(callback: () -> Unit, num3: Int): Int {
    callback()
    val c = num3 * num3 * num3
    return c
}

fun cube2(callback: (x:Int, y:Int) -> Int, xy1: Int): Int {
    println("Its from lambda -> ${callback(1,1)}")
    val c = xy1 * xy1 * xy1
    return c
}
fun cube3(callback: (x: Int, y: Int) -> Int, lm2: (Int, Int) -> Int): Int {
    println("Its from lambda -> ${callback(1, 1)}") // not solve
    val r = lm2(5, 5)
    val c = r * r * r
    return c
}

fun main() {
    val lambda1 = { println(" <- lambda 1") }
    sumTwoNum(10, 20, lambda1)
    sumTwoNum(callback = lambda1, num1 = 10, num2 = 20)

    sumTwoNum(23, 24, { println(" <- lambda 2") })

    sumTwoNum(3, 24) { println(" <- lambda 3") }

    cube1({ println("Hello") }, 2)
    val output1 = cube1({ print("Hello ") }, 2)
    println("$output1")

    val output2 = cube2({ x: Int, y: Int -> x + y }, 2)
    println("$output2")

    val lambda2 = { x: Int, y: Int -> x + y }
    val output3 = cube3(lambda2,lambda2)
    println("$output3")
}
