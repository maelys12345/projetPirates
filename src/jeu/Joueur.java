package jeu;

import java.util.Scanner;

public class Joueur {
	private String nom;
	private Pion pion;
	private Scanner entreeClavier=new Scanner(System.in);
	
	public Joueur(String nom,Pion pion) {
		this.nom=nom;
		this.pion=pion;
		pion.setJoueur(this);
	}
	public String getNom() {
		return nom;
	}
	public Pion getPion() {
		return pion;
	}
	public void deplacerPion(IAffichage affichage,int val,PlateauJeu plateau) {
		int nouvelleCase=pion.getCaseActuelle()+val;
		if(nouvelleCase>plateau.nbCases) {
			nouvelleCase=plateau.nbCases-(nouvelleCase-plateau.nbCases);
			affichage.afficherAvancerJusqua30(this);
			affichage.afficherReculerCase(this);
		}
		pion.setCase(nouvelleCase);
		affichage.afficherAvancerCase(this);
	}
	public void allerANouvelleCase(IAffichage affichage,int nouvelleCase) {
		pion.setCase(nouvelleCase);
		affichage.afficherAllerCase(this);
	}
	public void lancerDes(IAffichage affichage,PlateauJeu plateau) {
		affichage.afficherLancerDes(this);
		entreeClavier.next();
		plateau.getDe(0).lancer();
		plateau.setResultatDes(0,plateau.getDe(0).getResultat());
		plateau.getDe(1).lancer();
		plateau.setResultatDes(1,plateau.getDe(1).getResultat());
		affichage.afficherResultatDes(plateau);
	}
	public void lancerUnDe(IAffichage affichage,PlateauJeu plateau) {
		affichage.afficherLancerUnDe(this);
		plateau.getDe(0).lancer();
		plateau.setResultatDes(0,plateau.getDe(0).getResultat());
		plateau.setResultatDes(1,0);
		affichage.afficherResultatUnDe(plateau);
	}
	public void fermerScanner() {
		entreeClavier.close();
	}

}
