package practice_kotlin.opps

class Student {
    var name: String = ""
    var sirName: String = ""
    var age: Int = 0
    var id: Int = 0
    var district: String = ""
    var city: String = ""
    var area: String = ""
    var colony: String = ""
    var landMark: String = ""
    var houseNo: String = ""

    private val address: String get() = "$houseNo, $colony, $landMark, $area, $city, $district"
    private val fullName get() = "$name $sirName"

    fun printDetails() {
        println("----------------------------")
        println("Id: $id")
        println("Full Name: $fullName")
        println("Age: $age")
        println("Address: $address")
        println("----------------------------")
    }
}

//-------------------------------------------------------------------------------------
class AdvStudent(
    private var name: String = "",
    private var sirName: String = "",
    private var age: Int = 0,
    private var id: Int = 0,
    private var district: String = "",
    private var city: String = "",
    private var area: String = "",
    private var colony: String = "",
    private var landMark: String = "",
    private var houseNo: String,
) {

    private val address: String get() = "$houseNo, $colony, $landMark, $area, $city, $district"
    private val fullName get() = "$name $sirName"

    init {
        println("---Advanced Student Class---")
    }

    fun printDetails() {
        println("Id: $id")
        println("Full Name: $fullName")
        println("Age: $age")
        println("Address: $address")
        println("----------------------------")
    }
}

fun main() {
    val st1 = Student()
    st1.name = "Samir"
    st1.sirName = "Roy"
    st1.age = 25
    st1.id = 5124
    st1.district = "Bongaigaon"
    st1.city = "New Bongaigaon"
    st1.landMark = "Srimanta Sankardev Namghar"
    st1.area = "Dangtola"
    st1.colony = "Central Colony"
    st1.houseNo = "N/355/D"

    st1.printDetails()
//--------------------------------------------------------------
    val ast1 = AdvStudent(
        "Samir",
        "Roy",
        25,
        5124,
        "Bongaigaon",
        "New Bongaigaon",
        "Dangtola",
        "Central Colony",
        "Srimanta Sankardev Namghar",
        "N/355/D"
    )
    ast1.printDetails()
}
