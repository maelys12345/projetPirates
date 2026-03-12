package jeu;

public interface IAffichage {
	public void afficherMauvaisChoix();
	public void afficherContexte(Joueur j1,Joueur j2);
	public void demanderNom(int n);
	public void afficherPirates(Pion[] pions);
	public void afficherLancerDes(Joueur joueur);
	public void afficherLancerUnDe(Joueur joueur);
	public void afficherResultatDes(PlateauJeu plateau);
	public void afficherResultatUnDe(PlateauJeu plateau);
	public void afficherCaseActuelle(Joueur joueur);
	public void decrireCaseDuel();
	public void decrireCaseTornade();
	public void afficherAvancerJusqua30(Joueur joueur);
	public void afficherReculerCase(Joueur joueur);
	public void afficherAvancerCase(Joueur joueur);
	public void afficherAllerCase(Joueur joueur);
	public void afficherPerdreUneVie(Joueur joueur);
	public void afficherGagnerUneVie(Joueur joueur);
	public void afficherViesRestantes(Joueur joueur);
	public void afficherDuelEgalite();

}
