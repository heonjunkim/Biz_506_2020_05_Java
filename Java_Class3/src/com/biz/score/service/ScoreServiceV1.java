package com.biz.score.service;

import com.biz.score.vo.ScoreVO;


public class ScoreServiceV1 {
	
	/*
	 * score 인스턴스배열을 필드변수로 선언한 이유
	 * Ex 클래스에서 Service클래스에서
	 * 총점계산, 평균계산, 리스트출력을 요청할텐데
	 * 요청을 할때마다 scores 인스턴스 배열을 매개변수로
	 * 전달할 수 있지만
	 * 한번만 변수로 전달해 Service클래스가 scores인스턴스를
	 * 보관하도록 하고 
	 * 나머지 요청하는 메서드에서는 변수를 받는 부분을 제거하기 위함이다.
	 * 
	 * Ex 클래스에서 요청들을 할때마다 scores 배열을 매개변수로 
	 * 전달을 하면 
	 * 요청과 요청사이에서 다른 코드에 의해 scores 배열값이
	 * 변형되어 결과가 엉뚱하게 나타나는 것을
	 * 방지하는 목적이 있다.
	 */
	
	private ScoreVO[] scores ;
	
	/*
	 * ScoreServiceV1 클래스를 사용해서
	 * 어떤 연산을 수행하려고 할때
	 * 반드시 setScore() method를 통해서 scores값을
	 * 매개변수로 주입을 해주어야 한다.
	 * 그렇지 않으면 scores 인스턴스 필드변수가 아직
	 * 준비가 안된 상태이기 때문에 
	 * 이후에 호출되는 method() 들에서
	 * NullPointerException이 발생을 한다. 
	 */
	
	public void setScoreList(ScoreVO[] scoreList) {
		this.scores = scoreList;
		
	}
	/*
	 * 필드변수로 scores 선언되어 있기 때문에
	 * 학생 총점과 평균을 계산한후
	 * 어디에 저장해야될지를 고민하지 않아도된다.
	 */
		
		public void scoreSum() {
			for(int i =0; i < scores.length; i++) {
				
				 scores[i].setSum(  scores[i].getKor() +  scores[i].getEng() +  scores[i].getMath() +  scores[i].getMusic());
			
			}
		}
			
		
			public void scoreAvg() {
				for(int i =0; i < scores.length; i ++) {
					 scores[i].setAvg( scores[i].getSum() / 4);
				}
			}
			
			
			
			public void scoreList() {
				System.out.println("==================================================");
				System.out.println("성적리스트");
				System.out.println("--------------------------------------------------");
				System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t평균");
				System.out.println("--------------------------------------------------");
				
				// 점수 리스트를 표시할때는 for 반복문을 이용해서 사용
				// this. 현재 이 클래스에 선언된 이라는 뜻
			
			
				
				
				for(int i =0; i <  scores.length; i ++) {
					
					
					
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%d\n",
							scores[i].getGrade(), scores[i].getKor(),scores[i].getEng(),scores[i].getMath(),scores[i].getMusic(),
							scores[i].getSum(), scores[i].getAvg() );     }
				
				int Korsum = 0;
				int Engsum =0;
				int Mathsum = 0;
				int Musicsum =0;
				
				
				int sumsum =0;
				int Avgsum =0;
				
				for(int i =0; i < scores.length; i ++) {
					Korsum += scores[i].getKor();
					Engsum += scores[i].getEng();
					Mathsum += scores[i].getMath();
					Musicsum += scores[i].getMusic();
					sumsum += scores[i].getSum();  // 모든학생 총점의 총점
					Avgsum += scores[i].getAvg();  // 평균의 총점
							
				}
				
			
				System.out.println("==================================================");
				System.out.printf("총점\t%d\t%d\t%d\t%d\t%d\t%d\n",  Korsum, Engsum, Mathsum, Musicsum, sumsum, Avgsum);
				System.out.printf("평균\t%d\t%d\t%d\t%d\t%d\t%d\n",Korsum/scores.length,Engsum/scores.length,Mathsum/scores.length,Musicsum/scores.length,
						sumsum/scores.length, Avgsum/scores.length);
				
				
			}
	

			
			
	
			
			
			
			
			
		
			
		
			
		
		
		
		
		

}

