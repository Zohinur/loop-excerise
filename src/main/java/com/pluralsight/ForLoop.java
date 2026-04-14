package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        int j = 10;
        for (; j >= i; j--) {
            System.out.println(j);
            Thread.sleep(1000);
        }
        System.out.println("LAunch");

    }
}
