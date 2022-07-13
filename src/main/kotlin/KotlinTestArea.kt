fun main(){
    open class Car(color: String){
        var colorR = color

        final fun printColor(){
            println(colorR)
        }
    }

    class Motor(color: String) : Car(color) {

    }

    val motor = Motor("red")
    motor.printColor()
}