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