package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyRunnable implements Runnable{
    private final String taskNumber;

    public MyRunnable(String taskNumber){
        this.taskNumber = taskNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 2; i++) {
            System.out.println(taskNumber + " was performed by " + Thread.currentThread().getName());
        }
    }
}

public class Main  {

    public static void main(String[] args) {
        ExecutorService ourExecutor = Executors.newFixedThreadPool(5);

        for (int i = 1; i <=5; i++) {
            Runnable ourTask = new MyRunnable("Task number " + i);
            ourExecutor.submit(ourTask);
        }

        ourExecutor.shutdown();
    }

}
