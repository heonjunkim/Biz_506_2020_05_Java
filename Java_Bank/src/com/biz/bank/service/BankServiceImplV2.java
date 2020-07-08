package com.biz.bank.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.bank.domain.AccountVO;

public class BankServiceImplV2 implements BankService {
	protected Scanner scan;
	private List<AccountVO> actList;
	
	public BankServiceImplV2() {
		actList = new ArrayList<AccountVO>();
	}
	

	@Override
	public boolean inputBalance() { // 입금
		Scanner scan = new Scanner(System.in);
		AccountVO aVO = new AccountVO();
		System.out.println("입금계좌(END:종료) >> ");
		String strNum = scan.nextLine();
		if(strNum.equals("END")) {
			return false;
		}
		
		
		System.out.print("입금날짜 >> ");
		String strDate = scan.nextLine();
		aVO.setDate(strDate);
		
		int intPut = 0;
		
		try {
			intPut = Integer.valueOf(strNum);
		} catch (Exception e) {
			System.out.println(intPut +"원을 입급받았습니다.");

		}
			
		actList.add(aVO);
		
		
		return true;
	}

	@Override
	public boolean outputBlance() { // 출금
		Scanner scan = new Scanner(System.in);
		AccountVO aVO = new AccountVO();
		
		System.out.println("출금계좌(END:종료) >> ");
		String strNum = scan.nextLine();
		if(strNum.equals("END")) {
			return false;
		}
		
		System.out.print("출금날짜 >> ");
		String strDate = scan.nextLine();
		aVO.setDate(strDate);
		
		int outPut =0;
		try {
			outPut = Integer.valueOf(strNum);
		} 
		catch (Exception e) {
			
			System.out.println(outPut + "원이 출금되었습니다.");
		}
		
		
		return true;
		
	}

	@Override
	public void listBalance() {
		System.out.println("========================================");
		System.out.println("은행 시스템");
		System.out.println("========================================");
		System.out.println("계좌\t날짜\t입금\t출금");
		System.out.println("========================================");
		
		
		
		

		
	}
	

}
