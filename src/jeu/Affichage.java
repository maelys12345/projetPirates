package jeu;

public class Affichage implements IAffichage {
	
	@Override
	public void afficherSeparation() {
		System.out.println("\n------------------------------\n");
	}
	
	protected void donnerPirate(Joueur joueur) {
		System.out.print("Le pirate "+joueur.getPion().getPirate().getNom());
	}
	
	@Override
	public void afficherMauvaisChoix() {
		System.out.println("Choix invalide, recommencez.");
	}

	@Override
	public void afficherContexte(Joueur j1,Joueur j2) {
		System.out.println("Les pirates "+j1.getPion().getPirate().getNom()+" et "+j2.getPion().getPirate().getNom()
				+" se retrouvent au centre d'une ile déserte.");
		System.out.println("Leur but : être le premier à s'échapper de l'ile, ou bien survivre à son adversaire.");

	}

	@Override
	public void demanderNom(int n) {
		System.out.println("Joueur "+n+", entrez votre nom :");
	}

	@Override
	public void afficherPirates(Pion[] pions) {
		System.out.println("Quel pirate voulez-vous incarner?");
		for(int i=0;i<pions.length;i++) {
			if(pions[i].getJoueur()==null) {
				System.out.println((i+1) + " : Le pirate "+pions[i].getPirate().getNom()+", de couleur "+pions[i].getPirate().getCouleur());
			}
		}
	}
	
	@Override
	public void afficherTourJoueur(Joueur joueur) {
		System.out.println("Au tour du joueur "+joueur.getNom()+" de jouer!");
		afficherViesRestantes(joueur);
	}
	
	@Override
	public void afficherLancerDes(Joueur joueur) {
		System.out.println("Appuyez sur une touche pour lancer les dés.");
	}
	@Override
	public void afficherLancerUnDe(Joueur joueur) {
		System.out.println("Joueur "+joueur.getNom()+", lance un dé!");
		System.out.println("Appuiez sur une touche pour lancer le dé.");
	}
	
	@Override
	public void afficherResultatDes(PlateauJeu plateau) {
		int total=plateau.getResultatDe(0)+plateau.getResultatDe(1);
		System.out.println("Résultat des dés : [ "+plateau.getResultatDe(0)+" ]    [ "+plateau.getResultatDe(1)+" ]");
		System.out.println("Total : "+total);
	}
	
	@Override
	public void afficherResultatUnDe(PlateauJeu plateau) {
		System.out.println("Résultat du dé : [ "+plateau.getResultatDe(0)+" ]");
	}
	
	@Override
	public void afficherCaseActuelle(Joueur joueur) {
		System.out.println("Case actuelle : "+joueur.getPion().getCaseActuelle());
	}

	@Override
	public void decrireCaseDuel() {
		System.out.println("Case duel!");
		System.out.println("Les deux pirates s'affrountent en duel.");
		System.out.println("Le gagnant volera une vie au perdant.");
	}
	@Override
	public void decrireCaseTornade() {
		System.out.println("Case tornade!");
		System.out.println("Les deux pirates s'envolent et échangent leurs places.");
	}
	@Override
	public void afficherAvancerJusqua30(Joueur joueur) {
		donnerPirate(joueur);
		System.out.println(" avance jusqu'à la dernière case.");
	}
	@Override
	public void afficherReculerCase(Joueur joueur) {
		donnerPirate(joueur);
		System.out.println(" recule jusqu'à atteindre la case "+joueur.getPion().getCaseActuelle()+".");
	}
	@Override
	public void afficherAvancerCase(Joueur joueur) {
		donnerPirate(joueur);
		System.out.println(" avance jusqu'à la case "+joueur.getPion().getCaseActuelle()+".");
	}
	@Override
	public void afficherAllerCase(Joueur joueur) {
		donnerPirate(joueur);
		System.out.println(" se déplace jusqu'à la case "+joueur.getPion().getCaseActuelle()+".");
	}
	@Override
	public void afficherPerdreUneVie(Joueur joueur) {
		System.out.print("Tonnerre! ");
		donnerPirate(joueur);
		System.out.println(" perd une vie!");
		afficherViesRestantes(joueur);
	}
	@Override
	public void afficherGagnerUneVie(Joueur joueur) {
		System.out.print("Les dieux soient loués! ");
		donnerPirate(joueur);
		System.out.println(" gagne une vie!");
		afficherViesRestantes(joueur);
	}
	@Override
	public void afficherViesRestantes(Joueur joueur) {
		System.out.print("Vies restantes du pirate "+joueur.getPion().getPirate().getNom()+" : ");
		for(int i=0;i<joueur.getPion().getVie();i++) {
			System.out.print("❤️ ");
		}
		System.out.println("");
	}
	@Override
	public void afficherDuelEgalite() {
		System.out.println("Wouah! Egalité! Les deux pirates s'en sortent indemnes!");
	}
	@Override
	public void afficherBombeDeclenchee() {
		System.out.println("Argh! Une bombe cachée dans la case se déclenche!");
	}
	@Override
	public void afficherPiratesExplosent() {
		System.out.println("Tous les pirates perdent une vie!");
	}
	
	@Override
	public void afficherJoueurMort(Joueur joueur) {
		System.out.println("Mille millions de mille sabords!");
		donnerPirate(joueur);
		System.out.println(" n'a plus de vie et doit se rendre...");
	}
	@Override
	public void afficherPirateArrive(Joueur joueur) {
		System.out.println("Hourra!");
		donnerPirate(joueur);
		System.out.println(" a atteint le bout de l'ile, il peut maintenant rejoindre son bateau pour voguer vers de nouvelles aventures!");
	}
	@Override
	public void afficherFinJeu(Joueur joueur) {
		System.out.println("Fin de la partie!");
		System.out.println("Le joueur "+joueur.getNom()+" remporte la victoire! Bravo!");
	}

}
