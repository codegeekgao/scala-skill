package regex

import java.util

import org.apache.commons.lang3.StringUtils

import scala.collection.JavaConversions._

/**
  * Regex demo
  *
  * @author CodeGeekGao
  * @version Id: RegexDemo.java, v 0.1 2018/9/11 14:20 CodeGeekGao Exp $$
  */
object RegexDemo {

  def main(args: Array[String]): Unit = {
   // RegexFind
    // 定义一个函数
    val trint = (x: Int) => 2 * x
    val fun = 2 * (_: Int)
    println(((1.to(9)).map(0.1 * _)))
    (1.to(9)).map("*" * _).foreach(println _)

    // currying 柯里化
    def mulOneAtTime(x: Int) = (y: Int) => x * y
    // 闭包函数
    println(mulOneAtTime(6)(7))
    // 使用Option避免空指针异常
  //  println(Option(null).isEmpty)

  //  validate11x5("R5|03$01,02,04,07,11")
    demo
  }

  private def demo() = {
    val map = new util.HashMap[String, String]()
    map.put("key", "value")
    map.put("key1", "value1")
    //TODO map. case 有啥含义？
    map.map({ case (key: String, value: String) => print(key + " ") })

    val payslip = "JCZQ_HH|20170628018=83(3.00),20170629001=83(3.00)/81(3.35)|1*1,2*1"

    val list = StringUtils.replaceAll(payslip, "\\(.*?\\)", "").split(";").flatMap(code => code.split("\\|")(1).split(",").map(str => {
      StringUtils.split(str, "=")(0)
    })).toSet.toList
    val code = StringUtils.replaceAll(payslip, "\\(.*?\\)", "")
    val coc = code.split("[|]")(1)
    val lip = "20181104302=5.5#63(1.81),20181104304=-9.5#60(1.68),20181104305=4.5#63(1.81)"
    println()
    (lip.split("=")(2).split("/").foreach(println(_)))

    val arr = List("1", "2", "3", "4", "5", "6")
    arr.combinations(3).foreach(item => println(item.mkString(",")))
  }

  def sequenceNoParse(payslip: String): List[String] = {
    StringUtils.replaceAll(payslip, "\\(.*?\\)", "").split(";").flatMap(code => code.split("\\|")(1).split(",").map(str => {
      StringUtils.split(str, "=")(0)
    })).toSet.toList
  }

  def RegexFind = {
    // 初始化正则对象
    val numPattern = "[0-9]+".r
    val regex = "13 welcome to beijing"
    // findAllIn方法返回遍历所有匹配的迭代器，可以在for循环中使用
    for (matchString <- numPattern.findAllIn(regex)) {
      println(matchString)
    }
    // 查询字符串首个匹配项
    println(numPattern.findFirstIn(regex))
    // 检查某个字符串的开始部分能匹配，可以使用findPrefixOf
    println(numPattern.findPrefixOf(regex))
    for (i <- 1 to 10) {
      print(i)
    }
    println()
  }

  def BigDecimalConver(): Unit = {
    val str = new java.math.BigDecimal(1)
    println(BigDecimal(str))
  }

  /**
    * 11 选5验证
    * @param payslip payslip
    */
  def validate11x5(payslip:String): Unit = {
    println("----start validate---")
    payslip.split(";").map(code=>{
      if(code.contains("$") && code.split("\\|")(0).toCharArray()(1).toString.toInt == 8){
        throw new RuntimeException
      }

      val total = code.split("\\|")(1).split(",").size
      if(code.contains("$") && total < code.split("\\|")(0).toCharArray()(1).toString.toInt){
        throw new RuntimeException
      }
    })
  }
}
