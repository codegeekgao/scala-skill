package objectDemo

/**
  * ${DESCRIPTION} 
  *
  * @author CodeGeekGao
  * @version Id: DoNothing.java, v 0.1 2018/9/10 14:35 CodeGeekGao Exp $$
  */
class DoNothing extends UndoableAction("do Nothing") {
  override def undo() {}

  override def redo() {}
}
