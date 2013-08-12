/**
 * Created with IntelliJ IDEA.
 * User: nakakura
 * Date: 8/12/13
 * Time: 7:56 PM
 * To change this template use File | Settings | File Templates.
 */
object Main {
  def main(args: Array[String]){
    val sensor = new Sensor()
    val heater = new Heater()
    val dehumidifier = new Dehumidifier()
    sensor.addObserver(heater)
    sensor.addObserver(dehumidifier)

    for(i <- 1 to 10){
      println("##########計測%d回目##########".format(i))
      sensor.check
      println()
      Thread.sleep(1000)
    }
  }
}