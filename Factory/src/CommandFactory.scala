/**
 * Created with IntelliJ IDEA.
 * User: nakakura
 * Date: 8/3/13
 * Time: 8:50 PM
 * To change this template use File | Settings | File Templates.
 */
object CommandFactory {
  def factory(protocolMessage: String): NetworkCommand = {
    return protocolMessage match {
      case "GET" => new GetCommand()
      case "POST" => new PostCommand()
      case "PUT" => new PutCommand()
      case _ => new NullCommand()
    }
  }
}
