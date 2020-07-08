package com.biz.bank.service;

/*
 * 은행에 내 계좌에 입출금을 처리를 할 텐데
 * 초기의 >내 계좌 잔액 100,000 <으로 설정하고
 * inputBalance() 를 호출하여 입금처리를 수행하고
 * outputBalance()를 호출하여 출금처리를 수행하고
 * 		출금을 할때는 내 계좌의 잔액보다 큰 금액을 출금하려 하면
 * 		출금이 안되도록 하고, 잔액보다 작은 금액을 출금하면
 * 		출금이 이루어 지도록
 * listBalance()를 호출하여 현재까지의 입출금 내역과 잔액을 표시
 */

public interface BankService {
	
	public boolean inputBalance(); // 입금처리
	public boolean outputBlance();  // 출금처리
	public void listBalance();  // 잔액
	
		
		
	}


