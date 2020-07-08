package com.biz.bank.domain;
/*
 * 
 * 은행업무 중에서
 * 현금의 입출금과 관련된 업무를 "계정계(ACC)" 업무
 * ACC : 일반 업무에서 회계와 관련된 약어로 많이 사용
 * 
 * 정보계 : 고객 정보를 기준으로 자산관리 업무
 * 여수신계 : 대출과 관련된 업무 
 */

public class AccountVO {
	private String num; // 계좌
	private String date; // 날짜
	private int input; // 입금
	private int output; //출금
	public String getNum() {
		return num;
	}
	public String getDate() {
		return date;
	}
	public int getInput() {
		return input;
	}
	public int getOutput() {
		return output;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setInput(int input) {
		this.input = input;
	}
	public void setOutput(int output) {
		this.output = output;
	}
	
		

}
