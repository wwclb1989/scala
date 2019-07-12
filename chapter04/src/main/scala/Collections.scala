object Collections {

  def main(args: Array[String]) {
    /**
      * Scala 列表类似于数组，它们所有元素的类型都相同，
      * 但是它们也有所不同：列表是不可变的，值一旦被定义了就不能改变，
      * 其次列表 具有递归的结构（也就是链接表结构）而数组不是。。
      */
    //    // 字符串列表
    //    val site: List[String] = List("Runoob", "Google", "Baidu")
    //
    //    // 整型列表
    //    val nums: List[Int] = List(1, 2, 3, 4)
    //
    //    // 空列表
    //    val empty: List[Nothing] = List()
    //
    //    // 二维列表
    //    val dim: List[List[Int]] =
    //      List(
    //        List(1, 0, 0),
    //        List(0, 1, 0),
    //        List(0, 0, 1)
    //      )

    /**
      * 构造列表的两个基本单位是 Nil 和 ::
      * Nil 也可以表示为一个空列表。
      */

    // 字符串列表
    val site = "Runoob" :: ("Google" :: ("Baidu" :: Nil))

    // 整型列表
    val nums = 1 :: (2 :: (3 :: (4 :: Nil)))

    // 空列表
    val empty = Nil

    // 二维列表
    val dim = (1 :: (0 :: (0 :: Nil))) ::
      (0 :: (1 :: (0 :: Nil))) ::
      (0 :: (0 :: (1 :: Nil))) :: Nil

    println("第一网站是 : " + site.head)
    println("最后一个网站是 : " + site.tail)
    println("查看列表 site 是否为空 : " + site.isEmpty)
    println("查看 nums 是否为空 : " + empty.isEmpty)

    // 你可以使用 ::: 运算符或 List.:::() 方法或 List.concat() 方法来连接两个或多个列表
    val site1 = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
    val site2 = "Facebook" :: ("Taobao" :: Nil)

    // 使用 ::: 运算符
    var fruit = site1 ::: site2
    println("site1 ::: site2 : " + fruit)

    // 使用 List.:::() 方法
    fruit = site1.:::(site2)
    println("site1.:::(site2) : " + fruit)

    // 使用 concat 方法
    fruit = List.concat(site1, site2)
    println("List.concat(site1, site2) : " + fruit)

    // 我们可以使用 List.fill() 方法来创建一个指定重复数量的元素列表
    val site3 = List.fill(3)("Runoob") // 重复 Runoob 3次
    println("site : " + site3)

    val num = List.fill(10)(2) // 重复元素 2, 10 次
    println("num : " + num)

    // List.tabulate() 方法是通过给定的函数来创建列表。
    // 通过给定的函数创建 5 个元素
    val squares = List.tabulate(6)(n => n * n)
    println("一维 : " + squares)

    // 创建二维列表
    val mul = List.tabulate(4, 5)(_ * _)
    println("多维 : " + mul)

    // List.reverse 用于将列表的顺序反转
    println("site 反转前 : " + site)
    println("site 反转后 : " + site.reverse)


    /**
      * Scala Set(集合)是没有重复的对象集合，所有的元素都是唯一的。
      *
      * Scala 集合分为可变的和不可变的集合。
      *
      * 默认情况下，Scala 使用的是不可变集合，如果你想使用可变集合，需要引用 scala.collection.mutable.Set 包。
      */

    // 默认引用 scala.collection.immutable.Set，不可变集合实例如下：
    val set = Set(1, 2, 3)
    println(set.getClass.getName) //

    println(set.exists(_ % 2 == 0)) //true
    println(set.drop(1)) //Set(2,3)

    // 如果需要使用可变集合需要引入 scala.collection.mutable.Set：
    import scala.collection.mutable.Set // 可以在任何地方引入 可变集合
    val mutableSet = Set(1, 2, 3)
    println(mutableSet.getClass.getName) // scala.collection.mutable.HashSet

    mutableSet.add(4)
    mutableSet.remove(1)
    mutableSet += 5
    mutableSet -= 2

    println(mutableSet) // Set(5, 3, 4)

    val another = mutableSet.toSet
    println(another.getClass.getName) // scala.collection.immutable.Set

    /**
      * head 返回集合第一个元素
      * tail 返回一个集合，包含除了第一元素之外的其他元素
      * isEmpty 在集合为空时返回true
      *
      */

    val siteSet = Set("Runoob", "Google", "Baidu")
    val numsSet: Set[Int] = Set()

    println("第一网站是 : " + siteSet.head)
    println("最后一个网站是 : " + siteSet.tail)
    println("查看列表 siteSet 是否为空 : " + siteSet.isEmpty)
    println("查看 numsSet 是否为空 : " + numsSet.isEmpty)

    // 你可以使用 ++ 运算符或 Set.++() 方法来连接两个集合。如果元素有重复的就会移除重复的元素。实例如下：
    val site1Set = Set("Runoob", "Google", "Baidu")
    val site2Set = Set("Faceboook", "Taobao")

    // ++ 作为运算符使用
    var siteSet1 = site1Set ++ site2Set
    println("site1Set ++ site2Set : " + siteSet1)

    //  ++ 作为方法使用
    siteSet1 = site1Set.++(site2Set)
    println("site1Set.++(site2Set) : " + siteSet1)


    /**
      * Map(映射)是一种可迭代的键值对（key/value）结构。
      *
      * 所有的值都可以通过键来获取。
      *
      * Map 中的键都是唯一的。
      *
      * Map 也叫哈希表（Hash tables）。
      *
      * Map 有两种类型，可变与不可变，区别在于可变对象可以修改它，而不可变对象不可以。
      *
      * 默认情况下 Scala 使用不可变 Map。如果你需要使用可变集合，你需要显式的引入 import scala.collection.mutable.Map 类
      */

    // 在 Scala 中 你可以同时使用可变与不可变 Map，不可变的直接使用 Map，可变的使用 mutable.Map。以下实例演示了不可变 Map 的应用：
    // 空哈希表，键为字符串，值为整型
    var A: Map[Char, Int] = Map()

    // Map 键值对演示
    val colors1 = Map("red" -> "#FF0000", "azure" -> "#F0FFFF")

    // 定义 Map 时，需要为键值对定义类型。如果需要添加 key-value 对，可以使用 + 号，如下所示：
    A += ('I' -> 1)
    A += ('J' -> 5)
    A += ('K' -> 10)
    A += ('L' -> 100)

    val colors = Map("red" -> "#FF0000",
      "azure" -> "#F0FFFF",
      "peru" -> "#CD853F")

    println("colors 中的键为 : " + colors.keys)
    println("colors 中的值为 : " + colors.values)
    println("检测 colors 是否为空 : " + colors.isEmpty)
    println("检测 nums 是否为空 : " + Map().isEmpty)

    // 你可以使用 ++ 运算符或 Map.++() 方法来连接两个 Map，Map 合并时会移除重复的 key。以下演示了两个 Map 合并的实例:
    val colors3 = Map("red" -> "#FF0000",
      "azure" -> "#F0FFFF",
      "peru" -> "#CD853F")
    val colors4 = Map("blue" -> "#0033FF",
      "yellow" -> "#FFFF00",
      "red" -> "#FF0000")

    //  ++ 作为运算符
    var colors5 = colors3 ++ colors4
    println("colors3 ++ colors4 : " + colors5)

    //  ++ 作为方法
    colors5 = colors3.++(colors4)
    println("colors3.++(colors4) : " + colors5)

    // 以下通过 foreach 循环输出 Map 中的 keys 和 values：
    val sites = Map("runoob" -> "http://www.runoob.com",
      "baidu" -> "http://www.baidu.com",
      "taobao" -> "http://www.taobao.com")

    sites.keys.foreach { i =>
      print("Key = " + i)
      println(" Value = " + sites(i))
    }

    // 你可以使用 Map.contains 方法来查看 Map 中是否存在指定的 Key。实例如下：
    if (sites.contains("runoob")) {
      println("runoob 键存在，对应的值为 :" + sites("runoob"))
    } else {
      println("runoob 键不存在")
    }
    if (sites.contains("baidu")) {
      println("baidu 键存在，对应的值为 :" + sites("baidu"))
    } else {
      println("baidu 键不存在")
    }
    if (sites.contains("google")) {
      println("google 键存在，对应的值为 :" + sites("google"))
    } else {
      println("google 键不存在")
    }


    /**
      * 与列表一样，元组也是不可变的，但与列表不同的是元组可以包含不同类型的元素。
      */
    // 我们可以使用 t._1 访问第一个元素， t._2 访问第二个元素，如下所示：
    val t = (4, 3, 2, 1)

    val sum = t._1 + t._2 + t._3 + t._4

    println("元素之和为: " + sum)

    // 你可以使用 Tuple.productIterator() 方法来迭代输出元组的所有元素：
    t.productIterator.foreach { i => println("Value = " + i) }

    // 你可以使用 Tuple.toString() 方法将元组的所有元素组合成一个字符串，实例如下：
    val t1 = new Tuple3(1, "hello", Console)

    println("连接后的字符串为: " + t1.toString())

    // 你可以使用 Tuple.swap 方法来交换元组的元素。如下实例：
    val t2 = new Tuple2("www.google.com", "www.runoob.com")

    println("交换后的元组: " + t2.swap)


    /**
      * Scala Option(选项)类型用来表示一个值是可选的（有值或无值)。
      */

    val myMap: Map[String, String] = Map("key1" -> "value")
    val value1: Option[String] = myMap.get("key1")
    val value2: Option[String] = myMap.get("key2")
    println(value1) // Some("value1")
    println(value2) // None

    // 你可以使用 getOrElse() 方法来获取元组中存在的元素或者使用其默认的值，实例如下：
    // 你可以使用 isEmpty() 方法来检测元组中的元素是否为 None，实例如下：
    val a: Option[Int] = Some(5)
    val b: Option[Int] = None

    println("a.getOrElse(0): " + a.getOrElse(0))
    println("b.getOrElse(10): " + b.getOrElse(10))
    println("a.isEmpty: " + a.isEmpty)
    println("b.isEmpty: " + b.isEmpty)
  }

}
