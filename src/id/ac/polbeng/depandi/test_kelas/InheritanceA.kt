package id.ac.polbeng.depandi.test_kelas

//parent class
open class Computer (val name: String,
                    val brand: String){

}
// chill class (initialize the parent class)
class Laptop(name: String,
        brand: String,
        val batteryLife: Double) : Computer(name, brand){
    fun info(){
        println("Name : $name")
        println("Brand : $brand")
        println("Battery Life : $batteryLife")
    }
    }
fun main(){
    val myLaptop = Laptop("Acer Aspire 4738", "Acer", 2.5)
    println(myLaptop.info())
}