package game;

import java.util.Arrays;

public class BoardGame {

	// ATTRIBUTS

	// Plateau de jeu
	private int[] boardGame;
	//Place du joueur
	private int playerPlace;
	
	
	// CONSTRUCTEUR
	public BoardGame() {
		boardGame = new int[64];
		playerPlace = 1;
	}
	

	// Getters et Setters
	public int[] getBoardGame() {
		return boardGame;
	}

	public void setBoardGame(int[] boardGame) {
		this.boardGame = boardGame;
	}

	
	public int getPlayerPlace() {
		return playerPlace;
	}


	public void setPlayerPlace(int playerPlace) {

		this.playerPlace = playerPlace;
	}

	// Méthode toString
	@Override
	public String toString() {
		return "ToolsGame [boardGame=" + Arrays.toString(boardGame) + "]";
	}


}
