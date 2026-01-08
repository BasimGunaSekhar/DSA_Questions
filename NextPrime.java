package com.easy;

public class NextPrime {
	public static void main(String[] args) {
		System.out.println(nextPrime(1234));
	}
	public static int nextPrime(int n) {
		int a = n + 1;
		while (true) {
			if (isPrime(a)) {
				return a;
			}
			a++;
		}
	}

	public static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
