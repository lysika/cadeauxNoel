package fr.remyfoussier.tirage_cadeaux.shared;

import java.io.Serializable;

public class Couple implements Serializable{


	
	public Couple(String nom1, String nom2) {
		super();
		this.nom1 = nom1;
		this.nom2 = nom2;
	}

		public Couple() {
			super();
		}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nom1="";
	private String nom2="";
	public String getNom1() {
		return nom1;
	}
	public void setNom1(String nom1) {
		this.nom1 = nom1;
	}
	public String getNom2() {
		return nom2;
	}
	public void setNom2(String nom2) {
		this.nom2 = nom2;
	}
	
		
}
