package com.easy;

public class BestTimeToBuyAndSellStock {
	public static void main(String[] args) {
		System.out.println(maxProfit(new int[]{5,2,1,9,2}));
	}
	public static int maxProfit(int[] prices) {
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < minPrice) {
				minPrice = prices[i];
			} else {
				int profit = prices[i] - minPrice;
				maxProfit = Math.max(maxProfit, profit);
			}
		}
		return maxProfit;
	}
}
