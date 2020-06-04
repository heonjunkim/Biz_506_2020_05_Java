package com.biz.list.model;

public class ScoreVO {
	
	
	private String num;
	private int kor;
	private int eng;
	private int math;
	
	private int stSum;
	private int stAvg;
	
	
	
	public int getStSum() {
		return stSum;
	}
	public int getStAvg() {
		return stAvg;
	}
	public void setStSum(int stSum) {
		this.stSum = stSum;
	}
	public void setStAvg(int stAvg) {
		this.stAvg = stAvg;
	}
	public String getNum() {
		return num;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	

}
