fun main() {
    /** Degiskenin sonuna ++ yazarsak once islemi yapar sonra arttirir.
     * Onune yazarsak once arttirir sonra islemi yapar.*/
    var deneme = 1
    println(deneme++)
    println(deneme)
    println(++deneme)

    /** compareTo sayi buyukse 1, esitse 0, kucukse -1 doner.
     *  equals once tipini sonra degerini karsilastirir*/
    val x = 5
    val y = 6
    println(x.compareTo(y))
    println(x.equals(y))

    if(x>y){
        println("x>y")
    } else {
        println("x>y degil")
    }

    /**If-Else expression kullanim
     * if'in veya else'in son satiri propertyye atanir*/
    val number = 5
    val expressionValue = if(number<10){
        println("Bir seyler - if")
        "Expression test - if"
    } else{
        println("Bir seyler")
        "Expression test - else"
    }
    println("expressionValue: $expressionValue")

    /**.contains()*/
    expressionValue.contains("if", ignoreCase = true) //ignoreCase: buyuk-kucuk harf duyarliligi ignore

    /**.equals() once tipi, sonra degeri karsilastirir*/
    val intNumber = 10
    val longNumber = 10L
    println(intNumber.equals(longNumber))
}