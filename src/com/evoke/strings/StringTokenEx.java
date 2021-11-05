package com.evoke.strings;

import java.util.StringTokenizer;

public class StringTokenEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringTokenizer st=new StringTokenizer("My name is Manasa"," ");
		
		while(st.hasMoreTokens()) {
			
			System.out.println(st.nextToken());
		}

	}

}
