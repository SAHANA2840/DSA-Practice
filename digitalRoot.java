package com.java.root;

public class Main {
    public static void main(String[] args) {
        int N = 38;

        while (N > 9) {
            int sum = 0;

            while (N > 0) {
                sum = sum + N % 10;
                N = N / 10;
            }

            N = sum;
        }

        System.out.println(N);
    }
}
