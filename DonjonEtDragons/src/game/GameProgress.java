package game;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import boardCase.BoardCase;
import boardCase.EnemyCase;
import characters.Personnage;
import exceptions.PersonnageHorsPlateauException;

/**
 * GameProgress represente une partie de jeu
 * 
 * @author piouk
 * @version 1.0
 */
public class GameProgress {

	// ATTRIBUTS
	/**
	 * keyboard: scanner permettant de lire les entrées clavier de l'utilisateur
	 */
	private Scanner keyboard;
	/**
	 * boardgame: plateau de jeu de 64 cases
	 */
	private BoardGame boardGame;
	/**
	 * dice: Dé random à 6 face
	 */
	private Dice dice;
	/**
	 * perso: personnage choisi par l'utilisateur
	 */
	private Personnage perso;
	/**
	 * playerPlace: position du joueur
	 */
	private PlayerPlace playerPlace;

	
	// CONSTRUCTEUR
	/**
	 * Le constructeur d'une progression de partie permet d'instancier une partie de
	 * jeu avec un plateau de jeu, un dé, un personnage et une position de joueur
	 * 
	 * @param perso le personnage du joueur
	 */
	public GameProgress(Personnage perso) {

		keyboard = new Scanner(System.in);
		boardGame = new BoardGame();
		dice = new Dice();
		playerPlace = new PlayerPlace();
		this.perso = perso;

	}

	
	// METHODES

	// Fonction de jeu
	/**
	 * La méthode gameInProgress() permet tout le dérouler d'une partie de jeu tant
	 * que le joueur n'a pas atteint la fin du plateau de jeu en vie Tant que le
	 * joueur n'a pas atteint la victoire ou la défaite, elle appelle une fonction
	 * qui permet de rejouer un tour Le joueur peut à tout moment grace au scanner,
	 * jouer ou quitter la partie Lorsque le joueur arrive en fin de plateau elle
	 * appelle une autre fonction qui permet de recommencer le jeu
	 */
	public void playGame() {

		playerPlace.setPlayerPlace(0);
		

		// Affichage new place du joueur
		System.out.println("Tu es sur la case n° 0, cette case est vide");

		// Tant que le joueur n'est pas au bout du plateau de jeu, il relance le dés
		while (gameInProgress()) {

			// Essaye de faire le programme
			try {
				// Question relancer le dé
				System.out.println("tape 1 pour lancer le dé ou 2 pour sauvegarder le héro et quitter le jeu");

				// Récupération du chiffre tapé
				int diceChoice = keyboard.nextInt();

				// Si le joueur tape 1, le dé se lance, si le joueur tape 2, le programme
				// s'arrêtte
				switch (diceChoice) {
				case 1:
					playTurn();
					break;
				case 2:
					// Sauvegarde du héro
					System.out.println("Le héro suivant à été sauvegardé:");
					saveHeroes();
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
		if (perso.getLife() <= 0) {
			System.out.println("perdu, l'ennemi vous a battu");
		}
		replay();
	}

	
	/**
	 * La méthode determine les conditions d'arrêt du jeu
	 * @return boolean 
	 */
	public boolean gameInProgress() {
		return ((playerPlace.getPlayerPlace() < 64) && (perso.getLife() > 0));
	}
	
	// (playerPlace.getPlayerPlace() < 64) && (perso.getLife() > 0)

	/**
	 * La fonction playTurn() permet de jouer un tour elle lance le dé, adapte la
	 * position du joueur en fonction du lancé elle permet d'intéragir avec les
	 * différentes cases du plateau de jeu elle permet également la possibilité de
	 * combattre ou fuir lors d'un combat sur une case de type EnemyCase
	 * 
	 * @throws PersonnageHorsPlateauException renvoie une exception lorsque le
	 *                                        personnage est hors du plateau de jeu
	 */
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
	/**
	 * La méthode replay() permet de recommencer une partie avec le même personnage
	 * que la partie précédente ou de quitter le jeu en fin de partie
	 */
	public void replay() {

		System.out.println("Partie terminée, tape 1 pour recommencer ou 2 pour quitter le jeu");
		int endGameChoice = keyboard.nextInt();

		// Si le joueur tape 1 la partie recommence, s'il tape 2 le programme s'arrête
		switch (endGameChoice) {
		case 1:
			System.out.println("Recommencons alors!");
			playGame();
			break;
		case 2:
			System.out.println("A bientôt");
			System.exit(0);
		}
	}
	
	
	public void saveHeroes() {
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdd_java", "piouk", "root");
			Statement statement = connection.createStatement();
			
			statement.executeUpdate("INSERT INTO Hero (type, nom, pv, strenght, weapon) VALUES ('"+perso.getType()+"','"+perso.getName()+"','"+perso.getLife()+"','"+perso.getAttack()+"','"+perso.getWeaponName()+"');");
			
			ResultSet resultSet = statement.executeQuery("SELECT * FROM Hero ORDER BY id DESC LIMIT 1");
			
			while (resultSet.next()) {
				System.out.println("type: " + resultSet.getString("type"));
				System.out.println("nom: " + resultSet.getString("nom"));
				System.out.println("vie: " +resultSet.getString("pv"));
				System.out.println("attaque: " + resultSet.getString("strenght"));
				System.out.println("arme: " + resultSet.getString("weapon"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
