package com.learn.test.promise;

public class SyncExecution implements Execution {

  protected String name;

  public SyncExecution(String name) {
    this.name = name;
  }

  @Override
  public void execution() {
    Log.log("Started: " + name);
    syncWorking();
    Log.log("End: " + name);
  }

  static void syncWorking() {
    for (int i = 0; i < 3; i++) {
      Log.log("sync working");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
