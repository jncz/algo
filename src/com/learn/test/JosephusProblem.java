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

import java.util.LinkedList;
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
  private static int step;

  private static LinkedList<Integer> q = new LinkedList<Integer>();
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    peopleNum = scan.nextInt();//1--N
    step = scan.nextInt();// > 1
    
    paramCheck();
    initQueue();    
    solution();
    scan.close();
  }

  private static void paramCheck() {
    if(peopleNum < 1){
      throw new IllegalArgumentException("People number should bigger than 1");
    }
    
    if(step < 0){
      throw new IllegalArgumentException("eliminatedStep should be greater than 1");
    }
  }

  private static void solution() {
    eliminate(q, -1, step);
  }

  private static void eliminate(LinkedList<Integer> list, int currentRemoveIdx, int step) {
    if(list.isEmpty()){
      return;
    }

    int left = step % list.size();
    if(currentRemoveIdx == -1){
      currentRemoveIdx = left -1;
    }else{
      currentRemoveIdx += step;
      currentRemoveIdx --;
    }
    currentRemoveIdx = currentRemoveIdx % list.size();
  
    handle(list.get(currentRemoveIdx));
    list.remove(currentRemoveIdx);

    eliminate(list, currentRemoveIdx, step);
  }

  private static void handle(Integer integer) {
    System.out.print(integer+" ");
  }

  private static void initQueue() {
    for(int i=0;i<peopleNum;i++){
      q.add(i);
    }
  }

}
