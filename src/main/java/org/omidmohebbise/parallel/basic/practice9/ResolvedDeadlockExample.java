package org.omidmohebbise.parallel.basic.practice9;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class ResolvedDeadlockExample {
    public static void main(String[] args) throws InterruptedException {
        Lock lockA = new ReentrantLock();
        Lock lockB = new ReentrantLock();
        Lock lockC = new ReentrantLock();

        var thread1 = new MyThread("thread 1" , lockA,lockB);
        var thread2 = new MyThread("thread 2" , lockB,lockC);
        var thread3 = new MyThread("thread 3" , lockA,lockC);

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();
    }
}
