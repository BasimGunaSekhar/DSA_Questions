package com.strings;

public class ReverseWordsInString {
	public static void main(String[] args) {
		System.out.println(reverseWords("I am Guna Sekhar"));
	}
	public static String reverseWords(String s) {
		StringBuilder sb = new StringBuilder();
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < s.length()) {
			while (i < s.length() && s.charAt(i) != ' ')
				i++;
			j = i - 1;
			while (j >= k && j < s.length()) {
				sb.append(s.charAt(j) + "");
				j--;
			}
			i++;
			k = i;
			if (i < s.length())
				sb.append(" ");
		}
		return new String(sb);
	}
}
