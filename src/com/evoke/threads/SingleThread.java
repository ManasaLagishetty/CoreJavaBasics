package com.evoke.threads;

public class SingleThread {

	public static void main(String[] args) {
         
      SingleThread obj=new SingleThread();
      obj.numbers();
      
		
		
		for(int j=1;j<=10;j++) {
			System.out.print("J:"+j + "\t");
		}
		
		
		
	}
	
	public void numbers() {
	for(int i=1;i<=10;i++) {
		System.out.print("i:"+i +"\t");
	}
	}

}
