package com.rpg.model;

public class Orc extends Monstre{
	
		//Attributs
		private String n_epee;
		private int force_epee;
		private String n_marteau;
		private int force_marteau;

		//Constructeur
		public Orc(Position p){
			super("Orc", 80, 40, 20, 20);
			n_epee = "Ragnarok";
			force_epee = 15;
			n_marteau = "Orgrim Doomhammer";
			force_marteau = 30;
			m_position = p;
		}
		//Getters
		public String getN_epee() {
			return n_epee;
		}
		public int getForce_epee() {
			return force_epee;
		}
		public String getN_marteau() {
			return n_marteau;
		}
		public int getForce_marteau() {
			return force_marteau;
		}
		//Setters
		public void setN_epee(String n_epee) {
			this.n_epee = n_epee;
		}
		public void setForce_epee(int force_epee) {
			this.force_epee = force_epee;
		}
		public void setN_marteau(String n_marteau) {
			this.n_marteau = n_marteau;
		}
		public void setForce_marteau(int force_marteau) {
			this.force_marteau = force_marteau;
		}
		//Méthoddes
		public String toString() {
			/*return "Orc [n_epee=" + n_epee + ", force_epee=" + force_epee + ", n_marteau=" + n_marteau
					+ ", force_marteau=" + force_marteau + "]";
			**/
			return "Orc";
		}
		

}
