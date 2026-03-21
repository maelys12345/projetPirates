package jeu;


public class Jeu {
	private Pion[] pions=new Pion[5];
	private Joueur[] joueurs=new Joueur[2];
	private int nbJoueur=0;
	private PlateauJeu plateau=new PlateauJeu();
	private IAffichage affichage;

	
	public Jeu(IAffichage affichage) {
		this.affichage=affichage;
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
	public void afficherContexte(Joueur j1,Joueur j2) {
		affichage.afficherContexte(j1, j2);
	}
	private Pion choisirPion(Pion[] pions) {
		boolean choixOK=false;
		int choix;
		do {
			affichage.afficherPirates(pions);
			choix=Integer.parseInt(affichage.entrerString());
			if(choix<1 || choix>pions.length+1 || pions[choix-1].getJoueur()!=null) {
				affichage.afficherMauvaisChoix();
			}
			else {
				choixOK=true;
			}
		}while(!choixOK);
		return pions[choix-1];
	}
	private String choisirNom(int n) {
		affichage.demanderNom(n);
		return affichage.entrerString();
	}
	private boolean joueurATerre() {
		return joueurs[0].getPion().estATerre() || joueurs[1].getPion().estATerre();
	}
	private boolean jeuFini() {
		return joueurs[0].getPion().getCaseActuelle()==plateau.nbCases-1 || joueurs[1].getPion().getCaseActuelle()==plateau.nbCases-1;
	}
	private void trouverGagnant(boolean joueurKO) {
		if(joueurKO) {
			if(joueurs[0].getPion().estATerre()) {
				affichage.afficherJoueurMort(joueurs[0]);
				affichage.afficherFinJeu(joueurs[1]);
			}
			else {
				affichage.afficherJoueurMort(joueurs[1]);
				affichage.afficherFinJeu(joueurs[0]);
			}
		}
		else{
			if(donnerCaseActuelle(joueurs[0])==plateau.nbCases-1) {
				affichage.afficherPirateArrive(joueurs[0]);
				affichage.afficherFinJeu(joueurs[0]);
			}
			else {
				affichage.afficherPirateArrive(joueurs[1]);
				affichage.afficherFinJeu(joueurs[1]);
			}
		}
	}
	
	public void deroulerJeu() {
		for(int i=0;i<2;i++) {
			String nom=choisirNom(i+1);
			Pion pirate=choisirPion(pions);
			//affichage.entrerNext();
			creerJoueur(nom,pirate);
			affichage.afficherSeparation();
		}
		afficherContexte(joueurs[0],joueurs[1]);
		affichage.afficherSeparation();
		int indiceJoueurActuel=0;
		do {
			Joueur joueurActuel=joueurs[indiceJoueurActuel];
			affichage.afficherTourJoueur(joueurActuel);
			int caseActuelle=donnerCaseActuelle(joueurActuel);
			joueurActuel.lancerDes(affichage,plateau);
			joueurActuel.deplacerPion(affichage,plateau.getResultatDe(0)+plateau.getResultatDe(1),plateau);
			caseActuelle=donnerCaseActuelle(joueurActuel);
			if(plateau.getTabCaseSpe()[caseActuelle]!=null) {
				plateau.getTabCaseSpe()[caseActuelle].appliquerEffet(affichage,joueurs[0],joueurs[1],plateau);
				}
			indiceJoueurActuel=(indiceJoueurActuel+1)%2;
			affichage.afficherSeparation();
			}while(!joueurATerre() && !jeuFini());
		trouverGagnant(joueurATerre());
		affichage.entrerClose();
	}

}
