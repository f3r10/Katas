/**
 * Created by f3r10 on 09/06/14.
 */
object SplitUrl {
  val URL = """(.*\.([a-z]+))/(.*)""".r
  def getId(url:String)= url match
  {
      case URL(urlMain,tld,id) =>((id))
  }

  def getUrlMain(url:String)= url match
  {
    case URL(urlMain,tld,id) =>((urlMain))
  }



}
