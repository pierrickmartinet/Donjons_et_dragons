package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Import cases du plateau et contenue des cases
import boardCase.BoardCase;
import boardCase.EmptyCase;
import boardCase.EnemyCase;
import boardCase.PotionCase;
import boardCase.WeaponMagicianCase;
import boardCase.WeaponWarriorCase;
import enemy.Dragon;
import enemy.Goblin;
import enemy.Wizard;
import magicianWeapons.Fireball;
import magicianWeapons.Lightning;
import potions.BigPotion;
import potions.StandardPotion;
import warriorWeapons.Mace;
import warriorWeapons.Sword;

/**
 * BoardGame represente un plateau de jeu de 64 cases sous forme de liste
 * 
 * @author piouk
 * @version 1.0
 */
public class BoardGame {

	// ATTRIBUTS
	// Création d'une Array List qui accepte uniquement des cases du plateau
	/**
	 * boardCases : création d'une liste Attention, cette liste accepte uniquement
	 * des types BoardCase
	 */
	private List<BoardCase> boardCases = new ArrayList<BoardCase>();

	// CONSTRUCTEUR
	/**
	 * Le constructeur permet de construire le plateau de jeu avec le contenu des
	 * différentes cases du plateau
	 */
	public BoardGame() {

		// Création des cases vides
		for (int i = 0; i < 14; i++) {
			boardCases.add(new EmptyCase());
		}
		// Création des cases ennemies Gobelin
		for (int i = 0; i < 12; i++) {
			boardCases.add(new EnemyCase(new Goblin("Gobelin", 6, 1)));
		}
		// Création des cases ennemies Dragons
		for (int i = 0; i < 4; i++) {
			boardCases.add(new EnemyCase(new Dragon("Dragon", 15, 4)));
		}
		// Création des cases ennemies Sorciers
		for (int i = 0; i < 10; i++) {
			boardCases.add(new EnemyCase(new Wizard("Sorcier", 9, 2)));
		}
		// Création des cases arme de magicien - eclair
		for (int i = 0; i < 5; i++) {
			boardCases.add(new WeaponMagicianCase(new Lightning("eclair de magicien", 2)));
		}
		// Création des cases arme de magicien - boule de feu
		for (int i = 0; i < 2; i++) {
			boardCases.add(new WeaponMagicianCase(new Fireball("boule de feu de magicien", 7)));
		}
		// Création des cases arme de guerrier - épée
		for (int i = 0; i < 4; i++) {
			boardCases.add(new WeaponWarriorCase(new Sword("épée de guerrier", 5)));
		}
		// Création des cases arme de guerrier - massue
		for (int i = 0; i < 5; i++) {
			boardCases.add(new WeaponWarriorCase(new Mace("massue de guerrier", 3)));
		}
		// Création des cases potion standard
		for (int i = 0; i < 6; i++) {
			boardCases.add(new PotionCase(new StandardPotion("potion standard", 2)));
		}
		// Création des cases grosse potion
		for (int i = 0; i < 2; i++) {
			boardCases.add(new PotionCase(new BigPotion("grosse potion", 5)));
		}

		// Mélange de la liste
		/**
		 * Permet de mélanger les cases du plateau de jeu
		 */
		Collections.shuffle(boardCases);

	}

	// GETTERS ET SETTERS
	public List<BoardCase> getBoardCases() {
		return boardCases;
	}

	public void setBoardCases(List<BoardCase> boardCases) {
		this.boardCases = boardCases;
	}

}
