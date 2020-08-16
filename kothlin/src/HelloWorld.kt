import java.io.File
import java.util.*

fun main(args:Array<String>) {
    println("hello world kothlin 12323")
    // 常量
    val n = 3.1415926
    val 女朋友 = 1
    println(n)
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



}
private fun isZeroOrOne(x:Int):Boolean{
    return when (x){
        0,1->true
        else->false
    }
}


