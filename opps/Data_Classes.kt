package practice_kotlin.opps

class Normal(var name:String, var age:Int)
data class DataClass(var name:String, var age:Int)

fun main() {
    val n = Normal("Normal", 20)
    val d = DataClass("DataClass", 20)
    println("n: $n")
    println("n.hashCode(): ${n.hashCode()}")
    println("n.equals(d): ${n.equals(d)}")
    println("n.toString(): ${n.toString()}")
//    println(n.component1())     -> error
//    println(n.component2())     -> error
//    println(n.copy())           -> error
//    println(n.copy(age = 30))   -> error
//    println(n.component1())     -> error
//    println(n.component2())     -> error
    println("---------------------------------------------------")
    println("d: $d")
    println("d.hashCode(): ${d.hashCode()}")
    println("d.equals(n): ${d.equals(n)}")
    println("d.toString(): ${d.toString()}")
    println("d.component1(): ${d.component1()}")
    println("d.component2(): ${d.component2()}")
    println("d.copy(): ${d.copy()}")
    println("d.copy(age = 30): ${d.copy(age = 30)}")
    println("d.component1(): ${d.component1()}")
    println("d.component2(): ${d.component2()}")
}
