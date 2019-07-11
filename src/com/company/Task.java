package com.company;

import java.util.concurrent.TimeUnit;

public class Task implements Runnable {
    private String name;
    //
    public Task(String name) {
        this.setName(name);
    }
    //
    public String getName() {
        return name;
    }
    //
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("uretildi: " + getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void setName(String name) {
        this.name = name;
    }
}
