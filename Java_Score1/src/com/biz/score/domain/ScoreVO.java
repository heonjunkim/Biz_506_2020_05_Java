package com.biz.score.domain;
/*
 * 성적처리 과정에서 1학생의 성적을 담는
 * 0bject 변수 
 * Value Object 클래스 라고 한다.
 * VO, DTO 클래스들을 domain 클래스 라고 한다.
 * 
 * 필드 변수를 private 로 설정하고
 * 필드변수에 접근(값을 저장, 읽기) getter, setter를 선언
 * 
 * 이러한 방식으로클래스를 정의 하는것을 정보은닉, 캡슐화
 */

public class ScoreVO {
	private String grade;
	private int Kor;
	private int Eng;
	private int Math;
	private int sum;
	private float Avg;
	public String getGrade() {
		return grade;
	}
	public int getKor() {
		return Kor;
	}
	
	// 정보의 유효성 검사
	// 현재 국어점수 필드에 저장하려고 하는 값이 유효한 값인가를 검사
	
	// 성적은 0~ 100까지가 기본값인데
	// 만약에 성적을 0 미만, 100초과된 값을 저장하려고 하면
	// 거부 하도록 setKor() 변경
	public boolean setkor(int Kor) {
		if(Kor < 0 || Kor > 100) {
			return false;
		}
		this.Kor = Kor;
		return true;
	}
	
	public int getEng() {
		return Eng;
	}
	public int getMath() {
		return Math;
	}
	public int getSum() {
		return sum;
	}
	public float getAvg() {
		return Avg;
	}
	public void setGrade(String grade) {
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
	public void setSum(int sum) {
		this.sum = sum;
	}
	public void setAvg(float avg) {
		Avg = avg;
	}
	
	
	

	

}
