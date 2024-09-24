package id.ac.polbeng.depandi.test_kelas

open class MyBase {
    open fun think(){
        println("Hei! i am thingking")
    }
}

class MyDerived: MyBase(){
    override fun think() {
      println("I am from Child")
    }
}

fun main(){
    val myBase = MyBase()
    myBase.think()
    var myDerived = MyDerived()
    myDerived.think()
}