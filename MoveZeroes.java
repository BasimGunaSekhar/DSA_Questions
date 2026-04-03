package com.easy;

import java.util.Arrays;

public class MoveZeroes {
	public static void main(String[] args) {
		int[] nums= {0,5,9,0,1,0};
		moveZeroes(nums);
		System.out.println(Arrays.toString(nums));
	}
	public static void moveZeroes(int[] nums) {
		int i = 0;
		for (int n : nums) {
			if (n != 0) {
				nums[i++] = n;
			}
		}
		while (i < nums.length) {
			nums[i++] = 0;
		}
	}
}
