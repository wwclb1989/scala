object chapter02 {

  //  Scala中的变量在定义时必须初始化赋值

  def main(args: Array[String]): Unit = {
    // 初始化占位符
//    var s2: String = _
    // Scala中的变量还可以使用lazy着急字来修改，经过lazy着急字修饰的变量只有在真正使用时才会被赋值
    // lazy只能修饰val类型的变量
    lazy val v1 = "test"
    // Scala基本数据类型：Byte、Short、Int、Long、Char、String、Float、Double、Boolean
    // Scala中的对象比较不同于Java中的对象比较，Scala是基于内容比较，而Java中比较的是引用
    // Scala中还有一种非常特殊的类型，称为元组。元组是不同类型值的聚集，它可以将不同类型的值放在一个变量中保存
    var tuple = ("hello", "China", 1)
    // 要访问无组的内容，可以通过变量名._N的方式进行，其中N表示元组中元素的索引号
    tuple._1
    val (first, second, third) = tuple
    // Scala语言中还存在一种常用类型，即符号（Symbol）类型，符号类型的定义需要使用‘符号
    val s = 'start

  }
}
