package main;

import game.GameProgress;
import game.Menu;

public class Main {
	
	// Point d'entrée du programme
	public static void main(String[] args) {
		
		// Instenciation d'un objet de la classe menu
		Menu menu = new Menu();
		// Appel de la fonction execute() de la classe Menu qui lance le menu du jeu
		menu.execute();
		// Instenciation d'un objet de la classe GameProgress
		GameProgress gameProgress = new GameProgress(menu.getPlayer());
		// Appel de la fonction gameInProgress() de la classe GameProgress qui démarre le jeu
		gameProgress.gameInProgress();
		
	}
}