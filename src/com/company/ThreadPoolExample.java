package com.company;
import com.company.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExample {
    public static void main(String[] args) {
        //
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);
        //
        for (int i = 1; i <= 10; i++) {
            Task task = new Task("Gorev : " + i);
            System.out.println("uretiliyor : " + task.getName());
            executor.execute(task);
        }
        executor.shutdown();
    }
}
