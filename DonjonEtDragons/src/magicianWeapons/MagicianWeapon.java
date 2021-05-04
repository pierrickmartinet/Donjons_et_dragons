package magicianWeapons;

public abstract class MagicianWeapon {
	
	// ATTRIBUTS
	private String name;
	private int attackPoint;
	
	
	// CONSTRUCTEURS
	public MagicianWeapon(String name, int attackPoint) {
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
