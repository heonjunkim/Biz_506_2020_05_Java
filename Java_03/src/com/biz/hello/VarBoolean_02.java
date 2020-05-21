package com.biz.hello;

public class VarBoolean_02 {
	public static void main(String[] args) {

		int num1 = 31;
		int num2 = 45;

		int numP = num1 +num2;
		int numM = num1 - num2;
		int numT = num1 * num2;
		int numD = num2 / num1;
		
		System.out.println(numP); //true
		System.out.println(numM); //true
		System.out.println(numT); //false
		System.out.println(numD); //false
	 
		
		
		
		boolean bVarP = (numP % 2) == 0;
		boolean bVarM = (numM % 2) == 0;
		boolean bVarT = (numT % 2) == 0;
		boolean bVarD = (numD % 2) == 0;
		
	
		


		if (bVarP == true) {
			System.out.println("덧셈결과는 짝수");
		}
		if (bVarM == true) {
			System.out.println("뺄셈결과는짝수");
		}

		if (bVarT == true) {
			System.out.println("곱셈결과는 짝수");
		}
		if (bVarD == true) {
			System.out.println("나눗셈결과는 짝수");
		}
		

	
	}
}
