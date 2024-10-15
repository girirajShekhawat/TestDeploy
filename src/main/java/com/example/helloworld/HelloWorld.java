package com.example.helloworld;

public class HelloWorld {
    public static void main(String[] args) {
        try {
            while (true) {
                System.out.println("Hello world");
                Thread.sleep(2000); // Print every 2 seconds
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}