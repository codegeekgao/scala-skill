package scala.vo

import scala.beans.BeanProperty

/**
  * 学生类
  */
class Student extends Serializable {
  /**
    * 姓名
    */
  @BeanProperty
  var name: String = _
  /**
    * 年龄
    */
  @BeanProperty
  var age: Int = _
  /**
    * 所属年级
    */
  @BeanProperty
  var grade: String = _


  override def toString = s"Student($name, $age, $grade)"
}

object Student {

  def apply(name: String, age: Int, grade: String): Student = {
    val student = new Student
    student.name = name
    student.age = age
    student.grade = grade
    student
  }

  def main(args: Array[String]): Unit = {
    val s = Student("张三",23,"高三")
    println(s

    )
  }
}
