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
 * irrespective of what has been deposited with the U.S. Copyright Office.
 ************************************************************************/
package com.learn.test;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 
 * @author liping
 *
 *         In the Josephus problem from antiquity, N people are in dire straits and agree to the
 *         following strategy to reduce the population. They arrange themselves in a circle (at
 *         positions numbered from 0 to N-1) and proceed around the circle, eliminating every Mth
 *         person until only one person is left. Legend has it that Josephus figured out where to
 *         sit to avoid being eliminated.
 */
public class JosephusProblem {

  private static int peopleNum;
  private static int eliminatedStep;
  private static int currentRemoveIdx = -1;

  private static LinkedList<Integer> q = new LinkedList<Integer>();
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    peopleNum = scan.nextInt();//1--N
    eliminatedStep = scan.nextInt();//0--(N-1)
    
    paramCheck();
    
    solution();
    scan.close();
  }

  private static void paramCheck() {
    if(peopleNum < 1){
      throw new IllegalArgumentException("People number should bigger than 1");
    }
    
    if(eliminatedStep > peopleNum - 1 || eliminatedStep < 0){
      throw new IllegalArgumentException("eliminatedStep should be 0--(N-1)");
    }
  }

  private static void solution() {
    initQueue();
    eliminate();
  }

  private static void eliminate() {
    if(q.size() == 1){
      return;
    }

    if(currentRemoveIdx == -1){
      currentRemoveIdx = eliminatedStep;
    }
    int a = currentRemoveIdx - q.size();
    if(a >= 1){
      //int b = currentRemoveIdx % q.size();
      currentRemoveIdx = eliminatedStep - a;
    }
    Integer people = q.remove(currentRemoveIdx);
    System.out.print(people+" ");
    currentRemoveIdx += (eliminatedStep+1);
    eliminate();
  }

  private static void initQueue() {
    for(int i=0;i<peopleNum;i++){
      q.add(i);
    }
  }

}
