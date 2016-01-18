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

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
  private LinkedList<Integer> list = new LinkedList<Integer>();
  @Before
  public void setUp() throws Exception {
    initList();
  }

  private void initList() {
    for(int i=0;i<10;i++){
      list.add(i);
    }
  }

  @After
  public void tearDown() throws Exception {
    list.clear();
  }

  @Test
  public void test() {
    assertTrue(list.getFirst().equals(0));
    assertTrue(list.getLast().equals(9));
  }
  
  @Test
  public void test_reorder_list(){
    Integer ele = list.get(2);
    list.remove(2);
    
    list.addLast(ele);
    
//    for()
  }

}
