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
		// Création d'un objet menu qui permet d'utiliser les méthodes de la classe Menu
		Menu menu = new Menu();

		// Phrase de bienvenue du jeu
		System.out.println("Bonjour, bienvenue sur le jeu Donjons et dragons, veuillez saisir start ou exit");

		// Enregistrement du premier choix saisie dans la variable firstChoice
		String firstChoice = menu.getKeyboard().nextLine();

		// Tant que la saisie est différente de "start" ou "exit" le programme redemande
		// la saise
		while ((!firstChoice.equals("start")) && (!firstChoice.equals("exit"))) {

			System.out.println("veuillez saisir start ou exit");
			firstChoice = menu.getKeyboard().nextLine();
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
		String characterChoice = menu.getKeyboard().nextLine();

		// Tant que la saisie est différente de "warrior" ou "magicien" le programme
		// redemande de séléctionner un personnage
		while ((!characterChoice.equals("warrior")) && (!characterChoice.equals("magicien"))) {

			System.out.println("Choisis ton personnage : saisis warrior ou magicien");
			characterChoice = menu.getKeyboard().nextLine();
		}

		// Si la saisie est "warrior", un warrior est créé
		if (characterChoice.equals("warrior")) {
			System.out.println("Vous avez choisis warrior !");
			// Création d'un Warrior
			Warriors thor = new Warriors("", 5, 5);
		}
		// Sinon un magicien est créé
		else {
			System.out.println("Vous avez choisis magicien !");
			// Création d'un magicien
			Magician merlin = new Magician("", 5, 5);
		}

	}

	public Scanner getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(Scanner keyboard) {
		this.keyboard = keyboard;
	}

}
