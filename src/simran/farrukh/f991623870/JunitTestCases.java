/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simran.farrukh.f991623870;

/**
 *
 * @author Simran
 */
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitTestCases {


//print your name here
@Before
public void printName() 
{ 
    System.out.println("Simran Farrukh");
}

 @Test
 public void test01() {
 double tax= MondayFinalExam.calculateTaxForPerson(1000):
  assertEquals(tax, 10.00);
 }

 @Test
 public void test02() {
 double tax= MondayFinalExam.calculateTaxForPerson(50000):
  assertEquals(tax, 15000.00);
 }

@Test
 public void test03() {
 double tax= MondayFinalExam.calculateTaxForPerson(200000):
  assertEquals(tax, 95000.00);
 }


@Test(expected = ArithmeticException.class)
 public void test04() {
 double tax= MondayFinalExam.calculateTaxForPerson(-50000):
 }

@Test(expected = ArithmeticException.class)
 public void test05() {
 double tax= MondayFinalExam.calculateTaxForPerson(5000000000):
 }

@Test
 public void test06() {
 double tax= MondayFinalExam.calculateTaxForPerson(0):
  assertEquals(tax, 0.00);
 }

}