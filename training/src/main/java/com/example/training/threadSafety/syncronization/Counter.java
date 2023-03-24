package com.example.training.threadSafety.syncronization;

import java.util.concurrent.TimeUnit;

public class Counter {
    private int count;

    public Counter() {
        count = 0;
    }

    public void increment() {
        int temp = count;
        try {
            TimeUnit.MILLISECONDS.sleep(10); // Introducing a delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count = temp + 1;
    }

    public void decrement() {
        count--;
    }

    public int getCount() {
        return count;
    }
}

class WorkerThread extends Thread {
    private Counter counter;

    public WorkerThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            counter.increment();
            //System.out.println("Not Sync "+ Thread.currentThread().getId()+" count: " + counter.getCount());
        }
    }
}