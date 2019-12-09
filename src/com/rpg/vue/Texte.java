package com.rpg.vue;
import com.rpg.controleur.Jeu;
import com.rpg.model.*;

public class Texte implements Visuel{
	
	public static  Grille grille = null;
	public static Jeu controleur = null;
	
	public Texte() {
		
		instancierPersonnage();
		afficherGrille();
		
	}
	public void instancierPersonnage() {
		controleur = new Jeu("samurai", 1, 2);
	}
	public  void afficherGrille() {
		grille = Jeu.grille;
		for(int i = 0; i < Grille.getNbrCols(); i++) {
				System.out.println();
			for(int j = 0; j < Grille.NBR_COLS; j++) {
				System.out.print(" \t "+grille.getCase(i, j));
			}
			System.out.println("\t");
		}
	}
	public static void main(String[] args){
		
		new Texte();
			
	}
}
	