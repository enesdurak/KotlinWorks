package b_functions

fun main() {
    /**H.O.F. uc sekilde tanimlanir. */
//1-)
    val higherOrder = { surname : String ->
        "surname: $surname"
    }
//2-)
    val anonymousHigher = fun(surname: String) : String {
        return "surname : $surname"
    }
    val anonymousHigher2 = fun(surname: String) : String = "surname : $surname"
//3-)
    fun ordinaryFun(message: String): String {
        return "ordinaryFun: $message"
    }
    fun ordinaryFun2(colonHigherOrder: (message: String) -> String) {
        colonHigherOrder("Higher Order with Colon")
    }
    ordinaryFun2(::ordinaryFun)

    TODO("Devam edecek")
}

