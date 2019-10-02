object HelloWorld {
  def main(args: Array[String]): Unit = {
    // 输出语句
    println("Hello, world!")

    // 调用方法
    println(add.addInt(1, 3))
    println("muliplier(1) value = " + multiplier(1))
    println("muliplier(2) value = " + multiplier(2))

    // StringBuilder
    val buf = new StringBuilder
    buf += 'a'
    buf ++= "bcdef"
    println("buf is : " + buf.toString)

    // 计算长度
    val palindrome = "www.runoob.com"
    val len = palindrome.length
    println("String Length is : " + len)

    // 格式化输出
    var floatVar = 12.456
    var intVar = 2000
    var stringVar = "菜鸟教程!"
    var fs = printf("浮点型变量为 " +
      "%f, 整型变量为 %d, 字符串为 " +
      " %s", floatVar, intVar, stringVar)
    println(fs)

    // 数组
    var z = new Array[String](3)
    z(0) = "Runoob"
    z(1) = "Baidu"
    z(4 / 2) = "Google"

    var myList = Array(1.9, 2.9, 3.4, 3.5)

    // 输出所有数组元素
    for (x <- myList) {
      println(x)
    }

    // 计算数组所有元素的总和
    var total = 0.0
    for (i <- 0 to (myList.length - 1)) {
      total += myList(i)
    }
    println("总和为 " + total)

    // 查找数组中的最大元素
    var max = myList(0)
    for (i <- 1 to (myList.length - 1)) {
      if (myList(i) > max) max = myList(i)
    }
    println("最大值为 " + max)

    var myList1 = Array(1.9, 2.9, 3.4, 3.5)
    var myList2 = Array(8.9, 7.9, 0.4, 1.5)

    // 合并两个数组
    var myList3 = Array.concat(myList1, myList2)

    // 输出所有数组元素
    for (x <- myList3) {
      println(x)
    }

    var myList4 = Array.range(10, 20, 2)
    var myList5 = Array.range(10, 20)

    // 输出所有数组元素
    for (x <- myList4) {
      print(" " + x)
    }
    println()
    for (x <- myList5) {
      print(" " + x)
    }
  }

  // 函数，方法
  object add {
    def addInt(a: Int, b: Int): Int = {
      var sum: Int = 0
      sum = a + b

      return sum
    }
  }

  // 闭包
  var factor = 3
  val multiplier = (i: Int) => i * factor

}
