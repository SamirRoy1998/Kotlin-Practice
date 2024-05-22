package practice_kotlin.opps

// In Kotlin Getters and Setters are auto generated in the code
class User {
    var name: String = ""
        set(value) {
            field = value.ifEmpty {
                "Invalid Name"
            }
        }
    // I don't have to create gutter for name, coz name has default getter.

    var userid: String = ""
        set(value) {
            field = if (value.length<=5) {
                "Invalid ID"
            } else value
            println("----------------------")
        }
        get() {
            print("User ID: ")
            return field
        }
}

fun main() {
    val u1 = User()
    u1.name = ""
    u1.userid= ""
    println("Name: ${u1.name}")
    println(u1.userid)

    val u2 = User()
    u2.name = "Ram"
    u2.userid= "16941"
    println("Name: ${u2.name}")
    println(u2.userid)

    val u3 = User()
    u3.name = "Samir Roy"
    u3.userid= "A16442"
    println("Name: ${u3.name}")
    println(u3.userid)
}
