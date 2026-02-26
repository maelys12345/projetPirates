package jeu;

public class caseTornade extends CaseSpeciale {

	@Override
	public void appliquerEffet(Joueur j1, Joueur j2,PlateauJeu plateau) {
		int case1=j1.getPion().getCaseActuelle();
		int case2=j2.getPion().getCaseActuelle();
		j1.deplacerPion(case2);
		j2.deplacerPion(case1);
	}

}
