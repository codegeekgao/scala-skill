package conditionalexpression

object TestConditional {

  def main(args: Array[String]): Unit = {
    // scala的if判断表达式
    var x, y = 1
    if (x > 0) x = 10 else x = 20
    println(x)

    // 单行多个语句需要进行分号隔开
    if (x == 10) {
      y = y * x;
      y += 1
    }
    println("x=" + x + ",y=" + y)
    x = x + (y - x) * 2 + 2 * (12 - 11) * x
    println(x)
    // 占位符使用,已经过时
    printf("hello, %S! welcome to Scala world.\n，i have learn for %d day \n", "michael", 2)
    // 使用readLine
    //  val name=readLine("your name:")
    //    print("your age")
    //   val age = readInt()
    // printf("hello,%s! you have %d year work experience",name,age)

    // 遍历字符串
    val s: String = "hello"
    for (i <- 0 to (s.length - 1)) println(s(i))
    for (i <- 0 until s.length) println(s(i))
    // 多个生成器
    for (i <- 1 to 3; j <- 1 to 3) print((10 * i + j) + " ")
    println()
    // 守卫生成器，if前没有分号
    for (i <- 1 to 3; j <- 1 to 3 if i != j) print((10 * i + j) + " ")
    // 可以定义变量，在循环中引入
    println()
    for (i <- 1 to 3; from = 4 - i; j <- from to 3) print((10 * i + j) + " ")
    // 循环体yield
    println("yield")
    for (i <- 1 to 5) yield i

    // 定义函数
    def abs(x: Double) = if (x >= 0) x else -x
    // 调用函数
    println(abs(5))

    def haha(str: String, left: String = "[", right: String = "]") = left + str + right

    println(haha("你好"))

    /**
      * 定义可变参数值
      *
      * @param args
      * @return
      */
    def sum(args: Int*) = {
      var result = 0
      for (arg <- args) result += arg
      // 返回result
      result
    }

    val s1 = sum(1, 2)
    val s2 = sum(1 to 3: _*)
    println(s1)
  }
}
