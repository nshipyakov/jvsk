class LoopAndCondition {

    // Синтаксис условий циклов for
    fun example1(){

        for (item in listOf("1", "2")) print(item)

        for (a in 1..5)
            print("${a} ")

        val w = 5
        for (x in 1 until w) // for i:=1 ; x <= w-1; i++
            print("${x} ")

        for (l in 1 .. 10 step 2)
            print(l)

        for (l in 10 downTo 1)
            println(l)

        for (l in 10 downTo 1 step 3)
            println(l)
    }

    fun example2(){
        if (4 in 1..10) println("OK")

    }



    fun example3(){
        val str1 = "11"
        val str2 =  "11"
        println(str1 == str2) // Java equals
        println(str1 === str2) // Java ==
    }

    fun example4(x : Int){
        when (x) {
            1 -> print("x == 1")
            2 -> print("x == 2")
            else -> { // Note the block
                print("x is neither 1 nor 2")
            }
        }

        when (x) {
            in 1..10 -> print("x is in the range")
            !in 10..20 -> print("x is outside the range")
            else -> print("none of the above")
        }

        when {
            1 > 0 -> print("x is odd")
            0 < 2 -> print("x is even")
            else -> print("x is funny")
        }


    }