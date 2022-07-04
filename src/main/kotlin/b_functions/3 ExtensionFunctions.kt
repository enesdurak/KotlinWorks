package b_functions

fun main() {
    /** Extension functions
     * Read only bir classa ekstra ozellik vermemizi saglar
     */
    val extensionTest = "Hi"

    fun String.addHello():String{
        return "$this Hello"
    }

    println(extensionTest.addHello())

    /** Hem infix hem extension olabilir*/

    infix fun Any.add(s: String) {
        println("Extension infix + $s")
    }

    "ok" add "Hi"

    /** Extension function bir classin icinde yazilirsa sadece o classta kullanilabilir.
     * Her yerde kullanmak istiyorsak classin disinda yazilmali.
     */

}