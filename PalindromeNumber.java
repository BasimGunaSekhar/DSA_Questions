package com.easy;

public class PalindromeNumber {
	public static void main(String[] args) {
		System.out.println(isPalindrome(-121));
	}
	public static boolean isPalindrome(int x) {
		int res = 0;
		int n = x;
		while (n > 0) {
			res = res * 10 + n % 10;
			n /= 10;
		}
		return x == res ? true : false;
	}
}
