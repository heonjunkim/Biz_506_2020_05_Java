package com.biz.score.domain;

public class ScoreVO {
	
	private String num;
	private int kor;
	private int eng;
	private int math;
	
	private int sum;
	private float avg;
	
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
	public int getSum() {
		return sum;
	}
	public float getAvg() {
		return avg;
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
	public void setSum(int sum) {
		this.sum = sum;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	

}
