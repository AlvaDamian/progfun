package utils

import common._

/**
 * Libreria de funciones para Listas de enteros
 */
object ListIntUtils {

  /**
   * Buscar 
   * Dada una lista y una función de comparación, devuelve el valor que cumple la condición. 
   */
  def buscar(lista: List[Int], com:(Int, Int) => Boolean): Int = 
    lista.reduceLeft((accu: Int, x:Int) => if (com(accu,x)) accu else x)
  
  def mayor(lista: List[Int]):Int = buscar(lista, (x, y) => x > y)
    
  def menor(lista: List[Int]):Int = buscar(lista, (x, y) => x < y)
    
  def maximos(lista: List[Int],e: Int) : List[Int]= lista.foldRight(List[Int]())((y, nuevaLista) => if(y > e) nuevaLista.+:(y) else nuevaLista)
    
  def minimos(lista: List[Int],e: Int) : List[Int]= lista.foldRight(List[Int]())((y, nuevaLista) => if(y < e) nuevaLista.+:(y) else nuevaLista)    
        
          
  /**
   * Cuenta los elementos
   */  
  def contar(lista: List[Int]) : Int = lista.length
  
  /**
   * Si aplico el tema
   * def contar(lista: List[Int]) : Int = lista.foldLeft(0)((x, y) => x + 1)
   */
      
  /** 
   *  Acumular
   */
  def acc(lista: List[Int]) : Int = lista.foldLeft(0)((x, y) => x + y)
      
  /** 
   *  Promedio
   */
  def promedio(lista: List[Int]) : Int = acc(lista) / contar(lista)
  
  /**
   * Filtra los elementos de la lista xs segun la funcion p
   */
  def filtrar(xs: List[Int], p: Int => Boolean): List[Int] = 
    xs.foldRight(List[Int]())((y, nuevaLista) => if(p(y)) nuevaLista.+:(y) else nuevaLista)
          
  
  /**
   * Filtra los elementos pares
   */
  def filtrarPares(xs: List[Int]): List[Int] = filtrar(xs, x => x % 2 == 0)
  
  /**
   * Filtra los elementos multiplos de 3
   */
  def filtrarMultiplosDeTres(xs: List[Int]): List[Int] = filtrar(xs, x => x % 3 == 0)
   
   /**
   * Acumula los elementos aplicandoles fx
   */
  def acumular(lista: List[Int])(fx: (Int) => Int): Int = lista.foldLeft(0)((x, y) => x + fx(y))
    
  /**
   * Acumula todos los elementos de una lista
  */ 
  def acumularUnidad(lista: List[Int]): Int = acumular(lista)(x => x)
  
  /**
   * Acumula  el dobles de los elementos de una lista
   */
  def acumularDoble(lista: List[Int]): Int = acumular(lista)(x => x * 2)

    /**
   * Acumula el cuadrado de los elementos de una lista
   */
  def acumularCuadrado(lista: List[Int]): Int = acumular(lista)(x => x * x)
  
}
