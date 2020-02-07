package example

fun main(){
    example1()
}

private fun example1() {
    val result = getNullResult()
    // Так не скомпиллится и это здорово
    // print(result.length)
    // Надо так
    print(result?.length)
    // Но
    val resultFromJava = NpeExample.getResult()
    // Предупреждения нет, хотя getResult() null возвращает
    // Платформенные типы котлин не проверяет. Строка ниже вывалит NPE
    print(resultFromJava.length)
}

private fun getNullResult(): String? = null

fun example(){
    val str : String? = null
    var length = str?.length // null
}

class Inner{
    var first : String? = null
    var second : Inner2 = Inner2()

    class Inner2{
        var firs : String? = null
    }
}

fun example2(){
    val inner : Inner? = null
    print(inner?.second?.firs)
}

fun example3(){
    val b : String? = if (Math.random() * 10 > 5) "test" else null
    val l: Int = if (b != null) b.length else -1 // --> b?.length ?: -1
    var lengthNotNull = b?.length ?: -1
}

fun example4(){
    val b : String? = if (Math.random() * 10 > 5) "test" else null
    val l = b!!.length // --> NullPointerException
}

fun example5(){
    val nullableList: List<Int?> = listOf(1, 2, null, 4)
    val intList: List<Int> = nullableList.filterNotNull()
}