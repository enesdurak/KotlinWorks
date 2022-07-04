package b_functions

fun main() {
    /** Hello functions*/
    fun firstFunction(name:String, surname:String) : String{
        return "$name $surname"
    }
    val name = firstFunction("Enes", "Durak")
    println(name)

    /** Overloading */
    fun firstFunction(name:String, surname:String, age:Int) : String{
        return "$name $surname $age"
    }
    fun firstFunction(name:String, surname:String, age:Int, language:String) : String{
        return "$name $surname $age $language"
    }
    val name2 = firstFunction("Enes", "Durak", 30)
    val name3 = firstFunction("Enes", "Durak", 30, "Turkish")

    println(name2)
    println(name3)

    /**Default deger*/
    fun defaultValueFunction(name: String = "Enes", surname:String) : String{
        return "$name $surname"
    }
    val defaultName = defaultValueFunction(surname = "Durak")
    println(defaultName)

    /** Cok sayida ayni tipte parametre varsa vararg kullanabiliriz */
    //Sadece vararg varsa veya sonda vararg varsa tipi String... olur. Diger durumlarda String[]. String... daha iyi.
    fun varargFunction(number:Int,vararg userInfo:String){
        println(number)
        println(userInfo[2])
        println(userInfo.get(3))
    }
    varargFunction(number = 10,"Enes","Durak","TR","Istanbul")

    /** Single expression */
    val userList = arrayOf("Ali","Veli","Ahmet","Mehmet")
    fun getListCount() : Int = userList.size
    println(getListCount())
}