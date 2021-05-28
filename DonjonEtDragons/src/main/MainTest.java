package main;

import characters.Personnage;
import characters.Warrior;
import dataBase.DataBase;
import warriorWeapons.Sword;
import warriorWeapons.WarriorWeapon;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DataBase database = new DataBase();
		Personnage perso = new Warrior("Coucou", 5, 5, new Sword("épée", 5));
		
		database.saveHeroes(perso);
	}

}
