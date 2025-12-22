package com.strings;

public class LongestPalinSubString {
	public static void main(String[] args) {
		System.out.println(longestPalindrome("abcddedda"));
	}
	public static String longestPalindrome(String s) {
		if (s.length() < 1)
			return "";
		String longest = "";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String s1 = s.substring(i, j);
				if (isPalindrome(s1) && s1.length() > longest.length()) {
					longest = s1;
				}
			}
		}
		return longest;
	}

	public static boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}
