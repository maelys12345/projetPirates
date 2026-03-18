package jeu;

public class Test {

	public static void main(String[] args) {
		PlateauJeu plateau=new PlateauJeu();
		Jeu jeu=new Jeu(plateau);
		CaseDuel duel1=new CaseDuel();
		CaseDuel duel2=new CaseDuel();
		CaseTornade tornade1=new CaseTornade();
		CaseTornade tornade2=new CaseTornade();
		CaseBombe bombe1=new CaseBombe(21);
		CaseBombe bombe2=new CaseBombe(28);
		CaseBombe bombe3=new CaseBombe(5);
		CaseBombe bombe4=new CaseBombe(16);
		plateau.ajouterCaseSpeciale(duel1, 7);
		plateau.ajouterCaseSpeciale(duel2, 19);
		plateau.ajouterCaseSpeciale(tornade1,13);
		plateau.ajouterCaseSpeciale(tornade2,26);
		plateau.ajouterCaseSpeciale(bombe1, bombe1.getNumero());
		plateau.ajouterCaseSpeciale(bombe2, bombe2.getNumero());
		plateau.ajouterCaseSpeciale(bombe3, bombe3.getNumero());
		plateau.ajouterCaseSpeciale(bombe4, bombe4.getNumero());
		jeu.deroulerJeu();
	}

}
