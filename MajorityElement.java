package com.easy;

public class MajorityElement {
	public static void main(String[] args) {
		//Majority element that occurs more than nums.length/2
		System.out.println(majorityElement(new int[]{2,2,3,3,3,3,2}));
	}
	public static int majorityElement(int[] nums) {
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			if (nums[i] == 0)
				continue;
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (nums[i] == nums[j]) {
					count++;
					nums[j] = 0;
				}
			}
			if (count > (n / 2))
				return nums[i];
		}
		return 0;
	}
}
