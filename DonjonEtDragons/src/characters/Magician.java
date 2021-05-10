package characters;

import magicianWeapons.MagicianWeapon;

public class Magician extends Personnage{
	
	
	// ATTRIBUTS
	private MagicianWeapon power;
	
	
	// CONSTRUCTEURS
	public Magician() {
		super();
	}
	
	public Magician(String name) {
		super(name);
	}
	
	public Magician(String name, int life, int attack, MagicianWeapon power) {
		super(name, life, attack);
		this.power = power;
		
	}

	
	// GETTERS ET SETTERS
	public MagicianWeapon getPower() {
		return power;
	}

	public void setPower(MagicianWeapon power) {
		this.power = power;
	}
	
	
	// METHODES
	@Override
	public String getWeaponName() {
		if (power != null) {
			return power.getName();
		} else {
			return "Vous n'avez aucun pouvoir";
		}
	}
	

}
