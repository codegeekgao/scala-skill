import java.time.LocalDate
import java.time.format.DateTimeFormatter

import clazz.{Counter, Person}
import ifJudge.DemoIf
import org.junit.Test

/**
  * test for Scala
  *
  * @author CodeGeekGao
  * @version Id: ScalaTest.java, v 0.1 2018/9/10 10:04 CodeGeekGao Exp $$
  */
class ScalaTest {

  private val shortFormat: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
  @Test
  def testCounter(): Unit = {
    val counter = new Counter("user", 12)
    counter.increment()
    println(counter.current())
    counter.age_(10)
    println(counter.age, counter.time())
    counter.setName("haha")
    println(counter.getName)
    val pserson = new Person("haha", 12)
  }

  @Test
  def testRegix(): Unit = {
    val haha = DemoIf.sequenceNoParse("JCLQ_HH|20180327303=-13.5#63(1.75),20180327304=80(1.50),20180327305=80(1.75),20180327306=202.5#59(1.75),20180327308=-3.5#60(1.75),20180331303=-5.5#60(1.75),20180331306=-5.5#60(1.68)|7*1")
    println(haha)
    println(List(1124124124L, 32423423L, 456456546456546L, 568658568L, 2432423423424234L, 43L).min)
    println(getToday)
  }

  def getToday: String = {
    val yesterday: LocalDate = LocalDate.now
    yesterday.format(shortFormat) + " 00:00:00"
  }
}
