/**
 * Created with IntelliJ IDEA.
 * User: nakakura
 * Date: 2013/08/02
 * Time: 17:12
 * To change this template use File | Settings | File Templates.
 */
object Main {
  def main(args: Array[String]){
    recv("PUT")
    recv("POST")
    recv("GET")
    recv("OTHER")
  }

  // ソケットでメッセージを受信したつもり
  def recv(protocolMessage: String){
    val command: NetworkCommand = CommandFactory.factory(protocolMessage)
    command.execute()
  }
}