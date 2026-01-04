package com.easy;

public class FindTheIndexOfString {
	public static void main(String[] args) {
		System.out.println(strStr("sfshnfjcm", "hnf"));
	}
	public static int strStr(String haystack, String needle) {
		// if(needle.length()==0)return 0;
		// int index=0;
		// int i=0;
		// int j=0;
		// while(i<haystack.length()&&j<needle.length()){
		// index=i;
		// int k=i;
		// j=0;
		// while(k<haystack.length()&&haystack.charAt(k)==needle.charAt(j)){
		// k++;
		// j++;
		// if(j==needle.length())return index;
		// }
		// i++;
		// }
		// return -1;
		return haystack.indexOf(needle);
	}
}
