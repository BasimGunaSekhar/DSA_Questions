package com.Array;

public class MedianOfTwoSortedArrays {
	public static void main(String[] args) {
		int[] a= {1,3};
		int[] b= {2};
		System.out.println(findMedianSortedArrays(a, b));
	}
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1.length;
		int n = nums2.length;
		double[] mergedArray = new double[m + n];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < m && j < n) {
			if (nums1[i] < nums2[j]) {
				mergedArray[k++] = nums1[i++];
			} else {
				mergedArray[k++] = nums2[j++];
			}
		}
		while (i < m || j < n) {
			if (i < m) {
				mergedArray[k++] = nums1[i++];
			} else {
				mergedArray[k++] = nums2[j++];
			}
		}
		int mid = ((mergedArray.length) / 2);
		if (mergedArray.length % 2 == 0) {
			return (mergedArray[mid] + mergedArray[mid - 1]) / 2;
		} else {
			return mergedArray[mid];
		}
	}
}
