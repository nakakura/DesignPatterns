import scala.util.Random

/**
 * Created with IntelliJ IDEA.
 * User: nakakura
 * Date: 8/12/13
 * Time: 8:00 PM
 * To change this template use File | Settings | File Templates.
 */
trait ObserverTrait[S] {
  def update(subject: S)
}

trait SubjectTrait[S] {
  private var observers: List[ObserverTrait[S]] = Nil
  def addObserver(observer: ObserverTrait[S]) = observers = observer :: observers
  def deleteObserver(observer: ObserverTrait[S]) = observers = observer :: observers
  def notifyObservers(data:S) = observers.foreach(_.update(data))
}

class WeatherData(var temperature: Double, var humidity: Double)

class Sensor extends SubjectTrait[WeatherData]{
  Random.setSeed(1)
  private var lastData = new WeatherData(30.0, 50.0)

  def check{
    lastData.humidity = Random.nextDouble() * 100
    lastData.temperature = Random.nextDouble() * 40
    println("湿度 %.1fパーセント".format(lastData.humidity))
    println("気温 %.1f度".format(lastData.temperature))
    notifyObservers(lastData)
  }
}

class Heater extends ObserverTrait[WeatherData]{
  def update(subject: WeatherData){
    if(subject.temperature < 10) println(" -> ヒーターを入れます")
    else println(" -> ヒーターは必要ありません")
  }
}

class Dehumidifier extends ObserverTrait[WeatherData]{
  def update(subject: WeatherData){
    if(subject.temperature < 30) println(" -> 加湿器を入れます")
    else println(" -> 加湿器は必要ありません")
  }
}
