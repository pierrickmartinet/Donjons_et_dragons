package menu;


// Import de la classe scanner permettant de lire les entrées clavier
import java.util.Scanner;
//import java.lang.System;

// Import de la classe Warriors dans le package characters
import characters.Warriors;


public class Menu {
	
	// ATTRIBUTS
	Scanner keyboard = new Scanner(System.in);
	
	
	// Point d'entrée du programme
	public static void main(String[] args) {
		
		// Création d'un objet menu qui permet d'utiliser les méthodes de la classe Menu
		Menu menu = new Menu();
		
		// Phrase de bienvenue du jeu
		System.out.println("Bonjour, bienvenue sur le jeu Donjons et dragons, veuillez saisir start ou exit");
		
		// Enregistrement du premier choix saisie dans la variable firstChoice
		String firstChoice = menu.getKeyboard().nextLine();
		
		// Si le joueur saisi start le jeu démarre sinon le jeu s'arrêtte 
		if(firstChoice.equals("start")) {
			System.out.println("C'est partit ! Choisis ton personnage : saisis warrior ou magicien");
		} else {
			System.out.println("A bientôt");
			System.exit(0);
		}
		
		
		//création d'un Warrior
		Warriors thor = new Warriors("thor", 5, 5);
		
		// Affichage d'un Warrior
		System.out.println(thor);
		
	}


	public Scanner getKeyboard() {
		return keyboard;
	}


	public void setKeyboard(Scanner keyboard) {
		this.keyboard = keyboard;
	}

}
