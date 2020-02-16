package example

fun main(){

    val num = 2

    val result1 = when (num) {
        1 -> "Один"
        2 -> "Два"
        else -> "Много"
    }

    val obj: Any = getObj1();

    val result = when (obj) {
        is String -> "Строчка";
        is Int -> "Чиселка";
        else -> "Что - то другое";
    }


    print(result)
}

fun getObj1(): Any = 1