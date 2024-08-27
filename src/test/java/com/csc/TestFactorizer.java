package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFactorizer {

  Factorizer factorizer;

  @BeforeEach
  void setUp() {
    factorizer = new Factorizer();
  }

  // Replace the following example tests with your own tests
  // of the prime factorization function.
  @Test
  public void testZero() {
    assertEquals(null, factorizer.primeListGeneration(0));
  }

  @Test
  public void testSix() {
    assertEquals("3x2", factorizer.primeListGeneration(6));
  }

  @Test
  public void testFifty() {
    assertEquals("5x5x2", factorizer.primeListGeneration(50));
  }

  @Test
  public void test20() {
    assertEquals("5x2x2", factorizer.primeListGeneration(20));
  }

  @Test
  public void test81() {
    assertEquals("3x3x3x3", factorizer.primeListGeneration(81));
  }

  @Test
  public void test625() {
    assertEquals("5x5x5x5", factorizer.primeListGeneration(625));
  }

  @Test
  public void isPrime17() {
    assertEquals(true, factorizer.isPrime(17));
  }

  @Test
  public void isPrime27() {
    assertEquals(false, factorizer.isPrime(27));
  }

  @Test
  public void isPrime13() {
    assertEquals(true, factorizer.isPrime(13));
  }

  @Test
  public void isPrime100() {
    assertEquals(false, factorizer.isPrime(100));
  }

}