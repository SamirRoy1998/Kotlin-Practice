package practice_kotlin

import java.util.*

//fun main() {
//    //20-05-2024
//    println("Enter any number (1 to 99999999999999999)")
//    while (true) {
//        val num1 = readln().toLong()
//        if (num1 in 1..99999999999999999) {
//            for (i in 1..10) println("$num1 + $i = ${i + num1}")
//            println()
//
//            for (i in 0..9) println("${i + num1} - $num1 = $i")
//            println()
//
//            for (i in 1..10) println("$num1 x $i = ${i * num1}")
//            println()
//
//            for (i in num1..num1 * 10 step num1) println("$i / $num1 = ${i / num1}")
//            break
//        } else println("Invalid input!!!\nPlease try again")
//    }
//}
//--------------------------------------------------------------------------------------------
//22-05-2024 10.42 pm
//class Abc {
//    var n: String
//    var a: Int
//
//    constructor(name: String, age: Int) {
//        n = name
//        a = age
//    }
//}
//
//fun main() {
//    val obj = Abc("Samir", 25)
//    println(obj.n)
//    println(obj.a)
//}
//--------------------------------------------------------------------------------------------
//24-05-2024 9.19 pm
//class Abc(name:String){
//    var name:String = name
//}
//
//fun main() {
//    val a = Abc("Samir")
//    println(a.name)
//}
//--------------------------------------------------------------------------------------------
//31-05-2024 2.27 am
fun main() {
    val list = listOf(5, 3, 6, 7, 9, 1)
    sortList(list)
    println(list)
}

private fun sortList(list: List<Int>) {
    for (i in 0..list.size - 1) {
        for (j in 0..list.size - 2) {
            if (list[j] > list[j + 1]) {
                Collections.swap(list, j, j + 1)
            }
        }
    }
}