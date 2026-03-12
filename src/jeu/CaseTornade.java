package jeu;

public class CaseTornade extends CaseSpeciale {
	@Override
	public void appliquerEffet(IAffichage affichage,Joueur j1, Joueur j2,PlateauJeu plateau) {
		affichage.decrireCaseTornade();
		int case1=j1.getPion().getCaseActuelle();
		int case2=j2.getPion().getCaseActuelle();
		j1.allerANouvelleCase(affichage,case2);
		j2.allerANouvelleCase(affichage,case1);
	}

}
