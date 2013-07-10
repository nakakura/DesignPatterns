/**
 * Created with IntelliJ IDEA.
 * User: nakakura
 * Date: 7/10/13
 * Time: 10:37 PM
 * To change this template use File | Settings | File Templates.
 */
trait SortHandle[T] {
  var array: Array[T]
  def swap(array: Array[T], posA: Int, posB: Int)
  def compare(array: Array[T], posA: Int, posB: Int): Boolean
  def length(): Int
  def setArray(array: Array[T])
}
