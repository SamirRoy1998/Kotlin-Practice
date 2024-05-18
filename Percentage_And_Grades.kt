package practice_kotlin

fun main() {
    print("Enter your name: ")
    val name = readln()
    print("Enter your test's Marks: ")
    val testMarks = readln().toDouble()

    print("English's Marks: ")
    val s1 = readln().toDouble()
    print("Bengali's Marks: ")
    val s2 = readln().toDouble()
    print("SST's Marks: ")
    val s3 = readln().toDouble()
    print("Science's Marks: ")
    val s4 = readln().toDouble()
    print("Math's Marks: ")
    val s5 = readln().toDouble()
    val total = s1 + s2 + s3 + s4 + s5
    val totalTestMarks = testMarks * 5
    val per = total / totalTestMarks * 100

    if (per < 100.001 && per >= 60) println("$name, your total marks is $total, and your percentage is $per and you got first division.")
    else if (per < 60 && per >= 45) println("$name, your total marks is $total, and your percentage is $per and you got second division.")
    else if (per < 45 && per >= 30) println("$name, your total marks is $total, and your percentage is $per and you got third division.")
    else if (per < 30 && per >= 0) println("$name, your total marks is $total, and your percentage is $per and you are fail.")
    else println("Enter your marks correctly")
}