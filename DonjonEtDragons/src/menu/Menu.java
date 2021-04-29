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
		while ((!characterChoice.equals("warrior")) && (!characterChoice.equals("magicien"))
				&& (!characterChoice.equals("exit"))) {

			// Choix du personnage
			System.out.println("Choisis ton personnage : saisis warrior ou magicien");
			characterChoice = keyboard.nextLine();
		}

		// Si la saisie est "warrior"
		if (characterChoice.equals("warrior")) {
			System.out.println("Tu as choisis warrior !");
			// Demande de nom de personnage
			System.out.println("Choisis un nom pour ton personnage");
			// Enregistrement de la saisie du nom dans la variable characterName
			String characterWarriorName = keyboard.nextLine();
			// Si le nom est égal à "exit", le programme s'arrètte
			if (characterWarriorName.equals("exit")) {
				System.out.println("A bientôt");
				System.exit(0);
			}
			// Création d'un Warrior
			Warriors warrior1 = new Warriors(characterWarriorName, 5, 5);
			// Affichage du nom
			System.out.println("Tu as choisis d'appeller ton warrior: " + warrior1.getName());
			// Afficher les informations ou modifier le nom du personnage
			System.out.println(
					"Vous avez maintenant le choix entre modifier le nom du personnage ou afficher ses informations, saisis modifier ou afficher");
			String addOrEdit = keyboard.nextLine();
			// Si la saisie est égale à exit le programme s'arrètte
			if (addOrEdit.equals("exit")) {
				System.out.println("A bientôt");
				System.exit(0);
			}
			// Tant que le joueur n'a pas saisi "afficher" ou "modifier" le programme
			// redemande la saisie
			while ((!addOrEdit.equals("afficher")) && (!addOrEdit.equals("modifier"))) {
				System.out.println("Saisir modifier ou afficher");
				addOrEdit = keyboard.nextLine();
			}
			// Si la saisie est égale à "afficher" le programme affiche les informations du
			// personnage
			if (addOrEdit.equals("afficher")) {
				System.out.println(warrior1);
			}
			// Sinon modifier le nom
			else {
				System.out.println("Saisis ton nouveau nom de personnage");
				String editName = keyboard.nextLine();
				warrior1.setName(editName);
				System.out.println("Le nouveau nom de ton personnage est: " + warrior1.getName());
			}

		}
		// Sinon si la saisie est "magicien"
		else if (characterChoice.equals("magicien")) {
			System.out.println("Tu as choisis magicien !");
			System.out.println("Choisis un nom pour ton personnage");
			// Enregistrement de la saisie du nom dans la variable characterName
			String characterMagicianName = keyboard.nextLine();
			// Si le nom est égal à "exit", le programme s'arrètte
			if (characterMagicianName.equals("exit")) {
				System.out.println("A bientôt");
				System.exit(0);
			}
			// Création d'un magicien
			Magician magician1 = new Magician(characterMagicianName, 5, 5);
			// Affichage du nom
			System.out.println("Tu as choisi d'appeller ton magicien: " + magician1.getName());

			// Afficher les informations ou modifier le nom du personnage
			System.out.println(
					"Vous avez maintenant le choix entre modifier le nom du personnage ou afficher ses informations, saisis modifier ou afficher");
			String addOrEdit = keyboard.nextLine();
			// Si la saisie est égale à exit le programme s'arrètte
			if (addOrEdit.equals("exit")) {
				System.out.println("A bientôt");
				System.exit(0);
			}
			// Tant que le joueur n'a pas saisi "afficher" ou "modifier" le programme
			// redemande la saisie
			while ((!addOrEdit.equals("afficher")) && (!addOrEdit.equals("modifier"))) {
				System.out.println("Saisir modifier ou afficher");
				addOrEdit = keyboard.nextLine();
			}
			// Si la saisie est égale à "afficher" le programme affiche les informations du
			// personnage
			if (addOrEdit.equals("afficher")) {
				System.out.println(magician1);
			}
			// Sinon modifier le nom
			else {
				System.out.println("Saisis ton nouveau nom de personnage");
				String editName = keyboard.nextLine();
				magician1.setName(editName);
				System.out.println("Le nouveau nom de ton personnage est: " + magician1.getName());
			}
		} else {
			System.out.println("A bientôt");
			System.exit(0);
		}

	}

	// Getters et Setters
	public Scanner getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(Scanner keyboard) {
		this.keyboard = keyboard;
	}

}
