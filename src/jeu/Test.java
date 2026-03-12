package jeu;

public class Test {

	public static void main(String[] args) {
		PlateauJeu plateau=new PlateauJeu();
		Jeu jeu=new Jeu(plateau);
		CaseDuel duel1=new CaseDuel();
		CaseDuel duel2=new CaseDuel();
		CaseTornade tornade1=new CaseTornade();
		CaseTornade tornade2=new CaseTornade();
		plateau.ajouterCaseSpeciale(duel1, 7);
		plateau.ajouterCaseSpeciale(duel2, 19);
		plateau.ajouterCaseSpeciale(tornade1,13);
		plateau.ajouterCaseSpeciale(tornade2,26);
		jeu.deroulerJeu();
	}

}
