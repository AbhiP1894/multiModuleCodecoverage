package io.jitpack;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

 App calculator = new App();
 
 @Test
 public void testAddition() {
     assertEquals(5.0, calculator.add(2.0, 3.0), 0);
     assertEquals(0.0, calculator.add(-2.0, 2.0), 0);
 }
 @Test
 public void testSubtraction() {
     assertEquals(1.0, calculator.subtract(3.0, 2.0), 0);
     assertEquals(-4.0, calculator.subtract(-2.0, 2.0), 0);
 }

 //@Test
 //public void testMultiplication() {
   //  assertEquals(6.0, calculator.multiply(2.0, 3.0), 0);
     //assertEquals(-4.0, calculator.multiply(-2.0, 2.0), 0);
 //}

//@Test
 //public void testDivision() {
   //  assertEquals(2.0, calculator.divide(6.0, 3.0), 0);
 //}

@Test(expected = IllegalArgumentException.class)
 public void testDivisionByZero() {
     calculator.divide(6.0, 0.0);
 }
}
