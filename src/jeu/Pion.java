package jeu;

public class Pion {
	private int caseActuelle=0;
	private int nbVie=5;
	private Pirate pirate;
	private Joueur joueur;
	
	public Pion(Pirate pirate) {
		this.pirate=pirate;
	}
	public int getCaseActuelle() {
		return caseActuelle;
	}
	public void setCase(int newCase) {
		caseActuelle=newCase;
	}
	public int getVie() {
		return nbVie;
	}
	public Pirate getPirate() {
		return pirate;
	}
	public void setJoueur(Joueur joueur) {
		this.joueur=joueur;
	}
	public Joueur getJoueur() {
		return joueur;
	}

}
