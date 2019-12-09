package com.rpg.controleur;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.rpg.model.*;
public class Jeu implements KeyListener {

	public static Grille grille = new Grille();
	private static Personnage pers;
	
	public Jeu(String nomPersonnage, int ligne, int colone){
		creerPersonnage(nomPersonnage);
		choisirCoordonees(ligne, colone);
		System.out.println("personnage :: "+pers);
		System.out.println("position ("+pers.getP_position().n_row+", "+pers.getP_position().n_col+")");
	}
	public static Personnage getPers() {
		return pers;
	}
	
	public static void setPers(Personnage pers) {
		Jeu.pers = pers;
	}
	public static void creerPersonnage(String nom) {
		if(nom.equalsIgnoreCase("Guerrier")) {
			pers = new Guerrier();
		}
		else if(nom.equalsIgnoreCase("Samurai")) {
			pers = new Samurai();
		}
		else if(nom.equalsIgnoreCase("Goku")) {
			pers = new Goku();
		}
		else if(nom.equalsIgnoreCase("Saitanma")) {
			pers = new OnePunch();
		}
	}

	public static void choisirCoordonees(int l, int c) {
			verifierCoordonnees(l, c);
			grille.positionnerPersonnage(l, c, pers);
		}
		
	public static void verifierCoordonnees(int l, int c) {
		if(l > 0 && l < Grille.NBR_ROWS || c > 0 && c < Grille.NBR_COLS) {
			Position position = new Position(l, c);
			pers.setP_position(position);
		}
		else {
			int i = 0;
			while(i <= 3){
				choisirCoordonees(l, c);
			}
			i++;
		}
	}
	//Déplacementss
	public static void deplacerPersonnage(Direction direction){
		int row = pers.getP_position().n_row;
		int col = pers.getP_position().n_col;
		grille.enleverPersonnage(pers);
		if(verifierDirection(direction) == 1 && col > 0){
			col--;
		}
		else if(verifierDirection(direction) == 2 && col < Grille.getNbrCols()-1){
			col++;
		}
		else if(verifierDirection(direction) == 3 && row < Grille.NBR_ROWS-1){
			row++;
		}
		else if(verifierDirection(direction) == 4 && row > 0){
			row--;
		}
		pers.setP_position(new Position(row, col));
		grille.mettrePersonnage(pers);
		System.out.println("deplacement...vers la direction "+direction.toString());
		System.out.println("position ("+pers.getP_position().n_row+", "+pers.getP_position().n_col+")");
	}
	public static int verifierDirection(Direction direction) {
		if(direction == Direction.Left ){
			return 1;
		}
		else if(direction == Direction.Right){
			return 2;
		}
		else if(direction == Direction.South){
			return 3;
		}
		else if(direction == Direction.North){
			return 4;
		}
		else {
			return 0;
		}
	}
	public void keyPressed(KeyEvent touche) {
		if(touche.getKeyCode() == KeyEvent.VK_LEFT){
			deplacerPersonnage(Direction.Left);
		}
		else if(touche.getKeyCode() == KeyEvent.VK_RIGHT){
			deplacerPersonnage(Direction.Right);
		}
		else if(touche.getKeyCode() == KeyEvent.VK_DOWN){
			deplacerPersonnage(Direction.South);
		}
		else if(touche.getKeyCode() == KeyEvent.VK_UP){
			deplacerPersonnage(Direction.North);
		}
	}
	
	public void keyReleased(KeyEvent arg0) { }
	public void keyTyped(KeyEvent arg0) { }
	
}
