package com.Array;

public class SingleNumber {
	public static void main(String[] args) {
		System.out.println(singleNumber(new int[] {1,2,1,2,4}));
	}
	public static int singleNumber(int[] nums) {
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			int count = 1;
			for (int j = 0; j < n; j++) {
				if (i == j)
					continue;
				if (nums[i] == nums[j]) {
					count++;
				}
			}
			if (count == 1)
				return nums[i];
		}
		return 0;
	}
}
