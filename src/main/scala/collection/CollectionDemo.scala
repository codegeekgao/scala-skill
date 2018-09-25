package collection

import scala.collection.mutable.ArrayBuffer

/**
  * 集合demo使用
  *
  * @author CodeGeekGao
  * @version Id: CollectionDemo.java, v 0.1 2018/9/13 10:23 CodeGeekGao Exp $$
  */
object CollectionDemo {

  def main(args: Array[String]): Unit = {
    // 初始化构建元素个数为4的集合对象
    val v = Vector(1, 2, 3, 4)
    // 添加集合后添加5（新建集合添加5）
    println(v :+ 5)
    // 集合前添加0(新建集合添加0)
    println(5 +: v)
    // 初始化构建高效数组缓存
    val array = ArrayBuffer(1, 2, 3, 4)
    // 添加元素5
    println(array += 5)
    // 删除元素1
    println(array -= 1)
    // 初始化Set集合对象
    val number = Set(1, 2, 3)
    // 添加4元素(新建set集合添加4)
    println(number + 4)
    // 添加4元素(新建set集合移除3)
    println(number - 3)
    // 使用++添加多个set元素(结果为无序的)
    println(number ++ Set(4, 5, 6))
    // 使用--移除set中的元素
    println(number -- Set(1, 2, 5))
    // 初始化创建List集合映射map
    val name = List("Bob", "Michael", "Marry")
    println(name.map(_.toUpperCase))
    val result = for (n <- name) yield n.toUpperCase
    println(result)
    // 拼接字符串
    def unclase(string: String) = Vector(string.toLowerCase(), string.toUpperCase())
    println(name.flatMap(unclase))
  }
}
