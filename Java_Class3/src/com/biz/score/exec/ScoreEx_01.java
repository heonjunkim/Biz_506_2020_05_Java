package com.biz.score.exec;

import java.util.Random;

import com.biz.score.service.ScoreServiceV1;
import com.biz.score.service.ScoreServiceV2;
import com.biz.score.vo.ScoreVO;

public class ScoreEx_01 {
	
	public static void main(String[] args) {
		
		ScoreVO[] scores = new ScoreVO[10];
		
		for(int i =0; i < scores.length; i++) {
			scores[i] = new ScoreVO();
		}
		
		
		Random rnd = new Random();
		
		
		for(int i =0; i <scores.length; i++) {
			scores[i].setGrade(""+(i+1));
			scores[i].setKor(rnd.nextInt(50)+51);
			scores[i].setEng(rnd.nextInt(50)+51);
			scores[i].setMath(rnd.nextInt(50)+51);
			scores[i].setMusic(rnd.nextInt(50)+51);
		}
		
		ScoreServiceV1 ScoreService = new ScoreServiceV1();
		/*
		 * ScoreServiceV1에 선언되어 있는 ScoreVO[] scores는
		 * 아직 선언만 되고 초기화 등이 전혀 이루어지지 않은상태이다
		 * 때문에 scores 인스턴스 배열이 초기화되거나
		 * 값이 저장되지 않으면
		 * 이후에 호출되는 method 에서 NullPointerException이
		 * 발생하고 코드가 진행되지 않는다.
		 */
		ScoreService.setScoreList(scores);
		ScoreService.scoreSum();
		ScoreService.scoreAvg();
		ScoreService.scoreList();
		
		/*
		 * ScoreServiceV1에서는 scores배열을 주입하는 method
		 * setScore() 라고 별도로 작성해 두었는데
		 * 사용하기 위해 작성을 하는 과정에서
		 * setScore()를 먼저 호출해서 scores를 전달해야 하는 것을
		 * 자주 잊게 되더라!
		 * 그리하여 NullPointException이 발생하는 경우가 많더라
		 * 
		 * 그래서 ScoreServiceV2에서는
		 * 성적처리를 하는 과정에서 반드시 호출할수 밖에 없는
		 * 메서드들 중에
		 * 호출되는 순서로 봤을때 항상 제일 먼저 호출할 것으로
		 * 생각 되는 scoreSum() method에 매개변수를 전달하는
		 * 역할을 수행하도록 코드를 변경한다.
		 */
		ScoreServiceV2 sService2 = new ScoreServiceV2();
		sService2.scoreSum(scores);
		sService2.scoreAvg();
		sService2.scoreList();
	
		
		
		
		
		
		
		
		
	}

}
