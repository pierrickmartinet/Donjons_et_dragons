package main;

import game.GameProgress;

public class Main {
	
	// Point d'entrée du programme
	public static void main(String[] args) {
		
		// Instenciation d'un objet de la classe menu
		/*Menu menu = new Menu();
		// Appel de la fonction execute() de la classe Menu qui lance le menu du jeu
		menu.execute();*/
		
		GameProgress gameProgress = new GameProgress();
		
		gameProgress.gameInProgress();
		
	}
}