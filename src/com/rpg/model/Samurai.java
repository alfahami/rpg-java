package com.rpg.model;

public class Samurai extends Personnage{
	
		//Attributs
		private String type_armure;
		
		private int nb_epee;
		private int impact_epee;
		private int solidite_armure;
		private String[] noms_epees;
		
		public Samurai() {
			super("Samuraï", 100, 90, 35, 30);
			this.type_armure = "o-yoroi";
			setNoms_epees(new String[] {"Anaklusmos", "Kusanagi", "Wado ichimoji"});
			this.nb_epee = 3;
			this.impact_epee = 15;
			this.solidite_armure = 10;
		}
		//Getters
		public String getType_armure() {
			return type_armure;
		}
		public String[] getNoms_epees() {
			return noms_epees;
		}
		public int getNb_epee() {
			return nb_epee;
		}
		public int getImpact_epee() {
			return impact_epee;
		}
		public int getSolidite_armure() {
			return solidite_armure;
		}
		//Setters
		public void setType_armure(String t_arm) {
			this.type_armure = t_arm;
		}
		public void setNoms_epees(String[] n_epees) {
			this.noms_epees = n_epees;
		}
		public void setNb_epee(int nb_epee) {
			this.nb_epee = nb_epee;
		}
		public void setImpact_epee(int impact_epee) {
			this.impact_epee = impact_epee;
		}
		public void setSolidite_armure(int solidite_armure) {
			this.solidite_armure = solidite_armure;
		}
		//Méthodes
		public String toString() {
			/*return "Samurai [type_armure=" + type_armure + ", type_epee=" + type_epee + ", noms_epees="
					+ Arrays.toString(noms_epees) + ", nb_epee=" + nb_epee + ", impact_epee=" + impact_epee
					+ ", solidite_armure=" + solidite_armure + "]"; 
			*/
			return "Samurai";
		}
}
