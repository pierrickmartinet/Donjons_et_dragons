package game;

import java.util.Scanner;
import characters.Personnage;
import characters.Warrior;
import dataBase.DataBase;
import magicianWeapons.MagicianWeapon;
import warriorWeapons.WarriorWeapon;
import weapon.Weapon;
import characters.Magician;

/**
 * Menu represente le menu d'entrée du jeu
 * 
 * @author piouk
 * @version 1.0
 */
public class Menu {

	// ATTRIBUTS
	/**
	 * keyboard: scanner permettant de lire les entrées clavier de l'utilisateur
	 */
	private Scanner keyboard;
	/**
	 * player: joueur
	 */
	private Personnage player;
	
	
	private DataBase dataBase;

	// CONSTRUCTEURS
	/**
	 * Le constructeur de Menu permet l'instanciation d'un scanner lisant les
	 * entrées utilisateur, il défini une valeur nulle aux armes des personnage
	 * utile lors de l'instanciation de ceux ci
	 */
	public Menu() {
		keyboard = new Scanner(System.in);
		dataBase = new DataBase();
	}

	// METHODES

	/**
	 * La méthode execute permet le déroulé du menu du jeu elle permet à
	 * l'utilisateur de démarrer la partie, choisir son héro, le nom du héro
	 */
	public void execute() {

		// Bienvenue
		System.out.println("                   ,   ,");
		System.out.println("                   \\\\  \\\\");
		System.out.println("                   ) \\\\  \\\\       _p_");
		System.out.println("                   )^\\\\ ))\\\\ )) /  *\\");
		System.out.println("                    \\  _|| ||  / /^`-'");
		System.out.println("           __       -\\ \\\\--   / /");
		System.out.println("         <'  \\\\___/      ___. )'\n" + "");
		System.out.println("               `====\\  )___/\\\\");
		System.out.println("                   //       `\" ");
		System.out.println("                   \\\\       /  \\\n" + "");
		System.out.println("                   +====================+");
		System.out.println("                   |     Bienvenue      |");
		System.out.println("                   |        dans        |");
		System.out.println("                   | Donjons et dragons |");
		System.out.println("                   +====================+");

		// Enregistrement du premier choix saisi

		System.out.println("+----------------------------+");
		System.out.println("| 1. Nouvelle partie         |");
		System.out.println("| 2. Charger dernière partie |");
		System.out.println("+----------------------------+");
		int firstChoice = questions("");

		switch (firstChoice) {
		// Nouvelle partie
		case 1:
			System.out.println("C'est partit !");

			// Enregistrement du choix personnage saisi
			System.out.println("+----------------------------+");
			System.out.println("| Choisi un type:            |");
			System.out.println("| 1. Guerrier                |");
			System.out.println("| 2. Magicien                |");
			System.out.println("+----------------------------+");
			int characterChoice = questions("");

			switch (characterChoice) {
			case 1:
				System.out.println("Ok pour guerrier !");
				System.out.println("+----------------------------+");
				System.out.println("|   Choisi ton petit nom     |");
				System.out.println("+----------------------------+");
				String characterWarriorName = keyboard.nextLine();
				// Création d'un Warrior
				player = new Warrior(characterWarriorName, 5, 5, null);
				break;
			case 2:
				System.out.println("Ok pour magicien !");
				System.out.println("+----------------------------+");
				System.out.println("|   Choisi ton petit nom     |");
				System.out.println("+----------------------------+");
				String characterMagicianName = keyboard.nextLine();
				// Création d'un Magicien
				player = new Magician(characterMagicianName, 3, 8, null);
				break;
			case 3:
				System.out.println("A bientôt !");
				System.exit(0);
				break;
			default:
				System.out.println("Tape 1 pour warrior ou 2 pour magicien");
			}

			// Affichage du nom
			System.out.println("Ah mais tu t'appelles " + player.getName() + ", j'ai déjà entendu parlé de toi !");

			System.out.println("+--------------------------------+");
			System.out.println("| Que veux tu faire maintenant ? |");
			System.out.println("| 1. Modifier ton nom            |");
			System.out.println("| 2. Afficher stats              |");
			System.out.println("| 3. Quitter le jeu              |");
			System.out.println("+--------------------------------+");
			int addOrEdit = questions("");

			switch (addOrEdit) {
			case 1:
				System.out.println("+------------------------------------+");
				System.out.println("|    Choisi ton nouveau petit nom    |");
				System.out.println("+------------------------------------+");
				String editName = keyboard.nextLine();
				player.setName(editName);
				System.out
						.println("Ok pour " + player.getName() + " alors, mais on change plus aprés je m'embrouille !");
				break;
			case 2:
				System.out.println(player);
				break;
			case 3:
				System.out.println("A bientôt !");
				System.exit(0);
				break;
			}

			// Démarrer ou quitter le jeu
			System.out.println("+----------------------------+");
			System.out.println("| On y est presque:          |");
			System.out.println("| 1. Lancer une partie       |");
			System.out.println("| 2. Quitter le jeu          |");
			System.out.println("+----------------------------+");
			int startOrExit = questions("");

			switch (startOrExit) {
			case 1:
				System.out.println("  _______________________________________");
				System.out.println(" /                                       \\");
				System.out.println("/   _   _   _                 _   _   _   \\");
				System.out.println("|  | |_| |_| |   _   _   _   | |_| |_| |  |");
				System.out.println("|   \\   _   /   | |_| |_| |   \\   _   /   |");
				System.out.println("|    | | | |     \\       /     | | | |    |");
				System.out.println("|    | |_| |______|     |______| |_| |    |");
				System.out.println("|    |              ___              |    |");
				System.out.println("|    |  _    _    (     )    _    _  |    |");
				System.out.println("|    | | |  |_|  (       )  |_|  | | |    |");
				System.out.println("|    | |_|       |       |       |_| |    |");
				System.out.println("|   /            |_______|            \\   |");
				System.out.println("|  |___________________________________|  |");
				System.out.println("\\           La partie commence            /");
				System.out.println(" \\_______________________________________/");
				break;
			case 2:
				System.out.println("A bientôt !");
				System.exit(0);
				break;
			}
			break;
		case 2:
			// Partie chargé
			player = dataBase.loadLastGame();
			System.out.println("Voici votre dernière sauvegarde :");
			System.out.println(player);

		}
		
	}

	/**
	 * La méthode question permet de poser une question à un utilisateur et de
	 * retourner un entier representant sa réponse
	 * 
	 * @param question la question à poser à l'utilisateur (type: String)
	 * @return un entier comportant l'entrée clavier de l'utilisateur pour la
	 *         question posé
	 */
	public int questions(String question) {
		int response;
		System.out.println(question);
		response = keyboard.nextInt();
		// Vide le tampon du clavier qui contient la touche Entrée
		keyboard.nextLine();
		return response;
	}

	// GETTERS ET SETTERS
	public Personnage getPlayer() {
		return player;
	}

	public void setPlayer(Personnage player) {
		this.player = player;
	}
}
