package com.titiredennis.curs13;

import com.titiredennis.curs12.MyQueue;

public class Consumer {

    private String consumerName;
    public Consumer(String consumerName) {
        this.consumerName = consumerName;
    }

    public void consume(MyQueue<Integer>myQueue) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Eu sunt  " + consumerName + " = " + myQueue.get());
                }
            }
        }).start();
    }
}
