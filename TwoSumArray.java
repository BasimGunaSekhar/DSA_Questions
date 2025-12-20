package com.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumArray {
	public static void main(String[] args) {
		int[] a= {2,5,3,9,8};
		System.out.println(Arrays.toString(twoSum(a,8)));
	}
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int rem = target - nums[i];
			if (map.containsKey(rem)) {
				return new int[] { map.get(rem), i };
			}
			map.put(nums[i], i);
		}
		return new int[] { -1, -1 };
	}
}
