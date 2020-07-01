package com.biz.scorevo;


public class ScoreVO {
	
	
	private int grade;
	private int Kor;
	private int Eng;
	private int Math;
	private int Total;
	private int Avg;
	
	public ScoreVO() {
		
	}
	
	public int getGrade() {
		return grade;
	}
	public int getKor() {
		return Kor;
	}
	public int getEng() {
		return Eng;
	}
	public int getMath() {
		return Math;
	}
	public int getTotal() {
		return Total;
	}
	public int getAvg() {
		return Avg;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setKor(int kor) {
		Kor = kor;
	}
	public void setEng(int eng) {
		Eng = eng;
	}
	public void setMath(int math) {
		Math = math;
	}
	public void setTotal(int total) {
		Total = total;
	}
	public void setAvg(int avg) {
		Avg = avg;
	}
	

}
