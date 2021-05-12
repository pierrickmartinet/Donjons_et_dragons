package characters;

public abstract class Personnage {
	
	
	// ATTRIBUTS
	protected String name;
	protected int life;
	protected int attack;
	
	
	// CONSTRUCTEURS
	public Personnage() {
		 
	}
	
	public Personnage(String name) {
		this.name = name;
	}
	
	public Personnage(String name, int life, int attack) {
		this.name = name;
		this.life = life;
		this.attack = attack;
	}
	
	
	// METHODE
	public abstract String getWeaponName();
	
	
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

	// TO STRING
	@Override
	public String toString() {
		return "Nom: " + name + ", Vie: " + life + ", Attaque: " + attack + ", Skills: " + getWeaponName();
	}

	
	
}
