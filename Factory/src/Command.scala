/**
 * Created with IntelliJ IDEA.
 * User: nakakura
 * Date: 2013/08/02
 * Time: 17:13
 * To change this template use File | Settings | File Templates.
 */
abstract class NetworkCommand {
  def execute(): Unit
}

class GetCommand extends NetworkCommand{
  def execute(): Unit = {
    println("Get Methodへの対応処理")
  }
}

class PostCommand extends NetworkCommand{
  def execute(): Unit = {
    println("Post Methodへの対応処理")
  }
}

class PutCommand extends NetworkCommand{
  def execute(): Unit = {
    println("Put Methodへの対応処理")
  }
}

class NullCommand extends NetworkCommand{
  def execute(): Unit = {
    //何もしない
  }
}
