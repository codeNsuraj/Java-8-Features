package com.StringJoiners;

import java.util.StringJoiner;

	/**
	 * Output:
	 * A,B,C
	 * P:Q
	 * A,B,C,P:Q
	 */

public class Q1 {
	
	public static void main(String[] args) {
		StringJoiner sj1 = new StringJoiner(",","[","]");
		sj1.add("A");
		sj1.add("B");
		sj1.add("C");
		System.out.println(sj1);
		
		StringJoiner sj2 = new StringJoiner(":");
		sj2.add("P");
		sj2.add("Q");
		System.out.println(sj2);
		
		sj1.merge(sj2);
		System.out.println(sj1);
	}
}