/***********************************************************************
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
package com.learn.test.promise;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;



public class PromiseTest {
  public class Listener {
    private CountDownLatch latch;
    public Listener(CountDownLatch latch) {
      this.latch = latch;
    }
    
    void onSuccess(){
      latch.countDown();
    }
    
    void onError(){
      latch.countDown();
    }
    
    void onXX(){
      
    }

  }

  public static class Services {

    public static void runAsync(Listener listener) {
      // TODO Auto-generated method stub
      
    }

  }

  public interface Job {

    List<Execution> getExecutions();

  }

  public interface Execution {

    void execution();

  }
  
  class SyncExecution implements Execution{

    @Override
    public void execution() {
      
    }
    
  }
  
  class AsyncExecution implements Execution{
    CountDownLatch latch = makeLatch();
    @Override
    public void execution() {
      Services.runAsync(new Listener(latch));
      try {
        latch.await();
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
    
  }

  public interface ExecutionManager {

    void setExecutions(List<Execution> exes);

    void start();

  }

  public interface JobManager {

    void startJob(Job job);

  }

  public static void main(String[] args){
    JobManager m = makeJobManager();
    Job job = null;
    m.startJob(job);
  }

  public CountDownLatch makeLatch() {
    // TODO Auto-generated method stub
    return null;
  }

  private static JobManager makeJobManager() {
    return new JobManager(){

      @Override
      public void startJob(Job job) {
        ExecutionManager em = makeExecutionManager();
        em.setExecutions(job.getExecutions());
        try{
          em.start();
        }catch(Exception e){
          handleError(e);
        }
      }};
  }

  protected static void handleError(Exception e) {
    // TODO Auto-generated method stub
    
  }

  protected static ExecutionManager makeExecutionManager() {
    return new ExecutionManager(){

      private List<Execution> executions;

      @Override
      public void setExecutions(List<Execution> exes) {
        this.executions = exes;
      }

      @Override
      public void start() {
        Iterator<Execution> it = executions.iterator();
        while(it.hasNext()){
          Execution exe = it.next();
          try{
            exe.execution();
          }catch(Exception e){
            handleError(e);
          }
        }
      }
      
    };
  }
  
}
