package jeu;

public class Main {

	public static void main(String[] args) {
		Affichage affichage=new Affichage();
		Jeu jeu=new Jeu(affichage);
		jeu.deroulerJeu();
	}

}
