package potions;

public abstract class Potion {
	
	// ATTRIBUTS
	private String name;
	private int life;
	
	
	// CONSTRUCTEURS
	public Potion(String name, int life) {
		
		this.name = name;
		this.life = life;
		
	}

	
	// GETTERS ET SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}
	
	
}
