package com.biz.model;

public class ScoreVO {
	
	private String strName;
	private int intKor;
	private int intEng;
	private int intMath;
	
	private int StSum;
	private int stAvg;
	
	public String getStrName() {
		return strName;
	}
	public int getIntKor() {
		return intKor;
	}
	public int getIntEng() {
		return intEng;
	}
	public int getIntMath() {
		return intMath;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}
	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}
	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}
	public int getStSum() {
		return StSum;
	}
	public int getStAvg() {
		return stAvg;
	}
	public void setStSum(int stSum) {
		StSum = stSum;
	}
	public void setStAvg(int stAvg) {
		this.stAvg = stAvg;
	}
	
	
	

}
