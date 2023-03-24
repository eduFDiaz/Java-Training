package com.example.training.threadSafety.syncronization;

public class Main {
    public static void Sync(){
        SynchronizedCounter sharedSyncCounter = new SynchronizedCounter();
        
        SyncWorkerThread thread1 = new SyncWorkerThread(sharedSyncCounter);
        SyncWorkerThread thread2 = new SyncWorkerThread(sharedSyncCounter);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sync Final count: " + sharedSyncCounter.getCount());
    }

    public static void NotSync(){
        Counter Counter = new Counter();

        WorkerThread thread4 = new WorkerThread(Counter);
        WorkerThread thread5 = new WorkerThread(Counter);

        thread4.start();
        thread5.start();

        try {
            thread4.join();
            thread5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + Counter.getCount());
    }

    public static void main(String[] args) {
        Sync();
        NotSync();
    }
}
