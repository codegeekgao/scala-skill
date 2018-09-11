package objectDemo

/**
  * 单列对象
  *
  * @author CodeGeekGao
  * @version Id: Accounts.java, v 0.1 2018/9/10 14:04 CodeGeekGao Exp $$
  */
object Accounts {

  private var lastNumber = 0

  /**
    * 定义一个getNumber的方法
    *
    * @return
    */
  def getNumber(): Int = {
    lastNumber += 1
    lastNumber
  }

  def main(args: Array[String]): Unit = {
    // 相当于java静态方法调用
    println(Accounts.getNumber())
  }
}
