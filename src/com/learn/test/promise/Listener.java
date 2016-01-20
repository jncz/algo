package com.learn.test.promise;

public class Listener {
  private Condition condition;

  public Listener(Condition condition) {
    this.condition = condition;
  }

  void onSuccess() {
    condition.complete();
  }

  void onError() {
    condition.complete();
  }

  void onXX() {

  }

}
