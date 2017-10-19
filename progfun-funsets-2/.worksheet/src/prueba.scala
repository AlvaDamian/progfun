object prueba {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(104); 
  def forScala(i:Int, fx : (Int)=> Boolean):Unit =
         if (fx(i)) forScala(i+1, fx);System.out.println("""forScala: (i: Int, fx: Int => Boolean)Unit""");$skip(91); 
  
  def imprimirHasta10(a:Int) : Boolean =
     if (a<10) { println(a); true } else false;System.out.println("""imprimirHasta10: (a: Int)Boolean""");$skip(41); 
         
  forScala(0, imprimirHasta10)}
}
