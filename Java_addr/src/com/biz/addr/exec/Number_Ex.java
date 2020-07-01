package com.biz.addr.exec;

public class Number_Ex {
	public static void main(String[] args) {

		/*
		 * 숫자형 wrapper class의 Value Of() method를 사용하면
		 * 숫자형 문자열을 숫자형 데이터로 변환 시킬 수 있다.
		 * 
		 * 오래된 java버전에서는 valueOf(), parse*() method의 성능차이가 있엇으나
		 * java1.6 이상에서는 내부 매커니즘이 같아져 성능 차이가 없다.
		 */
		
		// Integer.valueOf(); : 숫자형 문자열을 정수로 변환시키는 method
		Integer.valueOf("34"); // 정수 34
		Float.valueOf("34.3");
		Double.valueOf("34.3;");
		Long.valueOf("3333333"); // 실제사용할때는 밸류오브를 쓴다 1.5후에 
		
		Integer.parseInt("34");  //1.5 전에 알고잇으면 된다.이친구들은 바로 int로 바꾼다
		Float.parseFloat("34.3");
		Double.parseDouble("34.3");
		Long.parseLong("3333");
		
		// 아래와 같은 경우는 모두 NumberFormatException을 일으키는 코드
		Integer.valueOf("");
		
		Integer.valueOf(" 34 "); //  숫자 앞, 뒤에  white space 문제
		Integer.valueOf("A34"); // 숫자 앞, 뒤에 숫자형 이외의 문자열이 있는 경우
		Integer.valueOf("3 4"); // 숫자 중간에 space, 숫자형 이외의 문자열이 있는 경우
		Integer.valueOf("3+4"); // 하나의 문자열이 연산식 처럼 보일때
		
	}
}
