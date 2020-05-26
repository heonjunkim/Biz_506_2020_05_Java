package com.biz.grade;

import java.util.Random;

public class Grade_04 {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		float floatKor = 0.0f;
		float floatEng = 0.0f;
		float floatMath = 0.0f;
		
		floatKor = random.nextInt(51)+50;
		floatEng = random.nextInt(51)+50;
		floatMath = random.nextInt(51)+50;
		
		int intSum = 0;
		 float floatSum = floatKor;
		 floatSum += floatEng;
		 floatSum += floatMath;
		 
		 float floatAvg =  floatSum /3;
		 
		 System.out.println("총점 : " + floatSum);
		 System.out.println("평균 : " + floatAvg);
		 
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
