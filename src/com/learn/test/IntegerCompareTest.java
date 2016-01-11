/************************************************************************
** IBM Confidential
** 
** OCO Source Materials
**
** IBM SPSS Analytic Catalyst
**
** (C) Copyright IBM Corp. 2016
**
** The source code for this program is not published or otherwise divested of its trade secrets, 
** irrespective of what has been deposited with the U.S. Copyright Office.
************************************************************************/
package com.learn.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntegerCompareTest {

  @Test
  public void test_Integer_autobox_m129() {
    Integer i1 = -129;
    Integer i2 = -129;
    
    assertTrue(i1 != i2);
  }
  
  @Test
  public void test_Integer_autobox_m128() {
    Integer i1 = -128;
    Integer i2 = -128;
    
    assertTrue(i1 == i2);
  }
  
  @Test
  public void test_Integer_autobox_m127() {
    Integer i1 = -127;
    Integer i2 = -127;
    
    assertTrue(i1 == i2);
  }
  
  @Test
  public void test_Integer_autobox_0() {
    Integer i1 = 0;
    Integer i2 = 0;
    
    assertTrue(i1 == i2);
  }

  @Test
  public void test_Integer_autobox_127() {
    Integer i1 = 127;
    Integer i2 = 127;
    
    assertTrue(i1 == i2);
  }
  
  @Test
  public void test_Integer_autobox_128() {
    Integer i1 = 128;
    Integer i2 = 128;
    
    assertTrue(i1 != i2);
  }
  
  @Test
  public void test_Integer_autobox_m129_wrapper() {
    Integer i1 = Integer.valueOf(-129);
    Integer i2 = Integer.valueOf(-129);
    
    assertTrue(i1 != i2);
  }
  
  @Test
  public void test_Integer_autobox_m128_wrapper() {
    Integer i1 = Integer.valueOf(-128);
    Integer i2 = Integer.valueOf(-128);
    
    assertTrue(i1 == i2);
  }
  
  @Test
  public void test_Integer_autobox_m127_wrapper() {
    Integer i1 = Integer.valueOf(-127);
    Integer i2 = Integer.valueOf(-127);
    
    assertTrue(i1 == i2);
  }
  
  @Test
  public void test_Integer_autobox_0_wrapper() {
    Integer i1 = Integer.valueOf(0);
    Integer i2 = Integer.valueOf(0);
    
    assertTrue(i1 == i2);
  }

  @Test
  public void test_Integer_autobox_127_wrapper() {
    Integer i1 = Integer.valueOf(127);
    Integer i2 = Integer.valueOf(127);
    
    assertTrue(i1 == i2);
  }
  
  @Test
  public void test_Integer_autobox_128_wrapper() {
    Integer i1 = Integer.valueOf(128);
    Integer i2 = Integer.valueOf(128);
    
    assertTrue(i1 != i2);
  }
  
  @Test
  public void test_Integer_autobox_m129_constructor() {
    Integer i1 = new Integer(-129);
    Integer i2 = new Integer(-129);
    
    assertTrue(i1 != i2);
  }
  
  @Test
  public void test_Integer_autobox_m128_constructor() {
    Integer i1 = new Integer(-128);
    Integer i2 = new Integer(-128);
    
    assertTrue(i1 != i2);
  }
  
  @Test
  public void test_Integer_autobox_m127_constructor() {
    Integer i1 = new Integer(-127);
    Integer i2 = new Integer(-127);
    
    assertTrue(i1 != i2);
  }
  
  @Test
  public void test_Integer_autobox_0_constructor() {
    Integer i1 = new Integer(0);
    Integer i2 = new Integer(0);
    
    assertTrue(i1 != i2);
  }

  @Test
  public void test_Integer_autobox_127_constructor() {
    Integer i1 = new Integer(127);
    Integer i2 = new Integer(127);
    
    assertTrue(i1 != i2);
  }
  
  @Test
  public void test_Integer_autobox_128_constructor() {
    Integer i1 = new Integer(128);
    Integer i2 = new Integer(128);
    
    assertTrue(i1 != i2);
  }
}
