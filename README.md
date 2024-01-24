# Java Concurrent Programming

Java provides robust support for concurrent programming, allowing developers to efficiently manage and coordinate multiple tasks. Here are key concepts in Java concurrent programming:

## Basic/Practice 01: . **Threads and Runnable Interface**

- Threads represent the smallest unit of execution in Java. They can be created by extending the `Thread` class or implementing the `Runnable` interface.
  
  Example:

  ```java
  class MyThread extends Thread {
      public void run() {
          // Thread logic here
      }
  }
  
  // Or using Runnable
  class MyRunnable implements Runnable {
      public void run() {
          // Runnable logic here
      }
  }
