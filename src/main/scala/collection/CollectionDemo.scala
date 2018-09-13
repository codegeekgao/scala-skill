package collection

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
  }
}
