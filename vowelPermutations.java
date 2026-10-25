package com.java.vowelPermutation;

public class Main {
    public static void main(String[] args) {
        String s = "ABC";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            if (ch != 'a' && ch != 'e' && ch != 'i'
                    && ch != 'o' && ch != 'u') {
                count++;
            }
        }

        if (count == 0) {
            System.out.println(0);
        } else {
            int fact = 1;

            for (int i = 1; i <= count; i++) {
                fact = fact * i;
            }

            System.out.println(fact);
        }
    }
}
