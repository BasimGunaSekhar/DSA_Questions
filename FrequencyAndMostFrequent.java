package com.dsaQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyAndMostFrequent {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("Adam","Bob","Charan","adam","charan","adam","charan");
		
		List<String> removedDup=list.stream().distinct().toList();
		System.out.println(removedDup);
		Map<String,Long> map=list.stream()
				.collect(Collectors.groupingBy(n->n,Collectors.counting()));
							//OR
		Map<String,Integer> map1=new HashMap<>();
		for(String s:list) {
			map1.put(s,map1.getOrDefault(s,0)+1);
		}
		System.out.println("\nFrequencies:");
		map.forEach((k,v)->System.out.println(k+"->"+v));

		long max=Collections.max(map.values());
		System.out.println("\nMost Frequent are:");
		for(String s:map.keySet()) {
			if(map.get(s)==max) {
				System.out.println(s+"->"+map.get(s));
			}
		}
	}
}
