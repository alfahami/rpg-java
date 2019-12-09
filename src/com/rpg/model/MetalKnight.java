package com.rpg.model;

public class MetalKnight extends Monstre{

		//Attributs
		private String m_sensibilite;
		private int fm_sensibilite;
		private String type_armure;
		private int solidite_armure;
		
		//Constructeurs
		public MetalKnight(Position p) {
			super("Metal Knight", 100, 99, 90, 110);
			m_sensibilite = "Est sensible au chaud";
			fm_sensibilite = 35;
			type_armure = "Armax arsenal(Predator)";
			solidite_armure = 20;
			m_position = p;
		}
		//Getters
		public String getM_sensibilite() {
			return m_sensibilite;
		}
		public int getFm_sensibilite() {
			return fm_sensibilite;
		}
		public String getType_armure() {
			return type_armure;
		}
		public int getSolidite_armure() {
			return solidite_armure;
		}
		//Setters
		public void setM_sensibilite(String m_sensibilite) {
			this.m_sensibilite = m_sensibilite;
		}
		public void setFm_sensibilite(int fm_sensibilite) {
			this.fm_sensibilite = fm_sensibilite;
		}
		public void setType_armure(String type_armure) {
			this.type_armure = type_armure;
		}
		public void setSolidite_armure(int solidite_armure) {
			this.solidite_armure = solidite_armure;
		}
		public String toString() {
			/*return "MetalKnight [m_sensibilite=" + m_sensibilite + ", fm_sensibilite=" + fm_sensibilite
					+ ", type_armure=" + type_armure + ", solidite_armure=" + solidite_armure + "]";
			**/
			return "MetalKnight";
		}
}
