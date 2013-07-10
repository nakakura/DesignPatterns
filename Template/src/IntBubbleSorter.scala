/**
 * Created with IntelliJ IDEA.
 * User: nakakura
 * Date: 7/10/13
 * Time: 5:03 PM
 * To change this template use File | Settings | File Templates.
 */
class IntBubbleSorter extends BubbleSortTemplate[Int]{
  def compare(data: Array[Int], posA: Int, posB: Int): Boolean = {
    return data(posA) > data(posB)
  }
}
