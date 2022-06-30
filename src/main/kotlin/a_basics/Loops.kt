package a_basics

fun main() {
    /** When kullanimlari*/
    val number = 1
    when(number){
        1 -> { println("number: $number") }
        2 -> { println("number: $number") }
        else -> { println("else") }
    }

    val number2 = 2
    when{
        (number<number2) -> {
            println("n1<n2")
        }
        (number>number2) -> {
            println("n1>n2")
        }
    }

    /** When expression*/
    val number3 = when{
        (number<number2) -> {
            println("n1<n2")
            3
        }
        (number>number2) -> {
            println("n1>n2")
            4
        }
        else -> {
            println("expression else")
            5
        }
    }
    println("number3: $number3")

    /** is - in kullanimlari*/
    when(number){
        is Int -> { println("number: $number is Int") }
        else -> { println("else - is") }
    }

    when(4){
         in 0..20 -> { println("in worked") }
         !in 0..20 -> { println("!in worked") }
        else -> { println("else - in") }
    }
    println("---------------------------------------")

    /** For kullanimlari */
    val numberArray = arrayOf(11,22,33,44,55)
    for(i in numberArray){
        print("$i ")
    }
    println()

    for(i in numberArray.indices){
        print("$i ")
    }
    println()

    for((i,v) in numberArray.withIndex()){
        print("$i:$v - ")
    }
    println()

    /** repeat() */
    repeat(5){
        print("Repeat ")
    }
    println()

    /** break - continue*/
    for(i in numberArray){
        when(i){
            22 -> continue
            44 -> break
        }
        print("$i ")
    }
    println()

    // continue@returnLabel dersek, basina returnLabel@ yazdigimiz donguye doner
    val numberArray2 = arrayOf(111,222,333,444,555)
    returnHere@for(i in numberArray){
        for(j in numberArray2){
            if(j==222){
                continue@returnHere
            }
            print("$i-$j ")
        }
    }

    /** While */
    var number5 = 5
    while(number5>0){
        println("number5: $number5")
        number5--
    }

}