package main;

// Import de la classe menu
import menu.Menu;

public class Main {
	
	// Point d'entrée du programme
	public static void main(String[] args) {
		
		Menu menu = new Menu();
		// Appel de la fonction execute() de la classe Menu qui lance le menu du jeu
		menu.execute();
		
	}

}
