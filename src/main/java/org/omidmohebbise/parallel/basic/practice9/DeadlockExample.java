package org.omidmohebbise.parallel.basic.practice9;


import java.util.concurrent.locks.ReentrantLock;


public class DeadlockExample {
    public static void main(String[] args) throws InterruptedException {
        ReentrantLock lock1 = new ReentrantLock();
        ReentrantLock lock2 = new ReentrantLock();
        ReentrantLock lock3 = new ReentrantLock();

        var thread1 = new MyThread("thread 1" , lock1,lock2);
        var thread2 = new MyThread("thread 2" , lock2,lock3);
        var thread3 = new MyThread("thread 3" , lock3,lock1);

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();





    }
}
