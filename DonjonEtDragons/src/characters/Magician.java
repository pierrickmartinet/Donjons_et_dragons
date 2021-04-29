package characters;

public class Magician {
	
	// Attributs
	private String name;
	private int life;
	private int attack;
	
	
	// Constructeurs
	public Magician() {
		name = null;
		life = 5;
		attack = 5;
	}
	
	public Magician(String name) {
		this.name = name;
		life = 5;
		attack = 5;
	}
	
	public Magician(String name, int life, int attack) {
		this.name = name;
		this.life = life;
		this.attack = attack;
	}
	
	public String toString() {
		return name;
	}
	
	
	// Getters et Setters
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

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

}
