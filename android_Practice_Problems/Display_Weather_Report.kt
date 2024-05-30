package practice_kotlin.android_Practice_Problems

fun main() {
    val city = readln()
    val lowTemperature = readln()
    val highTemperature= readln()
    val chanceOfRain = readln()

    weatherReport(city,lowTemperature,highTemperature,chanceOfRain)
    weatherReport("Bongaigaon","20","45","20")
}

fun weatherReport(city: String, lowTemperature: String, highTemperature: String, chanceOfRain: String) {
    println("City: $city")
    println("Low temperature: $lowTemperature, High temperature: $highTemperature")
    println("Chance of rain: $chanceOfRain%")
    println()
}
