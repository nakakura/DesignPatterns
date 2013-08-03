/**
 * Created with IntelliJ IDEA.
 * User: nakakura
 * Date: 2013/08/02
 * Time: 17:13
 * To change this template use File | Settings | File Templates.
 */
abstract class SensorCommand {
  def execute(): Unit
}

class FanCommand extends SensorCommand{
  def execute(): Unit = {
    println("熱くなったのでファンをまわします")
  }
}

class CPUCommand extends SensorCommand{
  def execute(): Unit = {
    println("熱くなったのでクロックを下げます")
  }
}

class AlarmCommand extends SensorCommand{
  def execute(): Unit = {
    println("熱がこもってきたので管理者に警告を飛ばします")
  }
}

class NullCommand extends SensorCommand{
  def execute(): Unit = {
    //何もしない
  }
}
