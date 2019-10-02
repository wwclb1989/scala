import scala.collection.mutable
object chapter04 {
  def main(args: Array[String]): Unit = {
    // Scala中的集合分为两种，一种是可变的集合，另一种是不可变的集合
    // Scala中所有的集合都来自于scala.collection包及其子包mutable和immutable
    // immutable包中的集合是不可变的，mutable包中的集合是可变的
    val mutableSet = mutable.Set(1,2,3)
    println(mutableSet)
    val immutableSet = Set(1,2,3)
    println(immutableSet)
  }
}
