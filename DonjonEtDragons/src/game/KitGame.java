package game;

import java.util.Arrays;

public class KitGame {

	// ATTRIBUTS

	// Plateau de jeu
	private int[] boardGame;
	// Dés
	private int dice;
	//Place du joueur
	private int playerPlace;
	
	
	// CONSTRUCTEUR
	public KitGame() {
		boardGame = new int[64];
		dice = dice();
		playerPlace = 1;
	}
	
	
	// Fonction qui lance un dés virtuel et renvoie un chiffre random entre 1 et 6
	public int dice() {
		
		int min = 1;
		int max = 6;

		int randomValue = min + (int) (Math.random() * ((max - min) + 1));

		return randomValue;
	}

	
	// Getters et Setters
	public int[] getBoardGame() {
		return boardGame;
	}

	public void setBoardGame(int[] boardGame) {
		this.boardGame = boardGame;
	}

	public int getDice() {
		return dice;
	}

	public void setDice(int dice) {
		this.dice = dice;
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
