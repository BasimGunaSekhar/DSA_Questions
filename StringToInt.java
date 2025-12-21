package com.strings;

public class StringToInt {
	public static void main(String[] args) {
		String s1="  735";
		String s2=" -21";
		String s3=" 128 words ";
		String s4="";
		String s5="13rfgrbf";
		System.out.println(myAtoi(s1)+"  "+myAtoi(s2)+"  "
						+myAtoi(s3)+"  "+myAtoi(s4)+"  "+myAtoi(s5));
	}
	public static int myAtoi(String s) {
		s = s.trim();
		if (s.length() == 0)
			return 0;
		long res = 0;
		int sign = 1;
		int i = 0;
		if (s.charAt(i) == '-' || s.charAt(i) == '+') {
			if (s.charAt(i) == '-') {
				sign = -1;
			}
			i++;
		}
		while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
			int digit = s.charAt(i) - '0';
			if (res > (Integer.MAX_VALUE - digit) / 10) {
				return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}
			res = res * 10 + (digit);
			i++;
		}
		return (int) res * sign;
	}
}
