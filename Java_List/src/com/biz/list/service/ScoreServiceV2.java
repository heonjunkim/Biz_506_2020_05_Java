package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.list.model.ScoreVO;

public class ScoreServiceV2 {
	
	
	List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
	
		int sum =0;
		public void stSum() {
			for(int i =0; i <scoreList.size() ; i ++) {
				ScoreVO sVO = scoreList.get(i);
				sum += sVO.getKor();
				sum += sVO.getEng();
				sum += sVO.getMath();
				
				
				
			}
		}
		public void stAvg() {
			for(int i =0; i < scoreList.size(); i++) {
				
			}
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
