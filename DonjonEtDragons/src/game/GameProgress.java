package game;

import java.util.Scanner;
import boardCase.BoardCase;
import boardCase.EnemyCase;
import characters.Personnage;
import exceptions.PersonnageHorsPlateauException;

public class GameProgress {

	// ATTRIBUTS
	private Scanner keyboard;
	private BoardGame boardGame;
	private Dice dice;
	private Personnage perso;
	private PlayerPlace playerPlace;

	// CONSTRUCTEUR
	public GameProgress(Personnage perso) {

		keyboard = new Scanner(System.in);
		boardGame = new BoardGame();
		dice = new Dice();
		playerPlace = new PlayerPlace();
		this.perso = perso;

	}

	// METHODES

	// Fonction de jeu
	public void gameInProgress() {

		playerPlace.setPlayerPlace(0);

		// Affichage new place du joueur
		System.out.println("Tu es sur la case n° 0, cette case est vide");

		// Tant que le joueur n'est pas au bout du plateau de jeu, il relance le dés
		while (playerPlace.getPlayerPlace() < 64) {

			// Essaye de faire le programme
			try {
				// Question relancer le dé
				System.out.println("tape 1 pour lancer le dé ou 2 pour quitter le jeu");

				// Récupération du chiffre tapé
				int diceChoice = keyboard.nextInt();

				// Si le joueur tape 1, le dé se lance, si le joueur tape 2, le programme
				// s'arrêtte
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

				// Attrape le message de l'exception
			} catch (PersonnageHorsPlateauException e) {
				System.out.println(e.getMessage());
				// Remet le joueur à la case 64 du plateau de jeu
				playerPlace.setPlayerPlace(63);
				System.out.println("Tu es sur la case n° " + playerPlace.getPlayerPlace());
			}

		}
		replay();
	}

	// Fonction jouer un tour
	public void playTurn() throws PersonnageHorsPlateauException {

		dice.throwDice();
		// Affichage du dé à chaque tour
		System.out.println("Le dé affiche " + dice.getDice());
		// La position du joueur change en fonction du dé
		playerPlace.setPlayerPlace(playerPlace.getPlayerPlace() + dice.getDice());
		// Si le joueur est au dela du plateau de jeu, lève une exception
		if (playerPlace.getPlayerPlace() > 64) {
			throw new PersonnageHorsPlateauException("Félicitations ! tu as gagné la partie ! ;)");

		}
		// Affichage new place du joueur
		System.out.print("Tu est sur la case n° " + playerPlace.getPlayerPlace() + ", ");
		BoardCase currentCase = boardGame.getBoardCases().get(playerPlace.getPlayerPlace());
		if (currentCase instanceof EnemyCase) {

			EnemyCase enemyCase = (EnemyCase) currentCase;
			System.out.println(enemyCase.getEnemy().infoNameEnemy());
			System.out.println(enemyCase.getEnemy().infoStatEnemy());

			System.out.println("Tapez 1 pour attaquer ou 2 pour fuir");
			int fightOrLeave = keyboard.nextInt();

			switch (fightOrLeave) {
			case 1:
				// Interraction cases
				currentCase.interaction(perso);
				break;
			case 2:
				dice.throwDice();
				playerPlace.setPlayerPlace(playerPlace.getPlayerPlace() - dice.getDice());
				System.out.println("Vous reculez de " + dice.getDice() + " cases");
				System.out.println("Vous êtes sur la case " + playerPlace.getPlayerPlace());
				break;
			}

		} else {
			// Interraction cases
			currentCase.interaction(perso);
		}

		// Affichage stats joueur
		System.out.println("Voici tes nouvelles stats " + perso.getName() + ":");
		System.out.println(perso);
	}

	
	// Fonction replay
	public void replay() {

		System.out.println("Partie terminée, tape 1 pour recommencer ou 2 pour quitter le jeu");
		int endGameChoice = keyboard.nextInt();

		// Si le joueur tape 1 la partie recommence, s'il tape 2 le programme s'arrête
		switch (endGameChoice) {
		case 1:
			System.out.println("Recommencons alors!");
			gameInProgress();
			break;
		case 2:
			System.out.println("A bientôt");
			System.exit(0);
		}
	}

}
