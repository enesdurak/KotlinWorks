package c_classes

fun main() {
    /** Kotlinde default olarak tum classlar final konumdadir.
     * open yapilan func. ve propertyler override edilebilir.*/
    open class ParentClass(){
        private var privateProperty = "Private"
        open var publicProperty: String = "Public"
    }
    class ChildClass() : ParentClass(){
        override var publicProperty: String = "Public Child"
    }
    val parentClass = ParentClass()
    val childClass = ChildClass()
    println(childClass.publicProperty)
    childClass.publicProperty = "Public New"
    println(childClass.publicProperty)
    println(parentClass.publicProperty)

    /** Shape,Square ornegi*/
    open class Shape(val name: String){
        open var mColor: String = "Blue"
        open var mEdgeCount: Int = 0

        constructor(name: String, color: String, edgeCount: Int): this(name){
            mColor = color
            mEdgeCount = edgeCount
        }

        open fun drawShape(){
            println("Draw Shape Worked")
        }
    }

    open class Square(name: String) : Shape(name){
//        override var mColor = "Red"
        override fun drawShape() {
            super.drawShape()
            println("Overrided Draw Shape Worked")
        }
    }

    val square = Square("Kare")
    println(square.mColor)
}