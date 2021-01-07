package com.titiredennis.curs12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        MyQueue<Integer> myQueue = new MyQueue<>();

        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        System.out.println(myQueue.get());
        System.out.println(myQueue.get());
        System.out.println(myQueue.get());
        System.out.println(myQueue.get());

        new ThreadulMeuCuExtendsThread().start();
        new Thread(new ThredCuRunnable()).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Sunt in run!");
            }
        }).start();
    }
}
