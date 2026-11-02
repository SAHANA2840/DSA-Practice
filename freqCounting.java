package com.java.freqCounting;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class freqCounting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("S1:");
		String actual = sc.next();
		System.out.print("S2:");
		String exp = sc.next();
		char[] act_arr = actual.toCharArray();
		char[] exp_arr = exp.toCharArray();
		LinkedHashMap<Character, Integer> freq = new LinkedHashMap<>();
		for (int i = 0; i < act_arr.length; i++) {
			char ch = act_arr[i];
			if (freq.containsKey(ch)) {
				freq.put(ch, freq.get(ch) + 1);
			} else {
				freq.put(ch, 1);
			}
		}
		int cost = 0;
		for (int i = 0; i < exp_arr.length; i++) {
			char ch = exp_arr[i];
			if (freq.containsKey(ch) && freq.get(ch) > 0) {
				freq.put(ch, freq.get(ch) - 1);
			} else {
				cost++;
			}
		}
		System.out.println("Minimum cost: " + cost);
		sc.close();

	}
}
