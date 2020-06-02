package com.biz.service;

import com.biz.model.ScoreVO;

public class ScoreServiceV2 {
	// ScoreServiceV2클래스의 필드변수 선언
	// ScoreVO 클래스의 인스턴스 배열을 필드변수로 선언
	private ScoreVO[] scoreList;
	
	// scoreList 필드변수의 setter method()
	public void setScoreList(ScoreVO[] scoreList) {
		this.scoreList =scoreList;
		
	}
	public void scoreSum() {
		for(int i=0; i < scoreList.length; i++) {
			scoreList[i].setStSum     ( scoreList[i].getIntKor() + scoreList[i].getIntEng() +
					scoreList[i].getIntMath());
			scoreList[i].setStAvg( scoreList[i].getStSum()/ 3);
		}
	}
	
	public void scoreList() {
		for(int i =0; i < scoreList.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\n",
					scoreList[i].getStrName(),scoreList[i].getIntKor(),scoreList[i].getIntEng(),scoreList[i].getIntMath(),scoreList[i].getStSum(),scoreList[i].getStAvg());
		}
		
	}

}
