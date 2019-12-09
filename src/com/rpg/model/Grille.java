package com.rpg.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.table.TableModel;

public class Grille {
	//Attributs
	public static final int NBR_ROWS = 20;
	public static final int NBR_COLS = 20;
	private static Random random = new Random(System.currentTimeMillis());
	private Object [][] grille;
	private List<Monstre> mons = new ArrayList<Monstre>();
	private List<Objet> obj = new ArrayList<Objet>();
	public TableModel model;
	//Constructeurs
	public Grille(){
		grille = new Object[NBR_ROWS][NBR_COLS];
		for (int i = 0; i < NBR_ROWS; i++) {
			for (int j = 0; j < NBR_COLS; j++) {
				grille[i][j] = null;
			}
		}
		//On place 3 monstres et 3 objets aléatoirement
		int l = random.nextInt(NBR_ROWS);
		int c = random.nextInt(NBR_COLS);
		grille[l][c] = new PouvSam(new Position(l, c));
		obj.add((PouvSam) grille[l][c]);
		while (grille[l][c] != null) {
			c = random.nextInt(NBR_COLS);
			l = random.nextInt(NBR_ROWS);
		}
		grille[l][c] = new PouvOP(new Position(l, c));
		obj.add((PouvOP) grille[l][c]);
		while (grille[l][c] != null) {
			c = random.nextInt(NBR_COLS);
			l = random.nextInt(NBR_ROWS);
		}
		grille[l][c] = new PouvKameha(new Position(l, c));
		obj.add((PouvKameha) grille[l][c]);
		while (grille[l][c] != null) {
			c = random.nextInt(NBR_COLS);
			l = random.nextInt(NBR_ROWS);
		}
		grille[l][c] = new DarkSaber(new Position(l, c));
		mons.add((DarkSaber) grille[l][c]);
		while (grille[l][c] != null) {
			c = random.nextInt(NBR_COLS);
			l = random.nextInt(NBR_ROWS);
		}
		grille[l][c] = new Orc(new Position(l, c));
		mons.add((Orc) grille[l][c]);
		while (grille[l][c] != null) {
			c = random.nextInt(NBR_COLS);
			l = random.nextInt(NBR_ROWS);
		}
		grille[l][c] = new MetalKnight(new Position(l, c));
		mons.add((MetalKnight) grille[l][c]);
	}
	//Accesseurs
	public static int getNbrRows() {
		return NBR_ROWS;
	}
	public static int getNbrCols() {
		return NBR_COLS;
	}
	public static Random getRandom() {
		return random;
	}
	public Object[][] getGrille() {
		return grille;
	}
	
	public List<Monstre> getMons() {
		return mons;
	}
	public List<Objet> getObj() {
		return obj;
	}
	//Setters
	public static void setRandom(Random random) {
		Grille.random = random;
	}
	public void setGrille(Object[][] grille) {
		this.grille = grille;
	}
	
	public void setMons(ArrayList<Monstre> mons) {
		this.mons = mons;
	}
	public void setObj(ArrayList<Objet> obj) {
		this.obj = obj;
	}
	//Pour les cases
	public Object getCase(int l, int c){
		return grille[l][c];
	}
	public void setCase(int l, int c, Object element){
		this.grille[l][c] = element;
	}
	
	//Méthodes
	public void positionnerPersonnage(int l, int c, Personnage p) {
		if (l > 0 && l < NBR_ROWS || c > 0 && c < NBR_COLS) {
			if(this.getCase(l, c) == null) {
				this.setCase(l, c, p);
			}
		}
	}
	//Déplacements
	public void mettrePersonnage(Personnage p) {
		int row = p.getP_position().n_row;
		int col = p.getP_position().n_col;
		this.positionnerPersonnage(row, col, p);
		model.setValueAt(p, row, col);
	}
	
	public void enleverPersonnage(Personnage p) {
		int row = p.getP_position().n_row;
		int col = p.getP_position().n_col;
		this.setCase(row, col, null);
		model.setValueAt(null, p.getP_position().n_row, p.getP_position().n_col);
	}
	public void enleverObjet(Objet obj) {
		int row = obj.getO_position().n_row;
		int col = obj.getO_position().n_col;
		this.setCase(row, col, null);
		model.setValueAt(null, obj.getO_position().n_row, obj.getO_position().n_col);
		
	}
}