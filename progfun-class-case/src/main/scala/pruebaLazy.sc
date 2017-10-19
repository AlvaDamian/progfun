object pruebaLazy {

	val x = { println("x"); 1 }               //> x
                                                  //| x  : Int = 1
	lazy val y = { println("y"); 1 }          //> y: => Int
	val z = { println("z"); 1 }               //> z
                                                  //| z  : Int = 1
  x+y+z                                           //> y
                                                  //| res0: Int = 3

  def and(p1:Boolean, p2: =>Boolean) = if (p1) p2 else false
                                                  //> and: (p1: Boolean, p2: => Boolean)Boolean
  def or(p1:Boolean, p2: =>Boolean) = if (!p1) p2 else true
                                                  //> or: (p1: Boolean, p2: => Boolean)Boolean

	def loop:Boolean = loop                   //> loop: => Boolean

  and(false, loop)                                //> res1: Boolean = false
  or(true, loop)                                  //> res2: Boolean = true
}