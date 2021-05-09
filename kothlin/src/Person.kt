class Person(name: String, age: Int){
    constructor(name:String , age: Int, parents: MutableList<Person>, children: MutableList<Person>):this(name, age){
        parents.forEach{it.children.add(this)}
        children.forEach{it.parents.add(this)}
        this.parents.addAll(parents)
        this.children.addAll(children)
    }
    // 名字
    val name:String = name

    // 年龄
    val age:Int = age

    // 父母
    var parents = mutableListOf<Person>()

    // 孩子
    var children = mutableListOf<Person>()

    /**
     * 显示关于个人的名字与年龄信息
     */
    fun showPersonalInformation() = println("name:${name},age:${age}")

    /**
     * 显示关于父母的名字与年龄信息
     */
    fun showParentInformation() = parents.forEach{it.showPersonalInformation()}

    /**
     * 显示关于孩子的名字与年龄信息
     */
    fun showChildInformation() = children.forEach{it.showPersonalInformation()}

    fun main(args:Array<String>) {
        val baby = Person("minghong", 3)
        val parent1 = Person("daming", 50)
        val parent2 = Person("dahong", 45)
    }

}