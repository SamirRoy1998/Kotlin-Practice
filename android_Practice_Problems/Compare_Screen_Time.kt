package practice_kotlin.android_Practice_Problems

fun main() {
    val timeSpentToday = 400
    val timeSpentYesterday = 300
    val result = isMoreThanYesterday(timeSpentToday, timeSpentYesterday)
    println(result)
}

fun isMoreThanYesterday(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}
