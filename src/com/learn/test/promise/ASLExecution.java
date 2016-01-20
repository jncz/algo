package com.learn.test.promise;
public class ASLExecution extends SyncExecution{
    Condition condition = new Condition();
    public ASLExecution(String name) {
      super(name);
    }
    
    @Override
    public void execution() {
      Log.log("Started: "+name);
      Services.runAsync(new Listener(condition));
      condition.waitUntilComplete();
      Log.log("End: "+name);
    }
  }