package com.titiredennis.curs13;

import com.titiredennis.curs12.MyQueue;

public class Main {
    public static void main(String[] args) {
        MyQueue<Integer>myQueue = new MyQueue<>();

        Producer producer = new Producer();

        Consumer consumer1 = new Consumer("Cons1");
        Consumer consumer2 = new Consumer("Cons2");
        Consumer consumer3 = new Consumer("Cons3");

        producer.produce(myQueue);
        consumer1.consume(myQueue);
        consumer2.consume(myQueue);
        consumer3.consume(myQueue);
    }
}
