package com.easy;

public class PrimeFactorization {
	public static void main(String[] args) {
		printPrimeFactorization(100);
	}
	public static void printPrimeFactorization(int n) {
		int i = 2;
		while (n > 1) {
			if (n % i == 0) {
				System.out.print(i + " ");
				n /= i;
			} else {
				i++;
			}
		}
	}
}
