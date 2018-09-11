import clazz.{Counter, Person}
import org.junit.Test

/**
  * test for Scala
  *
  * @author CodeGeekGao
  * @version Id: ScalaTest.java, v 0.1 2018/9/10 10:04 CodeGeekGao Exp $$
  */
class ScalaTest {

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
}
