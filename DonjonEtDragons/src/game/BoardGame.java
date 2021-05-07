package game;

import java.util.ArrayList;
import java.util.Arrays;
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
import potions.Potion;
import potions.StandardPotion;
import warriorWeapons.Mace;
import warriorWeapons.Sword;

public class BoardGame {

	// ATTRIBUTS

	// Place du joueur
	private int playerPlace;

	// Création d'une Array List qui accepte uniquement des cases du plateau
	private List<BoardCase> boardCases = new ArrayList<BoardCase>();

	// CONSTRUCTEUR
	public BoardGame() {

		// PLace du joueur de la case 1 à 64
		playerPlace = 0;
		// case 0
		boardCases.add(new EmptyCase());
		// case 1
		boardCases.add(new WeaponMagicianCase(new Lightning("eclair de magicien", 2)));
		// case 2
		boardCases.add(new WeaponWarriorCase(new Mace("massue de guerrier", 3)));
		// case 3
		boardCases.add(new EnemyCase(new Goblin("Gobelin", 15, 4)));
		// case 4
		boardCases.add(new WeaponMagicianCase(new Lightning("eclair de magicien", 2)));
		// case 5
		boardCases.add(new WeaponWarriorCase(new Mace("massue de guerrier", 3)));
		// case 6
		boardCases.add(new EnemyCase(new Goblin("Gobelin", 15, 4)));
		// case 7
		boardCases.add(new PotionCase(new StandardPotion("potion standard", 2)));
		// case 8
		boardCases.add(new WeaponMagicianCase(new Lightning("eclair de magicien", 2)));
		// case 9
		boardCases.add(new EnemyCase(new Goblin("Gobelin", 15, 4)));
		// case 10
		boardCases.add(new EnemyCase(new Wizard("Sorcier", 15, 4)));
		// case 11
		boardCases.add(new WeaponWarriorCase(new Mace("massue de guerrier", 3)));
		// case 12
		boardCases.add(new EnemyCase(new Goblin("Gobelin", 15, 4)));
		// case 13
		boardCases.add(new PotionCase(new StandardPotion("potion standard", 2)));
		// case 14
		boardCases.add(new EmptyCase());
		// case 15
		boardCases.add(new EnemyCase(new Goblin("Gobelin", 15, 4)));
		// case 16
		boardCases.add(new EnemyCase(new Goblin("Gobelin", 15, 4)));
		// case 17
		boardCases.add(new WeaponMagicianCase(new Lightning("eclair de magicien", 2)));
		// case 18
		boardCases.add(new EnemyCase(new Goblin("Gobelin", 15, 4)));
		// case 19
		boardCases.add(new WeaponWarriorCase(new Sword("épée de guerrier", 5)));
		// case 20
		boardCases.add(new EnemyCase(new Wizard("Sorcier", 15, 4)));
		// case 21
		boardCases.add(new EnemyCase(new Goblin("Gobelin", 15, 4)));
		// case 22
		boardCases.add(new WeaponWarriorCase(new Mace("massue de guerrier", 3)));
		// case 23
		boardCases.add(new WeaponMagicianCase(new Lightning("eclair de magicien", 2)));
		// case 24
		boardCases.add(new EnemyCase(new Goblin("Gobelin", 15, 4)));
		// case 25
		boardCases.add(new EnemyCase(new Wizard("Sorcier", 15, 4)));
		// case 26
		boardCases.add(new WeaponWarriorCase(new Sword("épée de guerrier", 5)));
		// case 27
		boardCases.add(new EnemyCase(new Goblin("Gobelin", 15, 4)));
		// case 28
		boardCases.add(new PotionCase(new BigPotion("grosse potion", 5)));
		// case 29
		boardCases.add(new EnemyCase(new Goblin("Gobelin", 15, 4)));
		// case 30
		boardCases.add(new EnemyCase(new Goblin("Gobelin", 15, 4)));
		// case 31
		boardCases.add(new PotionCase(new StandardPotion("potion standard", 2)));
		// case 32
		boardCases.add(new EnemyCase(new Wizard("Sorcier", 15, 4)));
		// case 33
		boardCases.add(new PotionCase(new StandardPotion("potion standard", 2)));
		// case 34
		boardCases.add(new EmptyCase());
		// case 35
		boardCases.add(new EnemyCase(new Wizard("Sorcier", 15, 4)));
		// case 36
		boardCases.add(new EnemyCase(new Wizard("Sorcier", 15, 4)));
		// case 37
		boardCases.add(new EnemyCase(new Wizard("Sorcier", 15, 4)));
		// case 38
		boardCases.add(new WeaponWarriorCase(new Mace("massue de guerrier", 3)));
		// case 39
		boardCases.add(new PotionCase(new StandardPotion("potion standard", 2)));
		// case 40
		boardCases.add(new EnemyCase(new Wizard("Sorcier", 15, 4)));
		// case 41
		boardCases.add(new PotionCase(new BigPotion("grosse potion", 5)));
		// case 42
		boardCases.add(new WeaponWarriorCase(new Sword("épée de guerrier", 5)));
		// case 43
		boardCases.add(new PotionCase(new StandardPotion("potion standard", 2)));
		// case 44
		boardCases.add(new EnemyCase(new Wizard("Sorcier", 15, 4)));
		// case 45
		boardCases.add(new EnemyCase(new Dragon("Dragon", 15, 4)));
		// case 46
		boardCases.add(new EmptyCase());
		// case 47
		boardCases.add(new EnemyCase(new Wizard("Sorcier", 15, 4)));
		// case 48
		boardCases.add(new WeaponMagicianCase(new Fireball("boule de feu de magicien", 7)));
		// case 49
		boardCases.add(new WeaponMagicianCase(new Fireball("boule de feu de magicien", 7)));
		// case 50
		boardCases.add(new EmptyCase());
		// case 51
		boardCases.add(new EmptyCase());
		// case 52
		boardCases.add(new EnemyCase(new Dragon("Dragon", 15, 4)));
		// case 53
		boardCases.add(new WeaponWarriorCase(new Sword("épée de guerrier", 5)));
		// case 54
		boardCases.add(new EmptyCase());
		// case 55
		boardCases.add(new EmptyCase());
		// case 56
		boardCases.add(new EnemyCase(new Dragon("Dragon", 15, 4)));
		// case 57
		boardCases.add(new EmptyCase());
		// case 58
		boardCases.add(new EmptyCase());
		// case 59
		boardCases.add(new EmptyCase());
		// case 60
		boardCases.add(new EmptyCase());
		// case 61
		boardCases.add(new EmptyCase());
		// case 62
		boardCases.add(new EnemyCase(new Dragon("Dragon", 15, 4)));
		// case 63
		boardCases.add(new EmptyCase());

	}

	
	// Getters et Setters

	public int getPlayerPlace() {
		return playerPlace;
	}

	public void setPlayerPlace(int playerPlace) {

		this.playerPlace = playerPlace;
	}

	public List<BoardCase> getBoardCases() {
		return boardCases;
	}

	public void setBoardCases(List<BoardCase> boardCases) {
		this.boardCases = boardCases;
	}

}
