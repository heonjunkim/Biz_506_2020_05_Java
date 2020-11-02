package com.biz.test;

import java.util.Random;

/*
 * 구구단 7단 출력 코드 작성
 */
public class GuguEx {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int num = rnd.nextInt(9)+1;
		int sum = 0;
		
		System.out.println("7단 구구단");
		for(int i =1; i<10; i++) {
			sum = num *i;
			System.out.printf("%d x %d = %d\n",num,i,sum);
		}
		
		
	}

}
