package com.easy;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		String[] strs= {"flower","flow","floor"};
		System.out.println(longestCommonPrefix(strs));
	}
	public static String longestCommonPrefix(String[] strs) {
		if (strs.length == 1)
			return strs[0];
		String s = strs[0];
		String longest = "";
		int j = 1;
		while (j <= s.length()) {
			String ss = s.substring(0, j);
			for (int i = 1; i < strs.length; i++) {
				String sss = strs[i];
				if (j > sss.length()) {
					return longest;
				}
				if (!sss.substring(0, j).equals(ss)) {
					break;
				}
				if (i == strs.length - 1) {
					longest = ss;
				}
			}
			j++;
		}
		return longest;
	}
}
