package game;

import java.util.Scanner;

import exceptions.PersonnageHorsPlateauException;

public class GameProgress {

	// ATTRIBUTS
	Scanner keyboard;
	BoardGame kitgame;
	Dice dice;

	
	// CONSTRUCTEUR
	public GameProgress() {
		keyboard = new Scanner(System.in);
		kitgame = new BoardGame();
		dice = new Dice();
	}

	// METHODES
	public void gameInProgress() {
		
		kitgame.setPlayerPlace(1);

		// Tant que le joueur n'est pas au bout du plateau de jeu, il relance le dés
		while (kitgame.getPlayerPlace() < kitgame.getBoardGame().length) {
			
			//Essaye de faire le programme
			try {
			
			// Affichage new place du joueur
			System.out.println("Tu es sur la case n° " + kitgame.getPlayerPlace());

			// Question relancer le dé
			System.out.println("tape 1 pour lancer le dé ou 2 pour quitter le jeu");

			// Récupération du chiffre tapé
			int diceChoice = keyboard.nextInt();
			
			// Si le joueur tape 1, le dé se lance, si le joueur tape 2, le programme s'arrêtte
			switch (diceChoice) {
			case 1:
				playTurn();
				break;
			case 2:
				// Quitte le jeu
				System.out.println("A bientôt");
				System.exit(0);
			default:
				System.out.println("Choix invalide");
				
			}
			
			// Si le joueur est au dela du plateau de jeu, lève une exception
			if(kitgame.getPlayerPlace() > kitgame.getBoardGame().length) {
				throw new PersonnageHorsPlateauException("Le personnage est hors plateau malheureux ! t'as fini ! ;)");
				
			}
			// Attrape le message de l'exception
			} catch (PersonnageHorsPlateauException e){
				System.out.println(e.getMessage());
				// Remet le joueur à la case 64 du plateau de jeu
				kitgame.setPlayerPlace(64);
				System.out.println("Tu es sur la case n° " + kitgame.getPlayerPlace());
			}
			
		}
		
		
		// Partie terminé, recommencer ou quitter ?
		System.out.println("Partie terminée, tape 1 pour recommencer avec ton personnage ou tape 2 pour quitter le jeu");
		int endGameChoice = keyboard.nextInt();
		
		
		// Si le joueur tape 1 la partie recommence, si le joueur tape 2 le programme s'arrêtte
		switch(endGameChoice) {
		case 1:
			System.out.println("Recommencons alors!");
			gameInProgress();
			break;
		case 2:
			System.out.println("A bientôt");
			System.exit(0);
		}
		
	}
	
	public void playTurn() {
		// Création d'un dé random par la création d'un objet kitGame
		dice = new Dice();
		// Affichage du dé à chaque tour
		System.out.println("Le dé affiche " + dice.getDice());
		// La position du joueur change en fonction du dé
		kitgame.setPlayerPlace(kitgame.getPlayerPlace() + dice.getDice());
	}
	

}
