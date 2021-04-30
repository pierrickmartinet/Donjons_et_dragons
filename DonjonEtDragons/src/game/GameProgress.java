package game;

import java.util.Scanner;

public class GameProgress {

	// ATTRIBUTS
	Scanner keyboard = new Scanner(System.in);

	public void gameInProgress() {

		KitGame kitgame = new KitGame();

		// Tant que le joueur n'est pas au bout du plateau de jeu, il relance le dés
		while (kitgame.getPlayerPlace() < kitgame.getBoardGame().length) {

			// Affichage new place du joueur
			System.out.println("Tu es sur la case n° " + kitgame.getPlayerPlace());

			// Question relancer le dé
			System.out.println("tape 1 pour lancer le dé ou 2 pour quitter le jeu");

			// Récupération du chiffre tapé
			int diceChoice = keyboard.nextInt();
			
			// Si le joueur tape 1, le dé se lance, si le joueur tape 2, le programme s'arrêtte
			switch (diceChoice) {
			case 1:
				// Création d'un dé random par la création d'un objet kitGame
				KitGame dice = new KitGame();
				// Affichage du dé à chaque tour
				System.out.println("Le dé affiche " + dice.getDice());
				// La position du joueur change en fonction du dé
				kitgame.setPlayerPlace(kitgame.getPlayerPlace() + dice.getDice());
				break;
			case 2:
				// Quitte le jeu
				System.out.println("A bientôt");
				System.exit(0);
				break;
			default:
				System.out.println("Choix invalide");
			}
		}
		
		// Partie terminé, recommencer ou quitter ?
		System.out.println("Partie terminée, tape 1 pour recommencer avec ton personnage ou tape 2 pour quitter le jeu");
		int endGameChoice = keyboard.nextInt();
		
		switch(endGameChoice) {
		case 1:
			System.out.println("Recommencons alors!");
			gameInProgress();
		case 2:
			System.out.println("A bientôt");
			System.exit(0);
		}
		
	}

}
