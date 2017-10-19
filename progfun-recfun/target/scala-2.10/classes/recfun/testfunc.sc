package recfun

object testfunc {
 
	def resto(dividendo:Int, divisor:Int):Int= dividendo - (dividendo - dividendo % divisor)
                                                  //> resto: (dividendo: Int, divisor: Int)Int
	
	resto(100, 12)                            //> res0: Int = 4
	resto(100, 15)                            //> res1: Int = 10
	resto(100, 3)                             //> res2: Int = 1
	resto(100, 4)                             //> res3: Int = 0
	
	def contarRestos(money:Int, coins:List[Int]):Int =
  if(coins.isEmpty) 0
  else if(money % coins.head == 0) 1 + contarRestos(money, coins.tail)
  else contarRestos(money, coins.tail)            //> contarRestos: (money: Int, coins: List[Int])Int
      
	contarRestos(4, List(1, 2))               //> res4: Int = 2
}