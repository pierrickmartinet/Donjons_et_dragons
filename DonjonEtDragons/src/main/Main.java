package main;

import game.GameProgress;
import game.Menu;
/**
 * Main represente le point d'entrée du programme, le coeur du programme
 * @author piouk
 * @version 1.0
 */
public class Main {
	
	// Point d'entrée du programme
	/**
	 * Le point d'entrée du programme
	 * Le programme appelle directement le menu, puis la partie
	 * @param args paramètre d'entrée
	 */
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