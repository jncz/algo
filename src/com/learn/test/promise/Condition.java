package com.learn.test.promise;

import java.util.concurrent.CountDownLatch;

public class Condition {
  private CountDownLatch latch = new CountDownLatch(1);
  public void complete() {
    latch.countDown();
  }
  public void waitUntilComplete() {
    try {
      latch.await();
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  }

}