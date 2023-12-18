package org.omidmohebbise.parallel.basic.practice9;

import java.util.concurrent.locks.Lock;

class MyThread extends Thread{
    private final Lock firstLock, secondLock;
    public static int counter = 500_000;

    public MyThread(String name, Lock firstLock, Lock secondLock) {
        super(name);
        this.firstLock = firstLock;
        this.secondLock = secondLock;
    }


    @Override
    public void run() {
        while (counter > 0 ){
            // lock
            firstLock.lock();
            secondLock.lock();

            if(counter>0){
                counter--;
                System.out.print("\r" + counter);
            }

            //unlcok
            firstLock.unlock();
            secondLock.unlock();
        }


    }
}