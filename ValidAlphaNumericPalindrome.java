package com.easy;

public class ValidAlphaNumericPalindrome {
	public static void main(String[] args) {
		String s="00P00";
		if(isPalindrome(s)) {
			System.out.println(s+" is a Alphanumeric Palindrome");
		}else {
			System.out.println(s+" is not a Alphanumeric Palindrome");
		}
	}
	public static boolean isPalindrome(String s) {
		StringBuilder sb = new StringBuilder();
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'a' && c <= 'z' || c >= '0' && c <= '9') {
				sb.append(c);
			}
		}
		String ss = new String(sb);
		int i = 0;
		int j = ss.length() - 1;
		while (i < j) {
			if (ss.charAt(i) != ss.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
