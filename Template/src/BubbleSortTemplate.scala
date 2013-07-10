/**
 * Created with IntelliJ IDEA.
 * User: nakakura
 * Date: 7/10/13
 * Time: 4:47 PM
 * To change this template use File | Settings | File Templates.
 */
trait BubbleSortTemplate[S] {
  def sort(inputData: Array[S]): Array[S] = {
    if(inputData.length <= 1) return inputData
    for ( i <- 1 to inputData.length; j <- 0 until inputData.length - i) {
      if (compare(inputData, j, j+1)){
        this.swap(inputData, j, j+1)
      }
    }

    return inputData
  }

  def swap(data: Array[S], posA: Int, posB: Int): Unit = {
    val temp = data(posA)
    data(posA) = data(posB)
    data(posB) = temp
  }

  def compare(data: Array[S], posA: Int, posB: Int): Boolean
}
