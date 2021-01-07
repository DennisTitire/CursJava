package com.titiredennis.curs13;

import com.titiredennis.curs12.MyQueue;

public class Producer {


    int count = 1;

    public void produce(MyQueue<Integer> myQueue) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    myQueue.add(count);
                    count++;
                }
            }
        }).start();
    }
}