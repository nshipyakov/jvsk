class Kotlin {


    companion object {
        val log = Logger.getLogger(this::class.simpleName)
    }

    fun main() {

    }


    fun example() {
        val test = listOf("Test", "Super", "Puper")
        var count = 0
        test.forEach { _ ->
            count++
        }
    }

    fun example2(resp : Collection<String>){
        var clientError = 0
        var serverError = 0
        resp.forEach{
            when {
                it.startsWith("4") -> clientError++
                it.startsWith("5") -> serverError++
            }
        }
    }

    //нужен пример с ошибкой из-за не final переменных


    fun withAndApplyAndRunCathing() {
        val myMap = HashMap<String, String>().apply {
            this["s"] = "s"
            this["w"] = "w"
            keys
            values
            forEach { println("${it.key} = ${it.value}") }
        }

        val resultString = with(StringBuilder()) {
            append("1 ")
            append("2 ")
            reverse()
            forEach { print(it) }
            filter {
                it.toString() == "2"
            }
            toString()

        }

        runCatching { File("") }
                .onSuccess { if (!it.isFile) throw RuntimeException("is folder") }
                .onFailure { log.warning("error ${it.message}") }
                .map { it.usableSpace }
                .getOrThrow()

//        public inline fun <T, R> T.runCatching(block: T.() -> R): Result<R> {
//            return try {
//                Result.success(block())
//            } catch (e: Throwable) {
//                Result.failure(e)
//            }
//        }
    }


}        .onFailure { log.warning("error ${it.message}") }
                .map { it.usableSpace }
                .getOrThrow()

//        public inline fun <T, R> T.runCatching(block: T.() -> R): Result<R> {
//            return try {
//                Result.success(block())
//            } catch (e: Throwable) {
//                Result.failure(e)
//            }
//        }
    }


}