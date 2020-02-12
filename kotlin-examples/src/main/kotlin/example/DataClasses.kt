
class DataClasses{

    open class SimpleClass(val one : String){
        val two : String = ""
    }

    class ChildFormSimple() : SimpleClass("1")

    data class example1(
            val field1 : String
    ){
        lateinit var field2 : String
        val field3 : String = "1"
    }

    class Owner{

        class static{ //Java

        }

        inner class inner{

        }
    }

    companion object{
        val staticVar = "sss"
        var staticCouner = 0
    }


    // decarator
    class MyString<T>(
            innerString : Collection<T> = ArrayList()
    ) : Collection<T> by innerString

    val text = """Lorem ipsum dolor sit amet, consectetur adipiscing 
                | elit, sed do eiusmod tempor incididunt ut labore 
                | et dolore magna aliqua.""".trimMargin()

    sealed class Expr {
        data class Const(val number: Double) : Expr()
        data class Sum(val e1: Double, val e2: Expr) : Expr()
        object NotANumber : Expr()

        fun eval1(expr: Expr) =
                when (expr) {
                    is Const -> expr.number
                    is Sum -> expr.e1
                    NotANumber -> Double.NaN
                }
    }
    open class Expr2 {
        data class Const(val number: Double) : Expr2()
        data class Sum(val e1: Double, val e2: Expr) : Expr2()
        object NotANumber : Expr2()

        fun eval2(expr: Expr2) =
                when (expr) {
                    is Expr2.Const -> expr.number
                    is Expr2.Sum -> expr.e1
                    Expr2.NotANumber -> Double.NaN
                    else -> throw IllegalArgumentException()
                }
    }


}