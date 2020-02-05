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