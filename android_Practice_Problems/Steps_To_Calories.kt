package practice_kotlin.android_Practice_Problems

fun main() {
    val steps = 4000
    val caloriesBurned = pedometerStepsToCalories(steps)
    println("Walking $steps steps burns $caloriesBurned calories")
}

fun pedometerStepsToCalories(steps: Int): Double {
    val caloriesBurnedEachSteps = 0.04
    val totalCategoryBurned = steps * caloriesBurnedEachSteps
    return totalCategoryBurned
}
