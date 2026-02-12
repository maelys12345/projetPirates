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

}
