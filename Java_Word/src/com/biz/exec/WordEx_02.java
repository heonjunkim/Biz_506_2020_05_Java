package com.biz.exec;

import com.biz.word.service.NewGame;
import com.biz.word.service.WordGameService;

public class WordEx_02 {
	public static void main(String[] args) {
		
		WordGameService wGameService = new NewGame();
		wGameService.loadWord();
		wGameService.playGame();
		wGameService.gameOVer();
		
		
	}

}
