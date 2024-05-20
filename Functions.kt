package practice_kotlin

                                                            //Function 1
fun f1() {
    println("Hello")
}

                                                            //Overloaded Function 1 with 1 Perimeters
fun f1(name: String) {
    println("Hello $name")
}

                                                            //Overloaded Function 1 with 2 Perimeters
fun f1(name: String, age: Int) {
    println("Hello $name, your age is $age")
}

                                                            //Function with Default values
fun f2(name: String = "Not Available", age: Int = 0, address: String = "Not Available") {
    println("Name: $name\nAge: $age\nAddress: $address\n")
}

                                                            //Functions with Default value and return a value
fun sum(num1: Int = 0, num2: Int = 0): Int {
    val s = num1 + num2
    if (s == 0) println("Please pass some numbers to Operate")
    return s
}

fun main() {
    f1()
    f1("Samir")
    f1("Samir", 25)
    f1(age = 25, name = "Samir")
    println("-------------------------")

    f2()
    f2("Samir")
    f2(age = 25, address = "Bongaigaon")
    f2("Samir", 25, "Bongaigaon")

    println(sum())
    println(sum(15))
    println(sum(10, 15))
}
