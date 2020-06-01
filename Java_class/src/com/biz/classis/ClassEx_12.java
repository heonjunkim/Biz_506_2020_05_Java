package com.biz.classis;

import com.biz.classis.model.BankVO;

public class ClassEx_12 {
	
	public static void main(String[] args) {
		
		BankVO List[] = new BankVO[5];
		
		List[1] = new BankVO();
		List[2] = new BankVO();
		List[3] = new BankVO();
		List[4] = new BankVO();
		List[0] = new BankVO();
		
		List[1].setStrNum("001");
		List[2].setStrNum("002");
		List[3].setStrNum("003");
		List[4].setStrNum("004");
		List[0].setStrNum("005");
		
		
		for(int i =0; i<List.length; i++) {
			List[i].setStrdate("2020-06-01");	
		}
		List[2].setInput(5000);
		List[1].setInput(5000);
		
		List[3].setOutput(1000);
		List[4].setOutput(1000);
		List[0].setOutput(1000);
				
				
				
				
		
		
	}

}
