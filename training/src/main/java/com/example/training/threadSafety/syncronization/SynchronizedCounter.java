package com.example.training.threadSafety.syncronization;

import java.util.concurrent.TimeUnit;

public class SynchronizedCounter {
    private int count;

    public SynchronizedCounter() {
        count = 0;
    }

    public synchronized void increment() {
        int temp = count;
        try {
            TimeUnit.MILLISECONDS.sleep(10); // Introducing a delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count = temp + 1;
    }

    public synchronized void decrement() {
        count--;
    }

    public synchronized int getCount() {
        return count;
    }
}

class SyncWorkerThread extends Thread {
    private SynchronizedCounter SyncCounter;

    public SyncWorkerThread(SynchronizedCounter counter) {
        this.SyncCounter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            SyncCounter.increment();
            // System.out.println("Sync " + Thread.currentThread().getId()+" count: " + SyncCounter.getCount());
        }
    }
}