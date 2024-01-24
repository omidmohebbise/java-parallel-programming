package org.omidmohebbise.parallel.basic.practice01;

public class MainClass {
    public static void main(String[] args) {
        Thread t1 = new SimpleThread();
        Thread t2 = new Thread(new SimpleRunnable());

        t1.start();
        t2.start();

    }
}
