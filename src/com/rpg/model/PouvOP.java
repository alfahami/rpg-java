package com.rpg.model;

public class PouvOP extends Arme{

		//Attributs
		private int coup;
		private int nbrCoup;
		
		public PouvOP(Position p) {
			super("Pouvoir de coup",  "Coup super-mortem", 100);
			this.coup = 90;
			this.nbrCoup = 10;
			this.O_position = p;
		}
		//Getters
		public int getCoup() {
			return coup;
		}

		public int getNbrCoup() {
			return nbrCoup;
		}
		//Setters
		public void setCoup(int coup) {
			this.coup = coup;
		}

		public void setNbrCoup(int nbrCoup) {
			this.nbrCoup = nbrCoup;
		}
		public String toString() {
			//return "PouvOP [coup=" + coup + ", nbrCoup=" + nbrCoup + "]";
			return "PouvOP";
		}

}
