import scala.util.control.Breaks._

object chapter03 {

  def main(args: Array[String]): Unit = {
    for (i <- 1 to 5) {
      println("i=" + i)
    }
    for (i <- 1 until 5) {
      println("i=" + i)
    }
    for (i <- 1 until(10, 2)) {
      println("i=" + i)
    }
    for (i <- 1 to(11, 2)) {
      println("i=" + i)
    }
    // Scala没有Java语言的break、continue关键字
    // 通过Breaks类来达到退出循环：
    breakable {
      for (i <- 1 to 5) {
        if (i > 2) break
        println("i=" + i)
      }
    }
    // 通过加入Boolean类型的变量作为过滤条件
    for (i <- 1 to 5 if (i < 3)) {
      println("i=" + i)
    }
    for (i <- 1 to 40 if (i % 4 == 0); if (i % 5 == 0)) {
      println("i=" + i)
    }
    // for 循环同关键字yield一起使用可作为表达式，循环执行完成后有返回值
    var x = for (i <- 1 to 5) yield  i
    println(x)
    var y = for (i <- 1 to 5) yield  i % 2 == 0
    println(y)
  }
}
