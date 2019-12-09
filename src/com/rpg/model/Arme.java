package com.rpg.model;

public abstract class Arme extends Objet{

		
		//Attributs
		protected String a_nom;
		protected String type_arme;
		protected int force_arme;
		
		//Constructeurs
		public Arme(String a_nom, String type_arme, int force_arme) {
			super("Armes", "Armes devastatrices");
			this.a_nom = a_nom;
			this.type_arme = type_arme;
			this.force_arme = force_arme;
		}

		//Getters
		public String getA_nom() {
			return a_nom;
		}
		public String getType_arme() {
			return type_arme;
		}

		public int getForce_arme() {
			return force_arme;
		}

		public void setA_nom(String a) {
			this.a_nom = a;
		}

		public void setType_arme(String t) {
			this.type_arme = t;
		}

		public void setForce_arme(int f) {
			this.force_arme = f;
		}
		
		
		
}
