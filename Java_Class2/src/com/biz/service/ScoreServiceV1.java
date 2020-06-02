package com.biz.service;

import com.biz.model.ScoreVO;

public class ScoreServiceV1 {
	
	public void scoreList(ScoreVO[] scoreList) {
		
		LineService line = new LineService();
		
		
		System.out.println(line.do_line(50));
		System.out.println(line.single(50));
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for(int i =0; i < scoreList.length; i++) {
			
			
			// for() { }내에서 선언된 sum ,avg 변수는
			// for() { }명령문이 종료되면 이후에 참조할수 없다.
			
			int sum = scoreList[i].getIntKor();
			 sum += scoreList[i].getIntEng();
			 sum += scoreList[i].getIntMath();
			 int avg = sum/3;
				System.out.printf("%s\t%s\t%s\t%s\t%s%\t%d\n",
						scoreList[i].getStrName(),scoreList[i].getIntKor(),scoreList[i].getIntEng(),scoreList[i].getIntMath(),sum,avg );
		}
		System.out.println(line.do_line(50));
		
				
		
	
		
		
		
		
		
		
		
	}

}
