package jeu;

public class Jeu {
	private Pion[] pions=new Pion[5];
	private Joueur[] joueurs=new Joueur[2];
	private int nbJoueur=0;
	private PlateauJeu plateau;
	private IAffichage affichage;
	
	public Jeu() {
		affichage=new Affichage();
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
	public Joueur getJoueur(int indice) {
		if(indice>0 && indice<joueurs.length) {
			return joueurs[indice];
		}
		return null;
	}
	public int donnerCaseActuelle(Joueur joueur) {
		return joueur.getPion().getCaseActuelle();
	}

}
