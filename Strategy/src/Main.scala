/**
 * Created with IntelliJ IDEA.
 * User: nakakura
 * Date: 7/10/13
 * Time: 10:34 PM
 * To change this template use File | Settings | File Templates.
 */
object Main {
  def main(args: Array[String]){
    val intSortHandle = new IntSortHandle()
    val stringSoftHandle = new StringSortHandle()

    val sortedInt = new BubbleSorter[Int](intSortHandle).sort(Array(1,2,3,4,5,4,3,2,1))
    val sortedString = new BubbleSorter[String](stringSoftHandle).sort(Array("a", "b", "B", "あ", "漢字", "01", "10", "2"))

    println("sortedInt")
    sortedInt.foreach(println)

    println("sortedString")
    sortedString.foreach(println)
  }
}
