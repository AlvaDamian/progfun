package recfun

object testfunc {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(125); 
 
	def resto(dividendo:Int, divisor:Int):Int= dividendo - (dividendo - dividendo % divisor);System.out.println("""resto: (dividendo: Int, divisor: Int)Int""");$skip(18); val res$0 = 
	
	resto(100, 12);System.out.println("""res0: Int = """ + $show(res$0));$skip(16); val res$1 = 
	resto(100, 15);System.out.println("""res1: Int = """ + $show(res$1));$skip(15); val res$2 = 
	resto(100, 3);System.out.println("""res2: Int = """ + $show(res$2));$skip(15); val res$3 = 
	resto(100, 4);System.out.println("""res3: Int = """ + $show(res$3));$skip(186); 
	
	def contarRestos(money:Int, coins:List[Int]):Int =
  if(coins.isEmpty) 0
  else if(money % coins.head == 0) 1 + contarRestos(money, coins.tail)
  else contarRestos(money, coins.tail);System.out.println("""contarRestos: (money: Int, coins: List[Int])Int""");$skip(36); val res$4 = 
      
	contarRestos(4, List(1, 2));System.out.println("""res4: Int = """ + $show(res$4))}
}
