/**
 * Created with IntelliJ IDEA.
 * User: nakakura
 * Date: 7/10/13
 * Time: 10:33 PM
 * To change this template use File | Settings | File Templates.
 */
class BubbleSorter[T](handle: SortHandle[T]){
  val sortHandle: SortHandle[T] = handle

  def sort(inputData: Array[T]): Array[T] = {
    sortHandle.setArray(inputData)
    val length = sortHandle.length()
    if(inputData.length <= 1) return inputData

    for ( i <- 1 to inputData.length; j <- 0 until length - i) {
      if (sortHandle.compare(inputData, j, j+1)){
        sortHandle.swap(inputData, j, j+1)
      }
    }

    return inputData
  }
}
