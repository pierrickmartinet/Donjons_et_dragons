package game;

import game.ToolsGame;

public class GameProgress {
	
	
	public void gameInProgress() {
		
		ToolsGame boardGame = new ToolsGame();
		
		System.out.println("Vous êtes sur la case n° " + boardGame.getPlayerPlace());
	}

}
