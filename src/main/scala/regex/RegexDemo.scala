package regex

/**
  * Regex demo
  *
  * @author CodeGeekGao
  * @version Id: RegexDemo.java, v 0.1 2018/9/11 14:20 CodeGeekGao Exp $$
  */
object RegexDemo {

  def main(args: Array[String]): Unit = {
    // 初始化正则对象
    val numPattern = "[0-9]+".r
    val regex = "13 welcome to beijing"
    // findAllIn方法返回遍历所有匹配的迭代器，可以在for循环中使用
    for (matchString <- numPattern.findAllIn(regex)) {
      println(matchString)
    }
    // 查询字符串首个匹配项
    println(numPattern.findFirstIn(regex))
    // 检查某个字符串的开始部分能匹配，可以使用findPrefixOf
    println(numPattern.findPrefixOf(regex))
    for (i <- 1 to 10) {
      print(i)
    }
    println()
    // 定义一个函数
    val trint = (x: Int) => 2 * x
    val fun = 2 * (_: Int)
    println(((1.to(9)).map(0.1 * _)))
    (1.to(9)).map("*" * _).foreach(println _)

    // currying 柯里化
    def mulOneAtTime(x: Int) = (y: Int) => x * y
    // 闭包函数
    println(mulOneAtTime(6)(7))
    // 使用Option避免空指针异常
    println(Option(null).isEmpty)
  }
}
