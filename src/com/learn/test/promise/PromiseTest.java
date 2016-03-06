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
 * irrespective of what has been deposited with the U.S. Copyright Office.
 ************************************************************************/
package com.learn.test.promise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PromiseTest {

  public static void main(String[] args) {
    JobManager m = makeJobManager();
    Job job = makeJob();
    m.startJob(job);
  }

  private static Job makeJob() {
    Job job = new Job() {

      @Override
      public List<Execution> getExecutions() {
        List<Execution> exes = new ArrayList<Execution>();
        exes.add(new SyncExecution("First Execution"));
        exes.add(new SyncExecution("Second Execution"));
        exes.add(new ASLExecution("ASL Execution"));
        return exes;
      }

    };
    return job;
  }

  private static JobManager makeJobManager() {
    return new JobManager() {

      @Override
      public void startJob(Job job) {
        ExecutionManager em = makeExecutionManager();
        em.setExecutions(job.getExecutions());
        try {
          em.start();
        } catch (Exception e) {
          handleError(e);
        }
      }
    };
  }

  protected static void handleError(Exception e) {
    Log.log("handle exception");
  }

  protected static ExecutionManager makeExecutionManager() {
    return new ExecutionManager() {

      private List<Execution> executions;

      @Override
      public void setExecutions(List<Execution> exes) {
        this.executions = exes;
      }

      @Override
      public void start() {
        Iterator<Execution> it = executions.iterator();
        while (it.hasNext()) {
          Execution exe = it.next();
          try {
            exe.execution();
          } catch (Exception e) {
            handleError(e);
          }
        }
      }

    };
  }
}
