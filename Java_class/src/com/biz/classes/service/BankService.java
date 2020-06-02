package com.biz.classes.service;

import com.biz.classis.model.BankVO;

public class BankService {
	
	public void bankList(BankVO[] bankList) {
		
		System.out.println("계좌번호\t날짜\t입금\t출금\t잔액");
		
		for(int i=0; i < bankList.length; i++) {
			
			System.out.printf("%s\t%s\t%s\t%s\t%d\n",
					bankList[i].getStrNum(),bankList[i].getStrdate(), bankList[i].getInput(),
					bankList[i].getOutput(), bankList[i].getValance() );
		}
		
		
	
		
	}

		
	
	
		
		
		
	



		
		

}