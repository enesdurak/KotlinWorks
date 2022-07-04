package b_functions

fun main() {

    /** Inner function sadece kendi fonksiyonu icinde erisilebilir*/
    fun firstFun(){
        println("First fun worked")
        fun secondFun(){
            println("Second fun worked")
        }
        secondFun()
    }
    //secondFun()   Hata veriyor
    firstFun()

    /** Infix function daha okunakli kodlar icin kullanilir.
     * true.or(false) yerine true or false
     * 1-) Classin icinde olmali (ya da extension olmali)
     * 2-) infix ile baslar
     * 3-) Tek parametre alir
     * 4-) Parametre default deger almaz
      */

    class InfixClass{
        infix fun addInt(int: Int):Int{
            return int + 5
        }
        fun testFun(int: Int){
            this addInt 5
        }
    }

    val infixClass = InfixClass()
    println(infixClass addInt 5)

}

//fun infixTest(){
//    this addInt 5
//}