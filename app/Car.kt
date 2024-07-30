class Car {
    var brand = ""
    var model = ""
    var year = 0

    class Car(var brand:String, var model:String,var year:Int)

        fun main(){
            val c1 = Car("toyota","Corolla",2002)

            println(c1.brand)
            println(c1.model)
            println(c1.year)

        }

    }
