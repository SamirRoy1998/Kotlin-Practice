package practice_kotlin

fun main() {
    var a = 1
    var b = 1
    var c = 1
    var d = 1
    var e = 1
    var f = 1
//--------------------------------------------
    do {
        print("$a ")
        a++
    } while (a <= 10)
    println("        <-a: a has same output as b")
//--------------------------------------------
    do {
        print("$b ")
        b++
    } while (b in 1..10)
    println("        <-b: b has same output as a")
//--------------------------------------------
    do {
        print("$c ")
        c++
    } while (c in 1 until 10)
    println("           <-c: c has same output as d")
//--------------------------------------------
    do {
        print("$d ")
        d++
    } while (d in 1..<10)
    println("           <-d: d has same output as c")
//--------------------------------------------
    e = 10
    do {
        print("$e ")
        e--
    } while (e in 1..10)
    println("        <-e: e is reversed printing")
//--------------------------------------------
    f = 4
    do {
        print("$f ")
        f++
        f++
        f++
        f++
    } while (f in 4..40 step 4)
    println(" <-f: f is times of 4")
//--------------------------------------------
}