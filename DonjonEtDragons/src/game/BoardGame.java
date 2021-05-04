package game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Import cases du plateau et contenue des cases
import boardCase.BoardCase;
import boardCase.EmptyCase;
import boardCase.EnemyCase;
import boardCase.PotionCase;
import boardCase.WeaponWarriorCase;
import enemy.Goblin;
import potions.BigPotion;
import warriorWeapons.Sword;

public class BoardGame {

	// ATTRIBUTS

	//Place du joueur
	private int playerPlace;
	
	// Création d'une Array List qui accepte uniquement des cases du plateau
	private List<BoardCase> boardCases = new ArrayList<BoardCase>();
	
	
	// CONSTRUCTEUR
	public BoardGame() {
		
		// PLace du joueur de la case 1 à 64
		playerPlace = 0;
		// case 1
		boardCases.add(new EmptyCase());
		// case 2
		boardCases.add(new PotionCase(new BigPotion("Grosse potion", 5)));
		// case 3
		boardCases.add(new WeaponWarriorCase(new Sword("épée de guerrier", 5)));
		// case 4
		boardCases.add(new EnemyCase(new Goblin("Gobelin", 6, 1)));
		
	}
	

	// Getters et Setters
	
	public int getPlayerPlace() {
		return playerPlace;
	}


	public void setPlayerPlace(int playerPlace) {

		this.playerPlace = playerPlace;
	}

	public List<BoardCase> getBoardCases() {
		return boardCases;
	}


	public void setBoardCases(List<BoardCase> boardCases) {
		this.boardCases = boardCases;
	}


	// Méthode toString
	@Override
	public String toString() {
		return "BoardGame [boardCases=" + boardCases + "]";
	}
	


}
