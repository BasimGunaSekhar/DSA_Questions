package com.easy;

public class MajorityElement {
	public int majorityElement(int[] nums) {
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
