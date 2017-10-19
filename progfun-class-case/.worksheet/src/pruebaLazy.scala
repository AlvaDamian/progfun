object pruebaLazy {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(49); 

	val x = { println("x"); 1 };System.out.println("""x  : Int = """ + $show(x ));$skip(34); 
	lazy val y = { println("y"); 1 };System.out.println("""y: => Int""");$skip(29); 
	val z = { println("z"); 1 };System.out.println("""z  : Int = """ + $show(z ));$skip(8); val res$0 = 
  x+y+z;System.out.println("""res0: Int = """ + $show(res$0));$skip(62); 

  def and(p1:Boolean, p2: =>Boolean) = if (p1) p2 else false;System.out.println("""and: (p1: Boolean, p2: => Boolean)Boolean""");$skip(60); 
  def or(p1:Boolean, p2: =>Boolean) = if (!p1) p2 else true;System.out.println("""or: (p1: Boolean, p2: => Boolean)Boolean""");$skip(26); 

	def loop:Boolean = loop;System.out.println("""loop: => Boolean""");$skip(20); val res$1 = 

  and(false, loop);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(17); val res$2 = 
  or(true, loop);System.out.println("""res2: Boolean = """ + $show(res$2))}
}
