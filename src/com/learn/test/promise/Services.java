package com.learn.test.promise;
public class Services {

    public static void runAsync(Listener listener) {
      asyncWorking(listener);
    }

    static void asyncWorking(final Listener listener) {
      Runnable r = new Runnable() {

        @Override
        public void run() {
          for (int i = 0; i < 3; i++) {
            Log.log("async working");
            try {
              Thread.sleep(1000);
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }
          listener.onSuccess();
        }

      };
      Thread t = new Thread(r);

      t.start();
    }
  }