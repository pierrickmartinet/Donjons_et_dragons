package menu;

// Import de la classe scanner permettant de lire les entrées clavier
import java.util.Scanner;
// Import de la classe Warriors se trouvant dans le package characters
import characters.Warriors;
//Import de la classe Magician se trouvant dans le package characters
import characters.Magician;

public class Menu {

	// ATTRIBUTS
	Scanner keyboard = new Scanner(System.in);

	public void execute() {

		// Phrase de bienvenue du jeu
		System.out.println("Bonjour, bienvenue sur le jeu Donjons et dragons, veuillez saisir start ou exit");

		// Enregistrement du premier choix saisie dans la variable firstChoice
		String firstChoice = keyboard.nextLine();

		// Tant que la saisie est différente de "start" ou "exit" le programme redemande
		// la saise
		while ((!firstChoice.equals("start")) && (!firstChoice.equals("exit"))) {

			System.out.println("veuillez saisir start ou exit");
			firstChoice = keyboard.nextLine();
		}

		// Si la saisie est start, le programme continue
		if (firstChoice.equals("start")) {
			System.out.println("C'est partit ! Choisis ton personnage : saisis warrior ou magicien");
		}
		// Sinon, le programme s'arrêtte
		else {
			System.out.println("A bientôt");
			System.exit(0);
		}

		// Enregistrement du choix du personnage saisie dans la variable characterChoice
		String characterChoice = keyboard.nextLine();

		// Tant que la saisie est différente de "warrior" ou "magicien" le programme
		// redemande de séléctionner un personnage
		while ((!characterChoice.equals("warrior")) && (!characterChoice.equals("magicien"))) {

			System.out.println("Choisis ton personnage : saisis warrior ou magicien");
			characterChoice = keyboard.nextLine();
		}

		// Si la saisie est "warrior", un warrior est créé
		if (characterChoice.equals("warrior")) {
			System.out.println("Tu as choisis warrior !");
			// Demande de nom de personnage
			System.out.println("Choisis un nom pour ton personnage");
			// Enregistrement de la saisie du nom dans la variable characterName
			String characterWarriorName = keyboard.nextLine();
			// Création d'un Warrior
			Warriors warrior1 = new Warriors(characterWarriorName, 5, 5);
			// Affichage du nom
			System.out.println("Tu as choisis d'appeller ton warrior: " + warrior1);
		}
		// Sinon un magicien est créé
		else {
			System.out.println("Tu as choisis magicien !");
			System.out.println("Choisis un nom pour ton personnage");
			// Enregistrement de la saisie du nom dans la variable characterName
			String characterMagicianName = keyboard.nextLine();
			// Création d'un magicien
			Magician magician1 = new Magician(characterMagicianName, 5, 5);
			// Affichage du nom
			System.out.println("Tu as choisi d'appeller ton magicien: " + magician1);
		}


		
	}

	public Scanner getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(Scanner keyboard) {
		this.keyboard = keyboard;
	}

}
