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
    class InfixClass{
        infix fun
    }



}