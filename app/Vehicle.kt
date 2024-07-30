import java.sql.DriverManager.println
import java.time.DayOfWeek

interface Vehicle {
    fun start()
    fun stop()

}

class Car:Vehicle{
    override fun start(){
        println("Car started")
    }

    override fun stop() {
        println("Car stopped")
    }
}

fun main(){
    val car = Car()
    car.start()
    car.stop()
}

class ABC(
    val name:String,
    val isPassed:Boolean

    )

fun main(args:Array<String>){
    val abc1 = ABC("John",true)
    println(abc1.name)
    println(abc1.isPassed)

}

sealed class Myclass{
    sealed class Shape {
        class Circle(var radius: Float) : Shape()
        class Square(var length: Int) : Shape()
        class Rectangle(var length: Int, var breadth: Int) : Shape()
        object NotAShape : Shape()
    }
}


enum class Day (val dayOfWeek: Int){
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7)

}

val names = arrayof("John","Jane","Joe",1,34,5.6,3e4)
val numbers = intArrayOf(1,2,3,4,5)

fun main(){
    for(i in names){
        println(i)
    }
}
