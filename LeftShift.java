package com.dsaQuestions;

import java.util.Arrays;

public class LeftShift {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int n=2;
		int[] result=leftShift(a,n);
		System.out.println("Original Array:"+Arrays.toString(a));
		System.out.println("After "+n+" Left Rotations:"+Arrays.toString(result));
	}
	public static int[] leftShift(int[] a,int n) {
		int[] temp=new int[a.length];
		int k=0;
		int l=n-1;
		for(int i=n;i<a.length;i++) {
			temp[k++]=a[i];
		}
		while(l>=0) {
			temp[k++]=a[l--];
		}
		return temp;
	}
}
