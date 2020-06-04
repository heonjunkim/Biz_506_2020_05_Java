package com.biz.score.service;

import com.biz.score.vo.ScoreVO;


public class ScoreServiceV2 {
	
	
	private ScoreVO[] scores ;
	
	
	
		
		public void scoreSum(ScoreVO[] scores) {
			
			this.scores =scores;
			
		
			for(int i =0; i < scores.length; i++) {
				int sum = this.scores[i].getKor();
				sum += this.scores[i].getEng();
				sum += this.scores[i].getMath();
				sum += this.scores[i].getMusic();
				this.scores[i].setSum(sum);
			
			}
		}
			
		
			public void scoreAvg() {
				for(int i =0; i < scores.length; i ++) {
					 int sum =this.scores[i].getSum();
					 this.scores[i].setAvg(sum/4);
					 
				}
			}
			
			
			
			public void scoreList() {
				LineService line = new LineService();
				int intLineLength =50;
				
				
				System.out.println(line.do_line(intLineLength));
				System.out.println("성적리스트");
				System.out.println(line.do_line(intLineLength));
				System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t평균");
				System.out.println(line.single(intLineLength));
				
				int Korsum = 0;
				int Engsum =0;
				int Mathsum = 0;
				int Musicsum =0;
				
				
				int sumsum =0;
				int Avgsum =0;
				
				
				for(int i =0; i <  this.scores.length; i ++) {
					Korsum += scores[i].getKor();
					Engsum += scores[i].getEng();
					Mathsum += scores[i].getMath();
					Musicsum += scores[i].getMusic();
					sumsum += scores[i].getSum();  
					Avgsum += scores[i].getAvg();  
							
					
					
					
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%d\n",
							scores[i].getGrade(), scores[i].getKor(),scores[i].getEng(),scores[i].getMath(),scores[i].getMusic(),
							scores[i].getSum(), scores[i].getAvg() );     }
				
				System.out.println(line.do_line(intLineLength));
				System.out.printf(
						"%s\t%d\t%d\t%d\t%d\t%d\t%d\n",
							"총점",
							Korsum,
							Engsum,
							Mathsum,
							Musicsum,
							sumsum, 0
				);
				System.out.printf(
						"%s\t%d\t%d\t%d\t%d\t%d\t%d\n",
							"평균",
							Korsum/scores.length,
							Engsum/scores.length,
							Mathsum/scores.length,
							Musicsum/scores.length,
							0, Avgsum//scores.length
				);
				System.out.println(line.do_line(intLineLength));
				
		
				
				
				
				
				
			
			}
	

			
			
	
			
			
			
			
			
		
			
		
			
		
		
		
		
		

}

