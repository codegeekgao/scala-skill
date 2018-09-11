package helloworld

object HelloWorld {

  def main(args: Array[String]) {
    println(" Hello World")
    // 增强for循环
    for (arg <- args) println(args)
  }
}
