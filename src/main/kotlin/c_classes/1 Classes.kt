package c_classes

fun main() {
    class Car(color: String, enginePower: Float, wheelCount: Int = 4){
        val color = color
        private val mWheelCount: Int = 3
        private val mDoorCount: Int = 2

        init {
            println("Initialized")
        }

        constructor(color: String, enginePower: Float, wheelCount: Int, windowColor: String): this("Red",1.6F){
            println("Secondary constructor")
        }

    }

    val car = Car("Red", 1.3F, 3,"Black")
    println(car.color)
}