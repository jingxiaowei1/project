import java.io.File
import java.util.*

fun main(args:Array<String>) {
    val aaab = A()

    println(aaab.toString())

    val sort = arrayOf(0,5,3,1,4)
    sort(sort)
    mylet()
    println("hello world kothlin 12323");
    // 常量
    val n = 3.1415926
    val aaaa = outputString("hello",123);
    println(aaaa)
    val 女朋友 = 1
    println(n)
    var name:String?
    println(女朋友)
    // 变量
    var hello = 123
    var sex = "女朋"
    println(hello)
    println(sex)

    // 元组
    val 课程 = Triple(3,"数学","kothlin")
    println("${课程.first}天${课程.second}课")

    var addr: String?="hello"
    var addr1: String?
    println(addr)

    var a = -1
    var c = -a
    var b = +a
    println(c)
    println(15%4)
    println(13/4.1)
    println(b)

    // 类初始化 无需new
    var file = File("/ext,txt")
    val date:Date? = Date(20170702)
    // 区间
    var e1 = 1..10
    for(i in e1.step(2)){
        println(i)
    }

    var isTrue = isZeroOrOne(0)
    println(isTrue)

    // 多行字符串
    val html = """hello
        next to
        meet
        you
    """
    println(html)

    // 转义字符
    println()

    //
    println(sum(1,2,3,4,5))

    // ‘*’展开符 适用于方法
    val bc = intArrayOf(1,2,3)
    sum(*bc)
    val zeroOrOne = isZeroOrOne(8)

    mainMethod(2,3)

    chekNumber(12,18)
    println(5.div(2))
    val a1 = "abcdf"
    println(a1.aaa())
    val st = Student()
    st.hello("lily")
    st.size="ssifisfsfisfisfsifffffffffffff"
    println(st.size)
    println(st.user)
    val student_first = Student()
    val student_second= Student.Student("a1",false)
    println("#########################################################")
    student_first.name ="xiaowei"
    student_first.wearGlasses = true

    println(student_second.name)
    println(student_second.wearGlasses)
    println(student_first.name)
    println(student_first.wearGlasses)



}
private fun isZeroOrOne(x:Int):Boolean {
    return when (x) {
        0, 1 -> true
        else -> false
    }
}

private fun println(){
    println("""a\nb""")
    println("a\rb")
    println("a\\b")
    println("a\"b")
    println("a\'b")
}

fun sum(vararg x: Int): Int{
    var total = 0
    x.forEach {
        total += it
    }
    return total
}

/**
 * 嵌套函数
 */
fun mainMethod(x:Int,y:Int){
   /* 允许内部嵌套
   fun calculate(x: Int,y: Int):Int{
        return x*y
    }
    val a = calculate(x,y)
    println(a)*/

    fun calculate() = x*y
    val a = calculate()
    println(a)
}

fun chekNumber(start:Int ,end:Int) {
    for(k in start..end){
        fun isThree() = (k % 3 == 0)
        fun isFive() = (k % 5 == 0)
        when{
            isThree() && isFive()->println("${k} 被3,5整除")
            isThree()->println("${k} 被3整除")
            isFive()->{
                println("${k} 被5整除")
                println(assert(5<4))
            }
            else ->println(k)
        }

    }

}

open class Particle()
class Electron: Particle()
open class Element(val name: String){
    open fun Particle.react(name: String):Unit{
        println("$name 与粒子发生反应")
    }
    open fun Electron.react(name: String):Unit{
        println("$name 与电子发生反应")
    }
    fun react(particle: Particle){
        particle.react(name)

    }
}

/**
* 函数扩展 substring注意
*/
fun String.aaa() = this.substring(0,1)

fun Student.Hello(name:String):Unit = println("hello")
fun mylet():Int {

    "hello111111".let {
        fun lello1() {
            println(it)
            println("1111")
        }
        val a = lello1();

    }
    return 111
}

/**
 * 泛型
 */
fun <T> outputString (a:T,b:T):String{
    return "$a,$b"
}

fun sort(a:Array<Int>){

    println(a.sortedArray().joinToString())
    println(a.sortDescending().toString())
    
}





