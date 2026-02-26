package jeu;

public interface IAffichage {
	public void afficherContexte(Joueur j1,Joueur j2);
	public void demanderNom();
	public void afficherPirates(Pion[] pions);
	public void decrireCase(CaseSpeciale caseSpe);

}
