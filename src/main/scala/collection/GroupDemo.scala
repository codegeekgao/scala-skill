package collection

import java.util

import scala.collection.mutable.ListBuffer

object GroupDemo {

  def main(args: Array[String]): Unit = {
    // 测试group by
    val personLists = List(new Person("张三", 23), new Person("李四", 24), new Person("高飞", 25))
    val personList = personLists.groupBy(person => {
      (person.name, person.age)
    })

    println(personList)
    println(personList.keys)
    println(personList.map(_._1._1))
    println(personList.map(_._1._2))
    println(personList.values)
    println("========")
    val list = List("1", "2", "3", "4", "5", "6")
    val arrayList = new util.ArrayList[List[String]]()
    list.combinations(2).foreach(e => {
      arrayList.add(e)
    })

    println(arrayList)


    val arr = List("1","2","3","4","5","6")
    arr.combinations(2).foreach(item=>println(item.mkString(",")))

    println(arr.combinations(2).size)
  }
}
