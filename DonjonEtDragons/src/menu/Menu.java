package menu;


// Import de la classe scanner permettant de lire les entrées clavier
import java.util.Scanner;

// Import de la classe Warriors dans le package characters
import characters.Warriors;


public class Menu {
	
	// Attributs
	private String firstChoice;
	Scanner keyboard = new Scanner(System.in);
	
	
	// Point d'entrée du programme
	public static void main(String[] args) {
		
		// Création d'un objet menu qui permet d'utiliser les méthodes de la class menu
		Menu menu = new Menu();
		
		// Phrase de bienvenue du jeu
		System.out.println("Bonjour, bienvenue sur le jeu Donjons et dragons");
		
		// Premier menu: nouveau personnage ou exit
		System.out.println("Veuillez saisir start ou exit");
		menu.setFirstChoice(menu.getKeyboard().nextLine());
		
		
		//création d'un Warrior
		Warriors thor = new Warriors("thor", 5, 5);
		
		// Affichage d'un Warrior
		System.out.println(thor);
		
	}

	// Getters et Setters
	public String getFirstChoice() {
		return firstChoice;
	}


	public void setFirstChoice(String firstChoice) {
		this.firstChoice = firstChoice;
	}


	public Scanner getKeyboard() {
		return keyboard;
	}


	public void setKeyboard(Scanner keyboard) {
		this.keyboard = keyboard;
	}

}
