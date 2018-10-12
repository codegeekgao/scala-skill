package collection

object GroupDemo {

  def main(args: Array[String]): Unit = {
      // 测试group by
   val personList= List(new Person("张三",23),new Person("李四",24),new Person("高飞",25))
    personList.groupBy(person=>{
      (person.age)
    })
  }
}
