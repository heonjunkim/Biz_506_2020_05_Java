package com.biz.classis;

import com.biz.classis.model.BankVO;

public class ClassEx_13 {
	
	public static void main(String[] args) {
		
		BankVO Bank[] = new BankVO[5];
		
		
		Bank[0] = new BankVO();
		Bank[1] = new BankVO();
		Bank[2] = new BankVO();
		Bank[3] = new BankVO();
		Bank[4] = new BankVO();
		
		Bank[0].setStrNum("001");
		Bank[1].setStrNum("001");
		Bank[2].setStrNum("001");
		Bank[3].setStrNum("001");
		Bank[4].setStrNum("001");
		
		Bank[0].setStrdate("2020-05-01" );
		Bank[1].setStrdate("2020-05-02" );
		Bank[2].setStrdate("2020-05-03" );
		Bank[3].setStrdate("2020-05-04" );
		Bank[4].setStrdate("2020-05-05" );
		
		Bank[0].setInput(5000);
		Bank[1].setInput(5000);
		
		Bank[2].setOutput(1000);
		Bank[3].setOutput(1000);
		Bank[4].setOutput(1000);
		
		
		
	}

}
