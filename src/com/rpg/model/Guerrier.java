package com.rpg.model;

import java.util.Random;

public class Guerrier extends Personnage{
	
		//Attributs
		private String nom_handgun;
		private int nb_balles;
		private int nb_handgun;
		//Constructeurs
		public Guerrier() {
			super("Guerrier", 100, 50, 15, 70);
			nom_handgun = "AR 15";
			nb_balles = 100;
			nb_handgun = 2;
		}
		
		public Guerrier(String nom, int vie, int defense, int esquive, int attaque, String name) {
			super(nom, vie, defense, esquive, attaque);
			this.nom_handgun = name;
		}

		//Getters
		public String getNom_handgun() {
			return nom_handgun;
		}
		public int getNb_balles() {
			return nb_balles;
		}
		public int getNb_handgun() {
			return nb_handgun;
		}
		public void setNom_handgun(String n) {
			this.nom_handgun = n;
		}
		public void setNb_balles(int b) {
			this.nb_balles = b;
		}
		public void setNb_handgun(int nb) {
			this.nb_handgun = nb;
		}
		//Méthodes
		public int attaquer(){
			Random rand = new Random();
			int a = rand.nextInt(p_attaque);
			return a;
		}
		//ToString() pour afficher les caractéristiques du joueur
		public String toString() {
//			return "Nom du joueur = "+ p_nom +"\nVie du joueur = " + p_vie +"\nCapacité de défendre = " + p_defense +"\nCapacité d'esquive = " + p_esquive +"\nCapacité d'attaque = " +p_attaque +"\nNom de l'arme par défaut = " + nom_handgun +"\nNombre de balles par arme = " + nb_balles + "\nNombre d'armes en possession = " + nb_handgun; 
			return "Guerrier";
		}
		

}
