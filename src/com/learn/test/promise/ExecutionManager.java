package com.learn.test.promise;

import java.util.List;

public interface ExecutionManager {

  void setExecutions(List<Execution> exes);

  void start();

}