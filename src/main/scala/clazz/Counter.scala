package clazz

import scala.beans.BeanProperty

/**
  * 构造Scala的对象
  *
  * @author CodeGeekGao
  * @version Id: Counter.java, v 0.1 2018/9/10 9:37 CodeGeekGao Exp $$
  */
class Counter {
  // 构造变量value
  private var value = 0

  private var privateAge = 0

  private val timestamp = new java.util.Date()

  var username = ""
  var score = 0

  /**
    * 构造器
    *
    * @param username
    */
  def this(username: String) {
    this()
    this.username = username
  }

  /**
    * 辅助构造器
    *
    * @param username
    * @param score
    */
  def this(username: String, score: Int) {
    // 调用上一个构造器
    this(username)
    this.score = score
  }

  // 主构造器
  class Counter() {
    println("主构造器")

    def des = "name=" + name + ",age=" + age
  }

  @BeanProperty
  var name: String = _

  def increment(): Unit = {
    value += 1
  }

  def current(): Int = {
    value
  }

  def time(): java.util.Date = {
    timestamp
  }

  // get方法
  def age = privateAge

  // set方法
  def age_(newValue: Int): Unit = {
    if (newValue > privateAge) {
      privateAge = newValue
    }
  }
}
