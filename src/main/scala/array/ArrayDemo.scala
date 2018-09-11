package array

import scala.collection.mutable.ArrayBuffer

/**
  * 数组练习
  *
  * @author CodeGeekGao
  * @version Id: ArrayDemo.java, v 0.1 2018/9/8 1:40 CodeGeekGao Exp $$
  */
object ArrayDemo {

  def main(args: Array[String]): Unit = {

    // 初始化不可变长度为10数组
    val array = new Array[Int](10)
    // 初始化可变字符串数组
    var str = new Array[String](10)
    // 推断数组类型
    val s = Array("hello", "Scala")
    // 创建集合等同于下面的new ArrayBuffer[Int]()
    val b = ArrayBuffer[Int]()
    new ArrayBuffer[Int]()
    // 集合添加元素类似与java中的list.add()多次调用添加函数
    b += (1, 2, 3, 4, 5, 6)
    // 可以追加新的集合元素
    b ++= Array(7, 8, 9, 10)
    // 移除前//5个元素
    b.trimStart(5)
    println(b)
    val c = new ArrayBuffer[Int]()
    c += (1, 2, 3)
    c.insert(2, 6)
    c.remove(2)
    println(c)
    // 遍历数组
    val a = ArrayBuffer[Int]()
    a += (1, 2, 3, 4, 5, 6)
    //遍历数组(变量i取值从0到a.length-1)
    for (i <- 0 until a.length) println(a(i))
    println("-------")
    // 遍历偶数下标索引元素
    for (i <- 0 until(a.length, 2)) println(a(i))
    println("-------")
    for (i <- (0 until a.length).reverse) println(a(i))
    // 数组转换
    val list = Array(8, 5, 1, 2, 3, 4)
    // yield元素填充
    val result = for (e <- list) yield e * 2
    println(result.toBuffer)
    // 舍弃偶数元素
    val res = for (e <- list if e % 2 == 0) yield e
    println(res.toBuffer)
    // 函数式编程使用filter和Map
    val req = a.filter(_ % 2 == 0).map(2 * _)
    println(req)
    // 求和,求数组最大值,排序
    println(list.sum, list.max, list.sorted.toBuffer)
    val bs = list.sorted.toBuffer
    bs.append(1, 2)
    println(bs)
    // 算出大于4的集合元素有几个
    println(bs.count(_ > 4))
  }
}
