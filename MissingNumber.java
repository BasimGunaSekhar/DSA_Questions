package com.easy;

public class MissingNumber {
	public static void main(String[] args) {
		System.out.println(missingNumber(new int[]{1,0,2}));
	}
	public static int missingNumber(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			boolean flag = false;
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] == i) {
					flag = true;
				}
			}
			if (!flag) {
				return i;
			}
		}
		return nums.length;
	}
}
