package com.rpg.model;

public class DarkSaber extends Monstre{

		//Attributs
		private String type_costume;
		private String nom_epee;
	    private int puiss_epee;
		
	    //Constructeurs
		public DarkSaber(Position p){
			super("DarkSaber", 95, 45, 20, 50);
			nom_epee = "Sabre laser double tranchant";
			type_costume ="Dark Vador";
			puiss_epee = 20;
			m_position = p;
			}
		//Getters
		public String getType_costume() {
			return type_costume;
		}

		public String getNom_epee() {
			return nom_epee;
		}

		public int getPuiss_epee() {
			return puiss_epee;
		}
		//Setters
		public void setType_costume(String type_costume) {
			this.type_costume = type_costume;
		}

		public void setNom_epee(String nom_epee) {
			this.nom_epee = nom_epee;
		}

		public void setPuiss_epee(int puiss_epee) {
			this.puiss_epee = puiss_epee;
		}
		public String toString() {
			//return "DarkSaber[ " + m_vie + " ]";
			return "DarkSaber";
		}
}
