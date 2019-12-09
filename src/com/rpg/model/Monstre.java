package com.rpg.model;

public abstract class Monstre {

		//Attributs
		protected String m_nom;
		protected int m_vie;
		protected int m_attaque;
		protected int m_esquive;
		protected int m_defense;
		protected Position m_position;
		
		public Monstre(String nom, int vie, int defense, int esquive, int attaque) {
			super();
			this.m_nom = nom;
			this.m_vie = vie;
			this.m_attaque = attaque;
			this.m_esquive = esquive;
			this.m_defense = defense;
		}
		//Getters
		public String getM_nom() {
			return m_nom;
		}
		public int getM_vie() {
			return m_vie;
		}
		public int getM_attaque() {
			return m_attaque;
		}
		public int getM_esquive() {
			return m_esquive;
		}
		public int getM_defense() {
			return m_defense;
		}
		//Setters
		public void setM_nom(String m_nom) {
			this.m_nom = m_nom;
		}
		public void setM_vie(int m_vie) {
			this.m_vie = m_vie;
		}
		public void setM_attaque(int m_attaque) {
			this.m_attaque = m_attaque;
		}
		public void setM_esquive(int m_esquive) {
			this.m_esquive = m_esquive;
		}
		public void setM_defense(int m_defense) {
			this.m_defense = m_defense;
		}

		
		
		
		
}
