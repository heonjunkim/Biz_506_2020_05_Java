package com.biz.classis;

import com.biz.classes.service.BankService;
import com.biz.classis.model.BankVO;

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

		bankList[0].setStrdate("2020-05-01");
		bankList[1].setStrdate("2020-05-02");
		bankList[2].setStrdate("2020-05-03");
		bankList[3].setStrdate("2020-05-04");
		bankList[4].setStrdate("2020-05-05");

		bankList[0].setInput(5000);
		bankList[2].setInput(5000);

		bankList[1].setOutput(1000);
		bankList[3].setOutput(1000);
		bankList[4].setOutput(1000);
		
		bankList[0].setValance(5000);
		bankList[1].setValance(4000);
		bankList[2].setValance(9000);
		bankList[3].setValance(8000);
		bankList[4].setValance(7000);

		BankService bankService = new BankService();
		bankService.bankList(bankList);
		
		
		

		
	}

}
