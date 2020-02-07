
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

}