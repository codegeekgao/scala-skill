package objectDemo

/**
  * 抽象类
  *
  * @author CodeGeekGao
  * @version Id: UndoableAction.java, v 0.1 2018/9/10 14:33 CodeGeekGao Exp $$
  */
abstract class UndoableAction(val description: String) {
  def undo(): Unit

  def redo(): Unit
}
