package com.rpg.model;

import java.util.Random;

public abstract class Personnage {
	
		//Attributs
		protected String p_nom;
		protected int p_vie;
		protected int p_defense;
		protected int p_esquive;
		protected int p_attaque;
		protected Position p_position;
		protected Inventaire invent;
		
		//Constructeurs
		public Personnage(String nom, int vie, int defense, int esquive, int attaque) {
			//super();
			this.p_nom = nom;
			this.p_vie = vie;
			this.p_defense = defense;
			this.p_esquive = esquive;
			this.p_attaque = attaque;
		}
		//Getters
		public String getP_nom() {
			return p_nom;
		}
		public int getP_vie() {
			return p_vie;
		}
		public int getP_defense() {
			return p_defense;
		}
		public int getP_esquive() {
			return p_esquive;
		}
		public int getP_attaque() {
			return p_attaque;
		}
		public Position getP_position() {
			return p_position;
		}
		public Inventaire getInvent() {
			return invent;
		}
		//Setters
		public void setP_nom(String nom) {
			this.p_nom = nom;
		}
		public void setP_vie(int vie) {
			this.p_vie = vie;
		}
		public void setP_defense(int defense) {
			this.p_defense = defense;
		}
		public void setP_esquive(int esquive) {
			this.p_esquive = esquive;
		}
		public void setP_attaque(int attaque) {
			this.p_attaque = attaque;
		}
		public void setP_position(Position position) {
			this.p_position = position;
		}
		public void setInvent(Inventaire i) {
			this.invent = i;
		}
		
		//Méthodes
	
		
		
		
		//Attaquer
		public int attaquer(){
			Random rand = new Random();
			int a = rand.nextInt(p_attaque);
			return a;
		}
		public String toString() {
			return "Personnage [p_nom=" + p_nom + ", p_vie=" + p_vie + ", p_defense=" + p_defense + ", p_esquive="
					+ p_esquive + ", p_attaque=" + p_attaque + ", p_position=" + p_position + ", invent=" + invent + "]";
		}

}
