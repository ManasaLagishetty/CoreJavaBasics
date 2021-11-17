package com.evoke.collections;

import java.util.ArrayList;
import java.util.List;

public class DuplicatesEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=new ArrayList<>();
       list.add(1);
       list.add(3);
       list.add(8);
       list.add(10);
       list.add(12);
       list.add(10);
       list.add(3);
       list.add(3);
       list.add(3);


      System.out.println("size of the list: "+list.size());
       
      for(int i=0 ; i<list.size() ; i++) {
    	  if(list.get(i) != -1) {
    	  int count =0;
    	 for(int j=i+1 ; j<list.size() ; j++) {
    		   
    		 if(list.get(i) == list.get(j)) {
    			
    			 count++;
    			 list.set(j,-1);
    		 }
    	 }
    	 
    	 System.out.println(list.get(i)+" is having "+count + " duplicates");
      }
      }
}
}