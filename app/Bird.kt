class Bird {
    var type = ""
    var color = ""

    val b1 = Bird()
    b1.type = "Parrot"
    b1.color = "Green"

    println(b1.type)
    println(b1.color)

    class Bird(var type: String, var color: String){
        fun main(){
            val b1 = Bird("Parrot", "Green")
            println(b1.type)
            println(b1.color)
        }
    }

    open class Bird{
        var color = "Green"
    }
    class Parrot: Bird(){
       fun myfun(){
           println(color)
       }
    }

    fun main(){
        var myobj = Parrot()
        myobj.myfun()
    }


}