package com.evoke.threads;

public class MultipleThread extends Thread {

	public static void main(String[] args) {
		
		MultipleThread obj = new MultipleThread();
		obj.start();
		for(int j=1;j<=10;j++) {
			System.out.print("J:"+j + "\t");
		}

	}
	
	
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.print("i:"+i +"\t");
		}
		
	}

}
