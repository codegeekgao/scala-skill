package ifJudge

import org.apache.commons.lang3.StringUtils

object DemoIf {

  /**
    * (下单使用)计算需要扣款的钱包的各个金额
    * 注:: 彩金—> 充值钱包 -> 奖金 —> 积分->现金
    *
    * @param totalAmount 需要消费金额
    */
  val ACCOUNT_ZERO: BigDecimal = 0.00

  def getTradeAmounts(red: BigDecimal, win: BigDecimal,
                      card: BigDecimal, recharge: BigDecimal, totalAmount: BigDecimal): Map[Int, BigDecimal] = {
    var total = totalAmount

    val envelope = if (total >= red) {
      total = total - red
      red
    } else {
      val envelope = total
      total = ACCOUNT_ZERO
      envelope
    }

    val newRecharge = if (total >= recharge) {
      total = total - recharge
      recharge
    } else {
      val rechargeNew = total
      total = ACCOUNT_ZERO
      rechargeNew
    }

    val newPrize = if (total >= win) {
      val newPrize = win
      total = total - win
      newPrize
    }
    else {
      val newPrize = total
      total = ACCOUNT_ZERO
      newPrize
    }

    val newPoint = 0
    val newCard = if (total >= 0) {
      total
    } else {
      ACCOUNT_ZERO
    }


    Map(
      1 -> envelope,
      2 -> newPrize,
      5 -> newRecharge
    )

  }

  //解析成List[sequenceNo]
  def sequenceNoParse(payslip:String):List[String] = {
    StringUtils.replaceAll(payslip,"\\(.*?\\)","").split(";").flatMap(code=>code.split("\\|")(1).split(",").map(str => {
      StringUtils.split(str,"=")(0)
    })).toSet.toList
  }

  def main(args: Array[String]): Unit = {
   // print(this.getTradeAmounts(BigDecimal(10), BigDecimal(10), BigDecimal(10), BigDecimal(10), BigDecimal(5)))

    var list = List(1, 2, 3, 4)
     list=list ++ List(5, 6)
    println(list)
  }
}
