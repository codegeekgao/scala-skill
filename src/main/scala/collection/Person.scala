package collection

import scala.beans.BeanProperty

class Person {

  @BeanProperty
  var name:String=""
  @BeanProperty
  var age:Int=0

  def this(username: String, age: Int) {
    this()
    // 调用上一个构造器
    this.name=username
    this.age = age
  }


  override def toString = s"Person($name, $age)"
}
