package com.biz.score2;

import com.biz.score.service.ScoreService01;

public class ScoreMain {
	public static void main(String[] args) {
		ScoreService01 scoreService = new ScoreService01();
		
		while(true) {
			if(!scoreService.inputScore()) {
				break;
			}
			
			scoreService.scoreList();
			System.out.println("입력완료");
		}
		
	}

}
