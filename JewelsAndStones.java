package com.strings;

public class JewelsAndStones {
	public static void main(String[] args) {
		System.out.println(numJewelsInStones("aA","aAAbbbb"));
	}
	public static int numJewelsInStones(String jewels, String stones) {
		int count = 0;
		for (int i = 0; i < jewels.length(); i++) {
			char c = jewels.charAt(i);
			count += stones.length() - stones.replace(c + "", "").length();
		}
		return count;
	}
}
