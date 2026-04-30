package com.strings;

public class FindTheDifference {
	public static void main(String[] args) {
		FindTheDifference f=new FindTheDifference();
		System.out.println(f.findTheDifference("abcd", "abcde"));
	}
	public char findTheDifference(String s, String t) {
		int sum = 0;
		for (char c : t.toCharArray()) {
			sum += c;
		}
		for (char c : s.toCharArray()) {
			sum -= c;
		}
		return (char) sum;
	}
}
