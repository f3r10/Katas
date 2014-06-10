/**
 * Created by f3r10 on 09/06/14.
 */
class GetIdOfUrl extends UnitSpec{

  "SplitUrl.getId" should "return the id founded in the url" in
    {
      SplitUrl.getId("http://myurl.com/thisIsId/otherPath/secondPath") should be ("thisIsId/otherPath/secondPath")
      SplitUrl.getUrlMain("http://myurl.com/thisIsId/otherPath/secondPath") should be ("http://myurl.com")
      SplitUrl.getId("http://www.talenteca.com/job?id=112asd23123") should be ("job?id=112asd23123")
      SplitUrl.getUrlMain("http://www.talenteca.com/job?id=112asd23123") should be ("http://www.talenteca.com")
      SplitUrl.getId("www.liftcookbook.com/#ajax") should be ("#ajax")
    }

}
