package com.biz.score.service;

import com.biz.score.vo.ScoreVO;


public class ScoreServiceV2 {
	
	
	private ScoreVO[] scores ;
	
	
	
		
		public void scoreSum(ScoreVO[] scores) {
			
			this.scores =scores;
			
		
			for(int i =0; i < scores.length; i++) {
				int sum = this.scores[i].getKor();
				sum += scores[i].getEng();
				sum += scores[i]
			
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

