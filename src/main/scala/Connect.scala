/**
 * Created by f3r10 on 10/06/14.
 */
import reactivemongo.api._
import scala.concurrent.ExecutionContext.Implicits.global
object Connect {

  def main(args: Array[String]) {
    val prueba = getDataBase("test")
    println(prueba)
  }





  def getDataBase (dataBase:String)=
  {
    val driver = new MongoDriver()
    val connection = driver.connection(List("localhost"))
    val db = connection.db(dataBase)
    var co

  }









}
