object Base {
  def main(args: Array[String]) {
    // 局部变量
    var a = 10;

    // while 循环执行
    while (a < 20) {
      println("Value of a: " + a);
      a = a + 1;
    }

    // 局部变量
    var b = 10;

    // do 循环
    do {
      println("Value of b: " + b);
      b = b + 1;
    } while (b < 20)

    var c = 0;
    // for 循环
    for (c <- 1 to 10) {
      println("Value of c: " + c);
    }

    var d = 0;
    // for 循环
    for (d <- 1 until 10) {
      println("Value of d: " + d);
    }

    var e = 0;
    var f = 0;
    // for 循环
    for (e <- 1 to 3; f <- 1 to 3) {
      println("Value of e: " + e);
      println("Value of f: " + f);
    }

    var g = 0;
    val numList = List(1, 2, 3, 4, 5, 6);

    // for 循环
    for (g <- numList) {
      println("Value of g: " + g);
    }

    var h = 0;
    val numList1 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    // for 循环
    for (h <- numList1
         if h != 3; if h < 8) {
      println("Value of h: " + h);
    }

    var m = 0;
    val numList2 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    // 循环中的 yield 会把当前的元素记下来，保存在集合中，循环结束后将返回该集合
    var retVal = for {m <- numList2
                      if m != 3; if m < 8
    } yield m

    // 输出返回值
    for (m <- retVal) {
      println("Value of m: " + m);
    }

  }
}
