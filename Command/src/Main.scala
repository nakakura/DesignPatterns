/**
 * Created with IntelliJ IDEA.
 * User: nakakura
 * Date: 2013/08/02
 * Time: 17:12
 * To change this template use File | Settings | File Templates.
 */
object Main {
  def main(args: Array[String]){
    val sensor = new Sensor()
    sensor.append(new AlarmCommand())
    sensor.append(new CPUCommand())
    sensor.append((new FanCommand()))

    println("20度のとき")
    sensor.checkTemperture(20)
    println("45度のとき")
    sensor.checkTemperture(45)
  }
}