fun main() {
    /* Nullable Int olusturunca referans karsilastirmasi esit cikmiyor fakat duz Int olusturunca
     esit cikiyor. 128'den kucuk bir sayi verince Int? da esit cikiyor. */
    val number1 : Int? = 129
    val number2 : Int? = 129
    if(number1===number2){
        println("Referanslar esit")
    }

    /* Farkli tipler toplanirken sonuc buyuk olanin tipini alir*/
    val longNumber : Long = 30
    val byteNumber : Byte = 10
    val total = longNumber + byteNumber
    if(total is Long){
        println("total is long")
    }
    else{
        println("total is not long")
    }

    /* Char'i Int'e cevirince ASCII karsiligini aliriz.*/
    val stringValue = 'A'
    println(stringValue.toInt())

    /*Arrayler*/
    val intArray = arrayOf(11,22,33)
    println(intArray[0])
    val anyArray = arrayOf<Any>(12,"String",true)
    println(anyArray[2])
    anyArray.set(2,false)
    anyArray.get(2)
    println(anyArray[2])
    val emptyArray = arrayOfNulls<Any>(4)

}