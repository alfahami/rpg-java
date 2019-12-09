package com.rpg.model;

public abstract class Objet {
	
		//Attributs
		protected String nom_obj;
		protected String description;
		protected Position O_position;
		
		//Constructeurs
		public Objet(String nom, String desc) {
			this.nom_obj = nom;
			this.description = desc;
			//this.position = pos;
		}


		//Getters
		public String getNom_obj() {
			return nom_obj;
		}

		public String getDescription() {
			return description;
		}

		public Position getO_position() {
			return O_position;
		}

		public void setNom_obj(String n) {
			this.nom_obj = n;
		}

		public void setDescription(String d) {
			this.description = d;
		}

		public void setPosition(Position p) {
			this.O_position = p;
		}
		
		
}
