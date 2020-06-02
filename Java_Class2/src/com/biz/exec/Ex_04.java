package com.biz.exec;


import java.util.Random;

import com.biz.model.ScoreVO;

public class Ex_04 {
	
	
	public static void main(String[] args) {
		
		
		
		
		ScoreVO[] score = new ScoreVO[20];
		for(int i =0; i < score.length; i++) {
			
			score[i] = new ScoreVO();
			
			
		}
		
		Random rnd = new Random();
		for(int i =0; i < score.length; i++) {
			
			score[i].setStrName("" + 1);
			score[i].setIntKor(rnd.nextInt(50)+51);
			score[i].setIntEng(rnd.nextInt(50)+51);
			score[i].setIntMath(rnd.nextInt(50)+51);
		}
		
		
		
		
		
		
		
		}
		
}
