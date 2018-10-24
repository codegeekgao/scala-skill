package collection.optional

import java.lang


/**
  * OptionalDemo 学习
  *
  * @author codegeekgao
  * @version Id: OptionalDemo.scala, v 0.1 2018/10/18 15:09 codegeekgao Exp $$
  */
object OptionalDemo {

  def main(args: Array[String]): Unit = {
    // 将scala的Map转为java的Map
      val map = Map("张三" -> 23L,"李四" -> 24L,"王五"-> 25L)
      println(map.mapValues(new lang.Long(_)).get("张三"))
  }
}
