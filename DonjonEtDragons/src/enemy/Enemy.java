package enemy;

public abstract class Enemy {
	
	// ATTRIBUTS
	private String name;
	private int life;
	private int attack;
	
	
	// CONSTRUCTEURS
	public Enemy(String name, int life, int attack) {
		this.name = name;
		this.life = life;
		this.attack = attack;
	}

}
