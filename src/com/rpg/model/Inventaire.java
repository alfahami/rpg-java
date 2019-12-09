package com.rpg.model;

import java.util.ArrayList;

public class Inventaire {
	

	//Attributs
	public ArrayList<Objet>   contenu;
	public int placeRestantes;
	
	//Constructeurs
	public Inventaire(){
		super();
	}
	
	public Inventaire(ArrayList<Objet> contenu, int placeRestantes) {
		this.contenu = contenu;
		this.placeRestantes = placeRestantes;
	}
	
	//Getters
	public ArrayList<Objet> getContenu() {
		return contenu;
	}

	public int getPlaceRestantes() {
		return placeRestantes;
	}
	//Setters
	public void setContenu(ArrayList<Objet> contenu) {
		this.contenu = contenu;
	}

	public void setPlaceRestantes(int placeRestantes) {
		this.placeRestantes = placeRestantes;
	}
	
	

}
