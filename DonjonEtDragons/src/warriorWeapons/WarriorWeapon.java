package warriorWeapons;

public abstract class WarriorWeapon {
	
	// ATTRIBUTS
	private String name;
	private int attackPoint;
	
	// CONSTRUCTEURS
	public WarriorWeapon(String name, int attackPoint) {
		this.name = name;
		this.attackPoint = attackPoint;
	}

	
	// GETTERS ET SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAttackPoint() {
		return attackPoint;
	}

	public void setAttackPoint(int attackPoint) {
		this.attackPoint = attackPoint;
	}
	

}
