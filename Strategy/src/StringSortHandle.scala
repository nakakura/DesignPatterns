/**
 * Created with IntelliJ IDEA.
 * User: nakakura
 * Date: 7/10/13
 * Time: 10:55 PM
 * To change this template use File | Settings | File Templates.
 */
class StringSortHandle extends SortHandle[String]{
  var array: Array[String] = Array[String]()

  def swap(array: Array[String], posA: Int, posB: Int){
    val temp = array(posA)
    array(posA) = array(posB)
    array(posB) = temp
  }

  def compare(array: Array[String], posA: Int, posB: Int): Boolean = {
    return array(posA) > array(posB)
  }

  def length(): Int = array.length

  def setArray(array: Array[String]){
    this.array = array
  }
}
