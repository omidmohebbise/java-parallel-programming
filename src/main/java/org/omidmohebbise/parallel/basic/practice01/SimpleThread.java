package org.omidmohebbise.parallel.basic.practice01;

public class SimpleThread extends Thread{

    @Override
    public void run() {
        int  counter = 10;
        while (counter > 0){
            System.out.println("Simple Thread Subclass: " + counter--);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
