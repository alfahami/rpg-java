package com.rpg.model;

public class PouvSam extends Arme {

		//Attributs
		private int bombeFroid;
		private int nbBombeFroid;
		public PouvSam(Position position) {
			super("Objets du samurai", "Epées", 95);
			this.bombeFroid = 80;
			this.nbBombeFroid = 3;
		}
		//Getters
		public int getBombeFroid() {
			return bombeFroid;
		}
		public int getNbBombeFroid() {
			return nbBombeFroid;
		}
		//Setters
		public void setBombeFroid(int bombeFroid) {
			this.bombeFroid = bombeFroid;
		}
		public void setNbBombeFroid(int nbBombeFroid) {
			this.nbBombeFroid = nbBombeFroid;
		}
		//Méthodes
		public String toString() {
			//return "PouvSam [bombeFroid=" + bombeFroid + ", nbBombeFroid=" + nbBombeFroid + "]";
			return "PouvSam";
		}

		
}
