

import example.User
import java.time.LocalDate

fun main() {

    val user = User().apply {
        age = 19
    }
    print(user.isAdult())

}

class KotlinExtension {

    fun String.myHello(): String {
        return "Hello form Tinkoff.ru"
    }

    fun testExtension(){
        val stringTest = "123"
        println(stringTest.myHello())
        println("Simple String".myHello())
    }

    fun User.isAdult() = this.age >= 18


    class ClassWith2Field(val one: String, val two: String)


    val ClassWith2Field.minDate: LocalDate
        get() =  LocalDate.MIN

    val test = ClassWith2Field("1", "2").also {
        print(it.minDate)
    }
}