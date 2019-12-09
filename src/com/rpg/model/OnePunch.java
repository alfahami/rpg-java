package com.rpg.model;

public class OnePunch extends Personnage{
	
		//Attributs
		private String gantTueur;
		private int force_gant;
		private int nb_gant;
		//Constructeurs
		public OnePunch() {
			super("Saitama", 100, 95, 70, 65);
			this.gantTueur = "Gant gordocks";
			this.force_gant = 15;
			this.nb_gant = 2;
		}
		//Getters
		public String getGantTueur() {
			return gantTueur;
		}

		public int getForce_gant() {
			return force_gant;
		}

		public int getNb_gant() {
			return nb_gant;
		}
		//Setters
		public void setGantTueur(String g) {
			this.gantTueur = g;
		}
		public void setForce_gant(int f) {
			this.force_gant = f;
		}
		public void setNb_gant(int n) {
			this.nb_gant = n;
		}
		//Méthodes
		public String toString() {
			//return "OnePunch [gantTueur=" + gantTueur + ", force_gant=" + force_gant + ", nb_gant=" + nb_gant + "]";
			return "Saitama";
		}
		
		
		
		

}
