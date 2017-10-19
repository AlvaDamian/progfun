package utils

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

/**
 * This class is a test suite for the methods in object FunSets. To run
 * the test suite, you can either:
 *  - run the "test" command in the SBT console
 *  - right-click the file in eclipse and chose "Run As" - "JUnit Test"
 */
@RunWith(classOf[JUnitRunner])
class ListIntUtilsSuite extends FunSuite {

import utils.ListIntUtils._

  test("test de test") {
    assert(1 + 2 === 3)
  }

  test("max 1,2,3,4 es 4") {
    assert(mayor(List(1,2,3,4))==4)
  }

  test("max 1,2,3,4,1,2,3,4 es 4") {
    assert(mayor(List(1,2,3,4,1,2,3,4))==4)
  }
  
  test("min 1,2,3,4 es 1") {
    assert(menor(List(1,2,3,4))==1)
  }
  
  test("min 1,2,3,4,1,2,3,4 es 1") {
    assert(menor(List(1,2,3,4,1,2,3,4))==1)
  }
  
  test("minimos 1,2,3,4,1,2,3,4 de 10 son 1,2,3,4,1,2,3,4") {
    assert(minimos(List(1,2,3,4,1,2,3,4),10)==List(1,2,3,4,1,2,3,4))
  }
  
  test("minimos 1,2,3,4,1,2,3,4 de 3 son 1,2,1,2") {
    assert(minimos(List(1,2,3,4,1,2,3,4),3)==List(1,2,1,2))
  }
  
  test("maximos 1,2,3,4,1,2,3,4 de 0 son 1,2,3,4,1,2,3,4") {
    assert(maximos(List(1,2,3,4,1,2,3,4),0)==List(1,2,3,4,1,2,3,4))
  }
  
  test("maximos 1,2,3,4,1,2,3,4 de 1 son 2,3,4,2,3,4") {
    assert(maximos(List(1,2,3,4,1,2,3,4),1)==List(2,3,4,2,3,4))
  }
  
  test("contar 1,2,3,4,5 es 5") {
    assert(contar(List(1,2,3,4,5))==5)
  }
  
  test("promedio 1,2,3,4,0 es 2") {
    assert(promedio(List(1,2,3,4,0))==2)
  }
  
  test("filtrarPares 1,2,3,4,5 es 2,4") {
    assert(filtrarPares(List(1,2,3,4,5))==List(2,4))
  }
  
  test("filtrarMultiplosDeTres 1,2,3,4,5 es 3") {
    assert(filtrarMultiplosDeTres(List(1,2,3,4,5))==List(3))
  }
  
  test("filtrarMultiplosDeTres 1,2,3,4,5,6 es 3,6") {
    assert(filtrarMultiplosDeTres(List(1,2,3,4,5,6))==List(3,6))
  }
  
  test("acumularUnidad 1,2,3,4,5 es 15") {
    assert(acumularUnidad(List(1,2,3,4,5))==15)
  }
  
  test("acumular Doble 1,2,3,4 es 20") {
    assert(acumularDoble(List(1,2,3,4))==20)
  }
    
  test("acumular Cuadrado 1,2,3,4 es 30") {
    assert(acumularCuadrado(List(1,2,3,4))==30)
  }
  
}
