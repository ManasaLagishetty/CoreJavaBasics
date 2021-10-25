package com.evoke.javabasics;

public class WrapperEx {
	public static void main(String args[]) {
		
		byte b=3;
		short s=12;
		float f=3.25f;
		double d=8.999999;
		char c='e';
		boolean bl=true;
		
		
		Byte objOfb=b;          //AutoBoxing
		Short objOfs=s;         //AutoBoxing
		Float objOff=f;         //AutoBoxing
		Double objOfd=d;        //AutoBoxing
		Character objOfc=c;     //AutoBoxing
		Boolean objOfbl=bl;     //AutoBoxing
		
		
		byte byteValue= objOfb;            //UnBoxing
		short shortvalue=objOfs;           //UnBoxing
		float floatValue=objOff;           //UnBoxing
		double doubleValue=objOfd;         //UnBoxing
		char   charvalue=objOfc;           //UnBoxing
		boolean booleanValue =objOfbl;     //UnBoxing 
		
		
	}

}
