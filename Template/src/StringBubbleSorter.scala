/**
 * Created with IntelliJ IDEA.
 * User: nakakura
 * Date: 7/10/13
 * Time: 5:11 PM
 * To change this template use File | Settings | File Templates.
 */
class StringBubbleSorter extends BubbleSortTemplate[String]{
  def compare(data: Array[String], posA: Int, posB: Int): Boolean = {
    return data(posA) > data(posB)
  }
}
