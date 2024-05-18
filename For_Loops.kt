package practice_kotlin

fun main() {

    for (i in 1..10) print("$i ")
    println()

    for (i in 1..<10) print("$i ")
    println()

    for (i in 10 downTo 1) print("$i ")
    println()

    for (i in 3..30 step 3) print("$i ")
    println()

    for (i in 9..90 step 9) print("$i ")
    println()

    val language: Array<String> = arrayOf(
        "C",
        "C++",
        "Java",
        "Kotlin",
        "Html",
        "Css",
        "Java Script",
        "Python",
        "Swift"
    )
    for (i in 0 ..< language.size) print("${language[i]} | ")
    println()
    for ( i in language) print("$i | ")
}