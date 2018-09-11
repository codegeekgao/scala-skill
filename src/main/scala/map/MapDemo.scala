package map

/**
  * Scala的映射学习
  *
  * @author CodeGeekGao
  * @version Id: MapDemo.java, v 0.1 2018/9/9 12:13 CodeGeekGao Exp $$
  */
object MapDemo {

  def main(args: Array[String]): Unit = {
    // 构造一个不可变的MAP映射，类似与key -> value这样的组合叫做对偶
    val score = Map("Jack" -> 12, "Bob" -> 20)
    val score1 = Map(("Jack", 12), ("Bob", 20))
    for ((key, value) <- score) Console.println(key)
    // 根据key获取value，类似java中的map.get(key)
    println(score("Jack"))
    // 获取元素不存在给出无元素提醒
    val flag = if (score.contains("haha")) score.get("haha") else "no such element"
    println(flag)
    val flag1 = score.getOrElse("haha", "no such element")
    println(flag1)
    // 遍历map的key
    println(score.keySet)
    // 获取map的value
    for (v <- score.values) println(v)
    // 元组
    val l = (1, 2.34, "哈哈")
    println(l._2)
    //  元组拉链
    val symbols = Array("<", "-", ">")
    val counts = Array(2, 10, 2)
    val pairs = symbols.zip(counts)
    println(pairs.toBuffer)
    for ((s, n) <- pairs) Console.print(s * n)
  }
}
