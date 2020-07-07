package com.biz.exec;

import com.biz.word.service.WordGameService;
import com.biz.word.service.WordGameServiceV3;

public class WordEx_03 {
	
	public static void main(String[] args) {
		WordGameService wG = new WordGameServiceV3();
		
		wG.playGame();
		
	}

}
