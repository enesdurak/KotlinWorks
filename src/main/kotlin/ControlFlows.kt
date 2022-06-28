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
}