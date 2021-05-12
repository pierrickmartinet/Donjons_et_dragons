package game;


import java.util.Scanner;
import characters.Personnage;
import characters.Warrior;
import magicianWeapons.MagicianWeapon;
import warriorWeapons.WarriorWeapon;
import characters.Magician;

/**
 * Menu represente le menu d'entrée du jeu
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
	/**
	 * warriorWeapon: représente une arme de guerrier (null au départ)
	 */
	private WarriorWeapon warriorWeapon;
	/**
	 * magicianWeapon: représente une arme de magicien (null au départ)
	 */
	private MagicianWeapon magicianWeapon;

	
	// CONSTRUCTEURS
	/**
	 * Le constructeur de Menu permet l'instanciation d'un scanner lisant les entrées utilisateur, 
	 * il défini une valeur nulle aux armes des personnage utile lors de l'instanciation de ceux ci
	 */
	public Menu() {
		keyboard = new Scanner(System.in);
		warriorWeapon = null;
		magicianWeapon = null;
	}

	
	// METHODES
	/**
	 * La méthode execute permet le déroulé du menu du jeu
	 * elle permet à l'utilisateur de démarrer la partie, choisir son héro, le nom du héro
	 */
	public void execute() {

		System.out.println("Bonjour, bienvenue sur le jeu Donjons et dragons");

		// Enregistrement du premier choix saisi
		int firstChoice = questions("veuillez saisir 1 pour start ou 2 pour quitter le jeu");

		switch (firstChoice) {
		case 1:
			System.out.println("Tu as choisis start !");
			break;
		case 2:
			System.out.println("A bientôt");
			System.exit(0);
			break;
		default:
			System.out.println("Saisis 1 pour start ou 2 pour quitter le jeu");
		}

		// Enregistrement du choix personnage saisi
		int characterChoice = questions(
				"choisis ton personnage, tape 1 pour warrior, 2 pour magicien ou 3 pour quitter");

		switch (characterChoice) {
		case 1:
			System.out.println("Tu as choisis warrior");
			System.out.println("Choisis un nom");
			String characterWarriorName = keyboard.nextLine();
			// Création d'un Warrior
			player = new Warrior(characterWarriorName, 5, 5, warriorWeapon);
			break;
		case 2:
			System.out.println("Tu as choisis magicien");
			System.out.println("Choisis un nom");
			String characterMagicianName = keyboard.nextLine();
			// Création d'un Magicien
			player = new Magician(characterMagicianName, 3, 8, magicianWeapon);
			break;
		case 3:
			System.out.println("A bientôt");
			System.exit(0);
			break;
		default:
			System.out.println("Tape 1 pour warrior ou 2 pour magicien");
		}

		// Affichage du nom
		System.out.println("Tu as choisis d'appeller ton personnage: " + player.getName());

		// Afficher les informations ou modifier le nom du personnage
		int addOrEdit = questions("Tape 1 pour modifier ton nom, 2 pour afficher les info du perso ou 3 pour quitter");

		switch (addOrEdit) {
		case 1:
			System.out.println("Saisis ton nouveau nom de personnage");
			String editName = keyboard.nextLine();
			player.setName(editName);
			System.out.println("Le nouveau nom de ton personnage est: " + player.getName());
			break;
		case 2:
			System.out.println(player);
			break;
		case 3:
			System.out.println("A bientôt");
			System.exit(0);
			break;
		}

		// Démarrer ou quitter le jeu
		int startOrExit = questions("On y est presque ! Tape 1 pour démarrer ou 2 pour quitter le jeu");

		switch (startOrExit) {
		case 1:
			System.out.println("Le jeu démarre");
			break;
		case 2:
			System.out.println("A bientôt");
			System.exit(0);
			break;
		}
	}

	/**
	 * La méthode question permet de poser une question à un utilisateur et de retourner un entier representant sa réponse 
	 * @param question la question à poser à l'utilisateur (type: String)
	 * @return un entier comportant l'entrée clavier de l'utilisateur pour la question posé
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
