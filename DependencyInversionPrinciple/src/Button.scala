/**
 * Created with IntelliJ IDEA.
 * User: nakakura
 * Date: 7/10/13
 * Time: 3:04 PM
 * To change this template use File | Settings | File Templates.
 */
class Button {
  private val devices: List[Switchable] = List(new Fan(), new Lamp)

  def turnOnAllDevices() = {
    devices.foreach(
      _.turnOn()
    )
  }

  def turnOffAllDevices() = {
    devices.foreach(
      _.turnOff()
    )
  }
}
