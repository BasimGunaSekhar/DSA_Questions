package com.easy;

public class DayBeforeNDays {
	public static void main(String[] args) {
		System.out.println(dayBefore(2,19));
	}
	public static int dayBefore(int d, int n) {
		for (int i = 0; i < n; i++) {
			d = d - 1;
			if (d < 0) {
				d = 6;
			}
		}
		return d;
	}
}
