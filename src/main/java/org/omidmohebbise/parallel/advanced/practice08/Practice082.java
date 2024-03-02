package org.omidmohebbise.parallel.advanced.practice08;


import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class Practice082 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Void> future1 =  CompletableFuture.runAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello World 1");

        }).thenAccept(unused -> System.out.println(unused));

        CompletableFuture<String> future2 =  CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Hello world 2";

        });
        future1.get();
        System.out.println(future2.get());
        System.out.println("end of main");
    }
}
