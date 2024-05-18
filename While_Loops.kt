package practice_kotlin

fun main() {
    var a = 1
    var b = 1
    var c = 1
    var d = 1
    var e = 1
    var f = 1
//--------------------------------------------
    while (a <= 10) {
        print("$a ")
        a++
    }
    println("        <-a: a has same output as b")
//--------------------------------------------
    while (b in 1..10) {
        print("$b ")
        b++
    }
    println("        <-b: b has same output as a")
//--------------------------------------------
    while (c in 1 until 10) {
        print("$c ")
        c++
    }
    println("           <-c: c has same output as d")
//--------------------------------------------
    while (d in 1..<10) {
        print("$d ")
        d++
    }
    println("           <-d: d has same output as c")
//--------------------------------------------
    e = 10
    while (e in 1..10) {
        print("$e ")
        e--
    }
    println("        <-e: e is reversed printing")
//--------------------------------------------
    f = 4
    while (f in 4..40 step 4){
        print("$f ")
        f++
        f++
        f++
        f++
    }
    println(" <-f: f is times of 4")
//--------------------------------------------
}