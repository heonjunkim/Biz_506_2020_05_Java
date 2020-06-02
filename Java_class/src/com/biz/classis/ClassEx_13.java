package com.biz.classis;

import com.biz.classis.model.BankVO;
import com.biz.classis.service.BankService;

public class ClassEx_13 {
	
	public static void main(String[] args) {
		
		BankVO bankList[] = new BankVO[5];
		
		
		bankList[0] = new BankVO();
		bankList[1] = new BankVO();
		bankList[2] = new BankVO();
		bankList[3] = new BankVO();
		bankList[4] = new BankVO();
		
		for (int i = 0; i < bankList.length; i++) {

			bankList[i].setStrNum("001");
		}
		
		
		bankList[0].setStrdate("2020-05-01" );
		bankList[1].setStrdate("2020-05-02" );
		bankList[2].setStrdate("2020-05-03" );
		bankList[3].setStrdate("2020-05-04" );
		bankList[4].setStrdate("2020-05-05" );
		
		bankList[0].setInput(5000);
		bankList[2].setInput(5000);
		
		bankList[1].setOutput(1000);
		bankList[3].setOutput(1000);
		bankList[4].setOutput(1000);
		
		
		// 변수들..
		// primitive variable
		int num = 0; // integer형 변수 num0을 선언하고 0으로 clear
		long num1 = 0l; // long 형 변수 num1을 선언하고 0으로 clear
		float num2 = 0.0f;
		double num3 = 0;
		boolean bYes = false;
		char char1 = 'C'; // character형 변수 num0을 선언하고 문자 c를 저장
		
		
		//String(문자열)형 변수는
		// 변수처럼 사용하지만 실제로는
		// 일반변수와 달리
		// String 클래스로 만든 String 형 인스턴스라고 해야한다.
		
 		
		String strName = "홍길동";
		// String strName = new String("홍길동");
		String strNation = new String();
		
		
		// BankServiceV2 클래스를 사용해서
		// bankService라는 변수를 선언
		// bankService 변수를 "객체(object)", "인스턴스(Instance)"라고 한다.
		BankService bankService = new BankService();
		// bankService 인스턴스를 통해서
		// bankService() method를 호출하면
		// bankServiceV2 클래스내에 정의된 bankList() method 내의 코드들이 순서대로 실행된다.V2
		bankService.bankList();
		
		bankService.bankList(bankList);
		
		
		
		
	}

}
