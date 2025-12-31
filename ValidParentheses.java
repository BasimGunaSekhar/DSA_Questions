package com.easy;

import java.util.Stack;

public class ValidParentheses {
	public static void main(String[] args) {
		System.out.println(isValid("(){}[]"));
	}
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		int j = 0;
		while (j < s.length()) {
			char c = s.charAt(j);
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				if (!isPair(stack.pop(), c)) {
					return false;
				}
			}
			j++;
		}
		return stack.isEmpty();
	}

	private static boolean isPair(char a, char b) {
		if (a == '(' && b == ')' || a == '{' && b == '}' || a == '[' && b == ']') {
			return true;
		} else {
			return false;
		}
	}
}
