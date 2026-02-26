package jeu;

public class Affichage implements IAffichage {

	@Override
	public void afficherContexte(Joueur j1,Joueur j2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void demanderNom() {
		System.out.println("Entrez votre nom :");
	}

	@Override
	public void afficherPirates(Pion[] pions) {
		for(int i=0;i<5;i++) {
			if(pions[i].getJoueur()==null) {
				System.out.println((i+1) + " : Le pirate "+pions[i].getPirate().getNom()+", de couleur "+pions[i].getPirate().getCouleur());
			}
		}
	}

	@Override
	public void decrireCase(CaseSpeciale caseSpe) {
		// TODO Auto-generated method stub

	}

}
