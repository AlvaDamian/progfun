object prueba {
  def forScala(i:Int, fx : (Int)=> Boolean):Unit =
         if (fx(i)) forScala(i+1, fx)             //> forScala: (i: Int, fx: Int => Boolean)Unit
  
  def imprimirHasta10(a:Int) : Boolean =
     if (a<10) { println(a); true } else false    //> imprimirHasta10: (a: Int)Boolean
         
  forScala(0, imprimirHasta10)                    //> 0
                                                  //| 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
                                                  //| 7
                                                  //| 8
                                                  //| 9
}