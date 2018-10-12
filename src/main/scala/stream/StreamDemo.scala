package stream

/**
  * 流对象演示
  *
  * @author CodeGeekGao
  * @version Id: StreamDemo.java, v 0.1 2018/9/21 11:49 CodeGeekGao Exp $$
  */
object StreamDemo {

  def main(args: Array[String]): Unit = {

    /**
      * 递归调用创建流对象
      *
      * @param n 参数n
      * @return Stream
      */
    def numFrom(n: BigInt): Stream[BigInt] = n #:: numFrom(n + 1)

    val ten = numFrom(10)
    // 默认懒加载,使用force进行计算
    println(ten)

  }
}
