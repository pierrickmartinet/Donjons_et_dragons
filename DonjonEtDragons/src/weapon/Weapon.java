package weapon;

public abstract class Weapon {

	// ATTRIBUTS
	private String name;
	private int attackPoint;
	
	
	// CONSTRUCTEUR
	public Weapon(String name, int attackPoint) {
		this.name = name;
		this.attackPoint = attackPoint;
	}
	
	
	// METHODES
	public abstract String type();
	
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
