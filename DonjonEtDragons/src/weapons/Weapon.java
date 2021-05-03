package weapons;

public class Weapon {
	
	// ATTRIBUTS
	private String name;
	private int strength;
	
	// CONSTRUCTEURS
	public Weapon(String name, int strength) {
		this.name = name;
		this.strength = strength;
	}

	
	//GETTERS ET SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	
}


