package com.strings;

public class WordOccurence {
	public static void main(String[] args) {
		String s="java is   very     very easy";
		String[] str=s.split(" ");
		System.out.println(str.length);
		for(int i=0;i<str.length;i++) {
			int count=1;
			if(str[i]=="")continue;
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])) {
					count++;
					str[j]="";
				}
			}
			System.out.println(str[i]+"="+count);
		}
	}
}
