package com.rpg.model;

public class Goku extends Personnage{
	
		//Attributs
		private String type_wave;
		private int nbr_wave;
		private int impact_wave;
		
		public Goku() {
			super("Goku", 100, 80, 30, 90);
			this.type_wave = "Vague de lumière";
			this.nbr_wave = 5;
			this.impact_wave = 20;
		}
		//Getters
		public String getType_wave() {
			return type_wave;
		}
		public int getNbr_wave() {
			return nbr_wave;
		}
		public int getImpact_wave() {
			return impact_wave;
		}
		//Setters
		public void setType_wave(String type_wave) {
			this.type_wave = type_wave;
		}
		public void setNbr_wave(int nbr_wave) {
			this.nbr_wave = nbr_wave;
		}
		public void setImpact_wave(int impact_wave) {
			this.impact_wave = impact_wave;
		}
		//Méthodes
		@Override
		public String toString() {
			//return "Goku [type_wave=" + type_wave + ", nbr_wave=" + nbr_wave + ", impact_wave=" + impact_wave + "]";
			return "Goku";
		}
		
		
		
}
