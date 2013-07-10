/**
 * Created with IntelliJ IDEA.
 * User: nakakura
 * Date: 7/10/13
 * Time: 10:49 PM
 * To change this template use File | Settings | File Templates.
 */
class IntSortHandle extends SortHandle[Int]{
  var array: Array[Int] = Array[Int]()

  def swap(array: Array[Int], posA: Int, posB: Int){
    val temp = array(posA)
    array(posA) = array(posB)
    array(posB) = temp
  }

  def compare(array: Array[Int], posA: Int, posB: Int): Boolean = {
    return array(posA) > array(posB)
  }

  def length(): Int = array.length

  def setArray(array: Array[Int]){
    this.array = array
  }
}
