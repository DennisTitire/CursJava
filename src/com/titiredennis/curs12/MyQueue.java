package com.titiredennis.curs12;

/*
 * get
 * add
 * isEmpty
 * size
 *
 * cea mai proasta din punc de vedere performanta
 * 1. synchronized pe metoda
 * 2. synchronized pe obiect  <----------
 * 3. Lock
 * 4. Volatile
 *
 * @param <T>
 * */

import java.util.LinkedList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyQueue<T> {

    //Object lock = new Object();
    Lock lock = new ReentrantLock();
    private LinkedList<T> myList = new LinkedList<>();

    public void add(T t) {
        myList.add(t);
    }

    public T get() {
        try {
            if (isEmpty()) {
                return null;
            } else {
                return myList.removeFirst();
                // removeLast() -> face stiva
            }
        } finally {
            lock.unlock();
        }
    }

    public boolean isEmpty() {
        return myList.isEmpty();
    }

    public int getSize() {
        return myList.size();
    }

}
