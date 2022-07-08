package c_classes

fun main() {
    abstract class Car{
        abstract val brand: String
        abstract val model: String
        abstract val enginePower: Float
        abstract val doorCount: Int

        open fun printBrandName(){
            println(brand)
        }
    }

    class BlueCar() : Car() {
        override val brand: String = "BMW"
        override val model: String = "M3"
        override val enginePower: Float = 1.6F
        override val doorCount: Int = 4
    }

    val blueCar = BlueCar()
    blueCar.printBrandName()

}