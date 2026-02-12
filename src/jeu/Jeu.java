package jeu;

public class Jeu {
	private Pion[] pions=new Pion[5];
	private Joueur[] joueurs=new Joueur[2];
	private int nbJoueur=0;
	private PlateauJeu plateau;
	
	public Jeu() {
		pions[0]=new Pion(Pirate.CAPITAINE_CROCHET);
		pions[1]=new Pion(Pirate.LUFFY);
		pions[2]=new Pion(Pirate.JACK_SPARROW);
		pions[3]=new Pion(Pirate.FLAMEHEART);
		pions[4]=new Pion(Pirate.VICTOR_MACBERNIK);
	}
	public void creerJoueur(String nom,Pion pion) {
		if(nbJoueur<joueurs.length) {
			joueurs[nbJoueur]=new Joueur(nom,pion);
			nbJoueur++;
		}
	}

}
