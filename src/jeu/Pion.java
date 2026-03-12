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
	public void changerVie(int n) {
		nbVie+=n;
		if(nbVie>5) {
			nbVie=5;
		}
		else if(nbVie<0) {
			nbVie=0;
		}
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
	public boolean estATerre() {
		return nbVie==0;
	}

}
