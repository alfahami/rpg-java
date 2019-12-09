package com.rpg.model;

public class PouvKameha extends Arme{

		//Attributs
		private int bombeFeu;
		private int nbBombeFeu;
		
		public PouvKameha(Position p) {
			super("Kaméha Méha",  "Surnaturel", 500);
			this.bombeFeu = 95;
			this.nbBombeFeu = 5;
			this.O_position = p;
		}
		//Gettters
		public int getBombeFeu() {
			return bombeFeu;
		}

		public int getNbBombeFeu() {
			return nbBombeFeu;
		}

		//Setters
		public void setBombeFeu(int bombeFeu) {
			this.bombeFeu = bombeFeu;
		}

		public void setNbBombeFeu(int nbBombeFeu) {
			this.nbBombeFeu = nbBombeFeu;
		}
		public String toString() {
			//return "PouvKameha [bombeFeu=" + bombeFeu + ", nbBombeFeu=" + nbBombeFeu + "]";
			return "PouvKameha";
		}		


}
