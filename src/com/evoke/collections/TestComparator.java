package com.evoke.collections;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class TestComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num = new ArrayList<>();
		num.add(178);
		num.add(879);
		num.add(330);
		num.add(232);
		
		Collections.sort(num);
		
		System.out.println("natural sorting");
		
		for(int i:num) {
			System.out.println(i);
		}
		
		ComparatorEx com=new ComparatorEx();
		
		Collections.sort(num,com);
		
		System.out.println("Soring according to our logic");
		
		for(int i:num) {
			System.out.println(i);
		}

	}

}
