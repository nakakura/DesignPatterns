/**
 * Created with IntelliJ IDEA.
 * User: nakakura
 * Date: 2013/08/02
 * Time: 17:26
 * To change this template use File | Settings | File Templates.
 */

import collection.mutable.LinkedList

class Sensor {
  val commandList = LinkedList[SensorCommand](new NullCommand())

  def append(command: SensorCommand){
    commandList.append(LinkedList(command))
  }

  def checkTemperture(temperture: Int) {
    if(temperture > 40){ //40度以上になるととりあえず全ての機器に伝える(だけでよい)
      commandList.foreach(command=>
        command.execute()
      )
    }
  }
}
