package boardCase;

import warriorWeapons.WarriorWeapon;

public class WeaponWarriorCase extends BoardCase {
	
	// ATTRIBUTS
	private WarriorWeapon warriorWeapon;
	
	// CONSTRUCTEURS
	public WeaponWarriorCase (WarriorWeapon warriorWeapon) {
		
		this.warriorWeapon = warriorWeapon;
		
	}

	
	// TO STRING
	@Override
	public String toString() {
		return "c'est une case arme pour guerrier, une " + warriorWeapon.getName() + " s'y trouve";
	}
	

}
