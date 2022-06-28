fun main() {
    /** Nullable Int olusturunca referans karsilastirmasi esit cikmiyor fakat duz Int olusturunca
     esit cikiyor. 128'den kucuk bir sayi verince Int? da esit cikiyor. */
    val number1 : Int? = 129
    val number2 : Int? = 129
    if(number1===number2){
        println("Referanslar esit")
    }

    /** Farkli tipler toplanirken sonuc buyuk olanin tipini alir*/
    val longNumber : Long = 30
    val byteNumber : Byte = 10
    val total = longNumber + byteNumber
    if(total is Long){
        println("total is long")
    }
    else{
        println("total is not long")
    }

    /** Char'i Int'e cevirince ASCII karsiligini aliriz.*/
    val stringValue = 'A'
    println(stringValue.toInt())

    /**Arrayler*/
    val intArray = arrayOf(11,22,33)
    println(intArray[0])
    val anyArray = arrayOf<Any>(12,"String",true)
    println(anyArray[2])
    anyArray.set(2,false)
    anyArray.get(2)
    println(anyArray[2])
    val emptyArray = arrayOfNulls<Any>(4)

    /**String + Int calisir fakat Int + String calismaz */
    val stringExample2 = "String+Int"
    val intExample2 = 20
    val total2 = stringExample2 + intExample2
    println(total2)
    //total2 = intExample2 + stringExample2

    /** Degiskenin bir ozelligine ihtiyac duyarsak {} kullan.*/
    println("$stringExample2 length: ${stringExample2.length}")

    /** Sol taraftaki bosluklari trimlemek icin trimIndent() kullan */
    val leftBlankExample = "    four blank on left"
    println(leftBlankExample)
    println(leftBlankExample.trimIndent())

    /**Ranges*/
    val numbers = 1..50
    val numbers2 = 1.rangeTo(50)
    val reversedNumbers = 100.downTo(1)
    val grade = 10 until 100 //Baslangic dahil, bitis dahil degil
    val stepped = 1..100 step(4)
    stepped.forEach { print("$it ") }
    val stepped2 = 100 downTo 1 step 6
    val alphabet = 'A'..'Z'

    /** Nullable */
    val age: Int? = null
    var result: Int? = 0
    result!!.plus(10) //Null deger gelirse kod patlar
    result?.plus(10) //Null deger gelirse bu satir calismaz ama uygulama patlamaz


}