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

## Basic/Practice 02: . **Race Condition**

While the code may work as intended, there is a potential issue related to shared data and thread safety.
The counter variable is shared among both threads without any synchronization mechanism.
This can lead to a race condition where the threads may interfere with each other's access to the counter variable,
resulting in unpredictable or incorrect results.

<pre>
```
First ThreadCounter = 87
Second ThreadCounter = 86
```
</pre>