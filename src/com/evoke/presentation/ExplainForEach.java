package com.evoke.presentation;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class ConsumerImpl implements Consumer<Integer>{

	@Override
	public void accept(Integer i) {
     System.out.println(i);		
	}
	
}

public class ExplainForEach {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(23,34,56,87,9,88,6);
		Consumer<Integer> c=new ConsumerImpl(); 
		
		list.forEach(c);
	}

}
