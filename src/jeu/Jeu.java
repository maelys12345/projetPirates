package jeu;

import java.util.Scanner;

public class Jeu {
	private Pion[] pions=new Pion[5];
	private Joueur[] joueurs=new Joueur[2];
	private int nbJoueur=0;
	private PlateauJeu plateau;
	private IAffichage affichage;
	private Scanner entreeClavier=new Scanner(System.in);
	
	public Jeu(PlateauJeu plateau) {
		affichage=new Affichage();
		this.plateau=plateau;
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
			System.out.println("Joueur créé bravo");
		}
	}
	public Joueur getJoueur(int indice) {
		if(indice>0 && indice<joueurs.length) {
			return joueurs[indice];
		}
		return null;
	}
	public int donnerCaseActuelle(Joueur joueur) {
		affichage.afficherCaseActuelle(joueur);
		return joueur.getPion().getCaseActuelle();
	}
	public void afficherContexte(Joueur j1,Joueur j2) {
		affichage.afficherContexte(j1, j2);
	}
	public Pion choisirPion(Pion[] pions) {
		boolean choixOK=false;
		int choix;
		do {
			affichage.afficherPirates(pions);
			choix=entreeClavier.nextInt();
			if(choix<1 || choix>pions.length+1 || pions[choix-1].getJoueur()!=null) {
				affichage.afficherMauvaisChoix();
			}
			else {
				choixOK=true;
			}
		}while(!choixOK);
		Pion pirate=pions[choix-1];
		return pirate;
	}
	public String choisirNom(int n) {
		affichage.demanderNom(n);
		String nom=entreeClavier.nextLine();
		return nom;
	}
	public boolean joueurATerre() {
		return joueurs[0].getPion().estATerre() || joueurs[1].getPion().estATerre();
	}
	public boolean jeuFini() {
		return joueurs[0].getPion().getCaseActuelle()==plateau.nbCases-1 || joueurs[1].getPion().getCaseActuelle()==plateau.nbCases-1;
	}
	public void deroulerJeu() {
		for(int i=0;i<2;i++) {
			String nom=choisirNom(i+1);
			Pion pirate=choisirPion(pions);
			entreeClavier.nextLine();
			creerJoueur(nom,pirate);
		}
		afficherContexte(joueurs[0],joueurs[1]);
		int indiceJoueurActuel=0;
		do {
			Joueur joueurActuel=joueurs[indiceJoueurActuel];
			int caseActuelle=donnerCaseActuelle(joueurActuel);
			joueurActuel.lancerDes(affichage,plateau);
			joueurActuel.deplacerPion(affichage,plateau.getResultatDe(0)+plateau.getResultatDe(1),plateau);
			caseActuelle=donnerCaseActuelle(joueurActuel);
			if(plateau.getTabCaseSpe()[caseActuelle]!=null) {
				plateau.getTabCaseSpe()[caseActuelle].appliquerEffet(affichage,joueurs[0],joueurs[1],plateau);
				}
			indiceJoueurActuel=(indiceJoueurActuel+1)%2;
			}while(!joueurATerre() && !jeuFini());
		System.out.println("JEU FINI YIPPEE");
	}

}
