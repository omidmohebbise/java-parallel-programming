package org.omidmohebbise.parallel.advanced.practice08;


import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class Practice083 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> future1 =  CompletableFuture.supplyAsync(() -> {
            return "Hello";
        });
        CompletableFuture<String> future2 =  CompletableFuture.supplyAsync(() -> {
            return "World";
        });

        CompletableFuture<String> result =  CompletableFuture.allOf(
                future1,future2
        ).thenCombine(future1.get()+future2);







    }
}
