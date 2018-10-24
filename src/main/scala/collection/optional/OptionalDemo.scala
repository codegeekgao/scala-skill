package collection.optional

import org.apache.commons.lang3.StringUtils

/**
  * OptionalDemo 学习
  *
  * @author codegeekgao
  * @version Id: OptionalDemo.scala, v 0.1 2018/10/18 15:09 codegeekgao Exp $$
  */
object OptionalDemo {

  def main(args: Array[String]): Unit = {
    val payslip = "JCZQ_HH|20170628018=83(3.00),20170629001=83(3.00)/81(3.35)|1*1,2*1"

  val list=  StringUtils.replaceAll(payslip,"\\(.*?\\)","").split(";").flatMap(code=>code.split("\\|")(1).split(",").map(str => {
      StringUtils.split(str,"=")(0)
    })).toSet.toList
    val code = StringUtils.replaceAll(payslip,"\\(.*?\\)","")
    println(code)
    val coc = code.split("[|]")(1)
    println(coc)
    println(coc.split("=")(1).split("/")(0))
  }
}
