package com.rpg.model;

public class Hagakure extends Monstre {
	
		//Attributs
		private String nom_armure;
		private int force_armure;
		private String h_sensibilite;
		private int fh_sensibilte;

		//Constructeurs
		public Hagakure(){
			super("Hagakure", 100, 85, 60, 30);
			nom_armure = "Armure feu infernal";
			force_armure = 99;
			h_sensibilite = "Sensible au froid";
			fh_sensibilte = 10;
		}
		//Getters
		public String getNom_armure() {
			return nom_armure;
		}
		public int getForce_armure() {
			return force_armure;
		}
		public String getH_sensibilite() {
			return h_sensibilite;
		}
		public int getFh_sensibilte() {
			return fh_sensibilte;
		}
		//Setters
		public void setNom_armure(String nom_armure) {
			this.nom_armure = nom_armure;
		}
		public void setForce_armure(int force_armure) {
			this.force_armure = force_armure;
		}
		public void setH_sensibilite(String h_sensibilite) {
			this.h_sensibilite = h_sensibilite;
		}
		public void setFh_sensibilte(int fh_sensibilte) {
			this.fh_sensibilte = fh_sensibilte;
		}
		//Méthodes
		public String toString() {
			/*return "Hagakure [nom_armure=" + nom_armure + ", force_armure=" + force_armure + ", h_sensibilite="
					+ h_sensibilite + ", fh_sensibilte=" + fh_sensibilte + "]";
				**/
			return "Hagakure";
		}
}
