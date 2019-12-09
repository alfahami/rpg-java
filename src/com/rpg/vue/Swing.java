package com.rpg.vue;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.rpg.controleur.Jeu;
import com.rpg.model.Grille;


public class Swing extends JFrame implements Visuel {
	private static final long serialVersionUID = 1L;
	
	public static Grille grille = null;
	public Object[] titre;
	static Object[][] dataGrille;
	public static Jeu controleur = null;
	private JPanel container = new JPanel();
	JLabel label = new JLabel();	
	
	public Swing() {
		instancierPersonnage();
		afficherGrille();
	}
	public void instancierPersonnage() {
		controleur = new Jeu("samurai", 15, 12);
	}
	public void afficherGrille() {
		this.setTitle("MATSUO - THE EXPLORATION");
		this.setSize(700, 700);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		grille = Jeu.grille;
		dataGrille = grille.getGrille();
		titre = new Object[Grille.getNbrCols()];
		for(int i = 0; i < Grille.getNbrCols(); i++){
			titre[i]="Jeu";
		}
        DefaultTableModel model = new DefaultTableModel(dataGrille,titre){
			private static final long serialVersionUID = 1L;
            public boolean isCellEditable(int row, int col) {
                
                return false;
            }
        };
		grille.model = model;
		JTable tabGrille = new JTable(model);
		tabGrille.addKeyListener(controleur);
		tabGrille.setActionMap(null);
		this.getContentPane().add(new JScrollPane(tabGrille));
		tabGrille.setCellSelectionEnabled(isOpaque());;
		container.add(label, BorderLayout.CENTER);
		tabGrille.setTableHeader(null);
	}
	public static void main(String[] args){
		Swing fen = new Swing();
		fen.setVisible(true);
	}

}
