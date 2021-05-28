package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import characters.Magician;
import characters.Personnage;
import characters.Warrior;
import magicianWeapons.MagicianWeapon;
import warriorWeapons.Mace;
import warriorWeapons.WarriorWeapon;
import weapon.Weapon;

public class DataBase {
	

	// METHODES

	// Sauvegarde d'un héros
	public void saveHeroes(Personnage perso) {

		try {
			// Connection à la base de donnée bdd_java
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdd_java", "piouk",
					"root");
			// Création d'un objet statement permettant une intéraction avec la BDD
			Statement statement = connection.createStatement();
			// Insertion dans la base de donnée du héro
			int statut = statement.executeUpdate(
					"INSERT INTO Hero (type, nom, pv, strenght) VALUES ('" + perso.getClass().getName() + "','"
							+ perso.getName() + "','" + perso.getLife() + "','" + perso.getAttack() + "');",
					Statement.RETURN_GENERATED_KEYS);
			if (statut == 0) {
				throw new SQLException("La requête d'insertion à échoué");
			}
			ResultSet heroId = statement.getGeneratedKeys();
			heroId.next();
			// Insertion dans la base de donnée de l'arme
			statement.executeUpdate(
					"INSERT INTO weapon (name, strenght, hero_id, type) VALUES ('" + perso.getWeapon().getName() + "', '"
							+ perso.getWeapon().getAttackPoint() + "','" + heroId.getInt(1) + "','"+perso.getWeapon().type()+"');");
			// Récupération de la dernière ligne de la BDD
			ResultSet resultSet = statement.executeQuery("SELECT * FROM Hero ORDER BY id DESC LIMIT 1");
			while (resultSet.next()) {
				System.out.println("type: " + resultSet.getString("type"));
				System.out.println("nom: " + resultSet.getString("nom"));
				System.out.println("vie: " + resultSet.getString("pv"));
				System.out.println("attaque: " + resultSet.getString("strenght"));
			}

			ResultSet resultSetWeapon = statement.executeQuery("SELECT * FROM weapon ORDER BY id DESC LIMIT 1");
			while (resultSetWeapon.next()) {
				System.out.println("arme: " + resultSetWeapon.getString("name"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public Personnage loadLastGame() {

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdd_java", "piouk",
					"root");
			// Création d'un objet statement permettant une intéraction avec la BDD
			Statement statement = connection.createStatement();
			// Récupération du héro
			ResultSet loadHeroes = statement.executeQuery("SELECT * FROM Hero ORDER BY id DESC LIMIT 1");
			loadHeroes.next();
			Class<?> typeHeros = Class.forName(loadHeroes.getString("type"));
			Personnage player = (Personnage) typeHeros.newInstance();

			player.setName(loadHeroes.getString("nom"));
			player.setLife(loadHeroes.getInt("pv"));
			player.setAttack(loadHeroes.getInt("strenght"));
			
			int id = loadHeroes.getInt("id");
			ResultSet loadWeapon = statement.executeQuery("SELECT * FROM weapon WHERE hero_id="+id);
			loadWeapon.next();
			
			
			if(loadWeapon.getString("type").equals("mace")) {
				player.setWeapon(new Mace("massue de guerrier", 3));
			}
			if(loadWeapon.getString("type").equals("sword")) {
				player.setWeapon(new Mace("épée de guerrier", 5));
			}
			

			return player;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
