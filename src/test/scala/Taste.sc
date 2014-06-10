val URL = """(.*\.([a-z]+))/(.*)""".r

def splitURL(url : String) = url match {
  case URL(protocol,jj,kk) => ((kk))
}

val url = splitURL("www.liftcookbook.com/#ajax")
println(url)


