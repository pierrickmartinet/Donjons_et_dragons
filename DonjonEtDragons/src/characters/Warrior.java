package characters;

import warriorWeapons.WarriorWeapon;

public class Warrior extends Personnage{

	
	// ATTRIBUTS
	private WarriorWeapon weapon;
	
	
	// CONSTRUCTEURS
	public Warrior() {

	}
	
	public Warrior(String name) {
		super(name);
	}
	
	public Warrior(String name, int life, int attack, WarriorWeapon weapon) {
		super(name, life, attack);
		this.weapon = weapon;
	}

	
	// GETTERS ET SETTERS
	public WarriorWeapon getWeapon() {
		return weapon;
	}

	public void setWeapon(WarriorWeapon weapon) {
		this.weapon = weapon;
	}
	
	
	// METHODES
	@Override
	public String getWeaponName() {
		if (weapon != null) {
			return weapon.getName();
		} else {
			return "Vous n'avez aucune arme";
		}
	}
	
}