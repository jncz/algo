package com.learn.test.promise;
class AsyncExecution implements Execution{
    Condition condition = new Condition();
    @Override
    public void execution() {
      Services.runAsync(new Listener(condition));
      condition.waitUntilComplete();
    }
    
  }