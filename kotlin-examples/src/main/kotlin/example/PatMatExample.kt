package example

fun main(){
    val obj = ValueWrapper("pm")
    if (obj.value is String) {
        // Не скастил к строке, потому что value могло измениться
        //println(obj.value.length)
    }
    // Надо
    val obj1 = obj.value
    if (obj1 is String) {
        // Тут нормально скастилось, потому что obj1 никто не изменит
        println(obj1.length)
    }
}

private fun getObj(): Any = "123"

class ValueWrapper(var value: Any) {

    fun test() {
        println("test $value")
    }
}

fun example1() {
    val a = if (Math.random() * 10 > 5) 5 else null
    val aIntNotNull: Int? = a as Int
    val aInt: Int? = a as? Int
}

fun example2() {
    val obj: Any? = if (Math.random() * 10 > 5) 5 else "String"

    if (obj is String) print(obj.length)

    if (obj !is String) print("Not a String")
    else print(obj.length)
}

fun example3(){
    val x : Any? = null
    when (x) {
        is Int -> print(x + 1)
        is String -> print(x.length + 1)
        is IntArray -> print(x.sum())
    }
}

fun example4(any : Any){
    val nullSafe = any as? String // null
    println(nullSafe)
    val res = any as String // exception
    println(res)
}

lateinit var date :Date
lateinit var sqlDate : java.sql.Date // как в java
lateinit var baseCalendar:  BaseCal // через as в kotlin
