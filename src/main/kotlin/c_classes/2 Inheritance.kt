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
}