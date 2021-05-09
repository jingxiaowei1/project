import java.util.*

class Student {
    var name: String? = ""
    var wearGlasses: Boolean = false
    open var size:String? =""
        get() = field
        set(value) {
            field = value
        }
    var user:Date = Date()
        get() = field
        set(value) {
            field = value
        }


    fun hello(name: String): Unit {
        println("hello ${name} '$'a123")
    }

    /**
     * 构造1
     */
    //class Student constructor(val name:String, val wearGlasses:Boolean){}

    /**
     * 构造2
     */
    class Student constructor(name1: String, wearGlasses1: Boolean) {
        init {
            println("hello ===================================================   " + name1)
        }

        val name: String = name1
        val wearGlasses: Boolean = wearGlasses1
    }

}

