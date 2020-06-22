package com.biz.hello;

public class Temp_01 {
	
	public static void main(String[] args) {
		
		int a =30;
		int b =15;
		int c =20;
		
		// b < c < a 숫자 순
		
		int temp ;
		
		if(b < c) {
			temp = c; c = b;b = temp;
		}
		if(c < a) {
			temp =c; c=a; a =temp;
		}
		
		
		
		
		System.out.println(a + "<" + b  + "<" + c);
		
		// 30이 두번
	}
	
	

}
