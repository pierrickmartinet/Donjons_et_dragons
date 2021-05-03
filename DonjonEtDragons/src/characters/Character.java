package characters;

public abstract class Character {
	
	
	// ATTRIBUTS
	protected String name;
	protected int life;
	protected int attack;
	
	
	// CONSTRUCTEURS
	public Character() {
		 
	}
	
	public Character(String name) {
		this.name = name;
	}
	
	public Character(String name, int life, int attack) {
		this.name = name;
		this.life = life;
		this.attack = attack;
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

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	
	@Override
	public String toString() {
		return "Ton personnage: Nom: " + name + ", Vie: " + life + ", Attaque: " + attack;
	}
	
	
}
