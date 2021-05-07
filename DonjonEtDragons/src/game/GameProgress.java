package game;

import java.util.Scanner;

import boardCase.BoardCase;
import characters.Personnage;
import exceptions.PersonnageHorsPlateauException;

public class GameProgress {

	// ATTRIBUTS
	private Scanner keyboard;
	private BoardGame kitgame;
	private Dice dice;
	private Personnage perso;
	private PlayerPlace playerPlace;

	
	// CONSTRUCTEUR
	public GameProgress(Personnage perso) {
		keyboard = new Scanner(System.in);
		kitgame = new BoardGame();
		dice = new Dice();
		playerPlace = new PlayerPlace();
		this.perso = perso;
	}

	


	// METHODES
	public void gameInProgress() {
		
		playerPlace.setPlayerPlace(0);
		
		// Affichage new place du joueur
		System.out.println("Tu es sur la case n° 0, cette case est vide");

		// Tant que le joueur n'est pas au bout du plateau de jeu, il relance le dés
		while (playerPlace.getPlayerPlace() < 64) {
			
			//Essaye de faire le programme
			try {
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
			if(playerPlace.getPlayerPlace() > 64) {
				throw new PersonnageHorsPlateauException("Le personnage est hors plateau malheureux ! t'as fini ! ;)");
				
			}
			// Attrape le message de l'exception
			} catch (PersonnageHorsPlateauException e){
				System.out.println(e.getMessage());
				// Remet le joueur à la case 64 du plateau de jeu
				playerPlace.setPlayerPlace(64);
				System.out.println("Tu es sur la case n° " + playerPlace.getPlayerPlace());
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
		
		// Création d'un dé random par la création d'un objet Dice
		dice = new Dice();
		// Affichage du dé à chaque tour
		System.out.println("Le dé affiche " + dice.getDice());
		// La position du joueur change en fonction du dé
		playerPlace.setPlayerPlace(playerPlace.getPlayerPlace() + dice.getDice());
		// Affichage new place du joueur
		System.out.print("Tu est sur la case n° " + playerPlace.getPlayerPlace() +", ");
		// Le contenue de la case
		//System.out.println(kitgame.getBoardCases().get(kitgame.getPlayerPlace()));
		// Interraction cases
		kitgame.getBoardCases().get(playerPlace.getPlayerPlace()).interaction(perso);
		// Affichage stats joueur
		System.out.println("Voici tes nouvelles stats " + perso.getName() + ":");
		System.out.println("Vie: " + perso.getLife());
		System.out.println("Attaque: " + perso.getAttack());
		System.out.println("Skills: " + perso.getWeaponName());
	}
	

}
