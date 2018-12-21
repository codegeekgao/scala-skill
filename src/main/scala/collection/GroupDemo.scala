package collection

object GroupDemo {

  def main(args: Array[String]): Unit = {
      // 测试group by
   val personList= List(new Person("张三",23),new Person("李四",24),new Person("高飞",25))
  val list=  personList.groupBy(person=>{
      (person.name,person.age)
    })

    println(list)
    println(list.map(_._1))
    println(list.map(_._1._1))
    println(list.map(_._1._2))
    println(list.map(_._2))
  }
}
