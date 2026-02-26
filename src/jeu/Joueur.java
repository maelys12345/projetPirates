package jeu;

public class Joueur {
	private String nom;
	private Pion pion;
	
	public Joueur(String nom,Pion pion) {
		this.nom=nom;
		this.pion=pion;
	}
	public String getNom() {
		return nom;
	}
	public Pion getPion() {
		return pion;
	}
	public void deplacerPion(int val) {
		int nouvelleCase=pion.getCaseActuelle()+val;
		if(nouvelleCase>PlateauJeu.nbCases) {
			nouvelleCase=PlateauJeu.nbCases-(nouvelleCase-PlateauJeu.nbCases);
		}
		pion.setCase(nouvelleCase);
	}
	public void lancerDes(PlateauJeu plateau) {
		plateau.getDe(0).lancer();
		plateau.setResultatDes(0,plateau.getDe(0).getResultat());
		plateau.getDe(1).lancer();
		plateau.setResultatDes(1,plateau.getDe(1).getResultat());
	}
	public void lancerUnDe(PlateauJeu plateau) {
		plateau.getDe(0).lancer();
		plateau.setResultatDes(0,plateau.getDe(0).getResultat());
		plateau.setResultatDes(1,0);
	}

}
