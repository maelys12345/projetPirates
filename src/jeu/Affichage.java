package jeu;

public class Affichage implements IAffichage {
	
	@Override
	public void afficherMauvaisChoix() {
		System.out.println("Choix invalide, recommencez.");
	}

	@Override
	public void afficherContexte(Joueur j1,Joueur j2) {
		System.out.println("Les pirates "+j1.getPion().getPirate()+" et "+j2.getPion().getPirate()+" se retrouvent au centre d'une ile déserte.");
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
	public void afficherLancerDes(Joueur joueur) {
		System.out.println("Au tour du joueur "+joueur.getNom()+" de lancer ses dés!");
		System.out.println("Appuiez sur une touche pour lancer les dés.");
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
		System.out.println("Le pirate "+joueur.getPion().getPirate()+" avance jusqu'à la dernière case.");
	}
	@Override
	public void afficherReculerCase(Joueur joueur) {
		System.out.println("Le pirate "+joueur.getPion().getPirate()+" recule jusqu'à atteindre la case "+joueur.getPion().getCaseActuelle()+".");
	}
	@Override
	public void afficherAvancerCase(Joueur joueur) {
		System.out.println("Le pirate "+joueur.getPion().getPirate()+" avance jusqu'à la case "+joueur.getPion().getCaseActuelle()+".");
	}
	@Override
	public void afficherAllerCase(Joueur joueur) {
		System.out.println("Le pirate "+joueur.getPion().getPirate()+"se déplace jusqu'à la case "+joueur.getPion().getCaseActuelle()+".");
	}
	@Override
	public void afficherPerdreUneVie(Joueur joueur) {
		System.out.println("Tonnerre! Le pirate "+joueur.getPion().getPirate()+" perd une vie!");
	}
	@Override
	public void afficherGagnerUneVie(Joueur joueur) {
		System.out.println("Les dieux soient loués! Le pirate "+joueur.getPion().getPirate()+" gagne une vie!");
	}
	@Override
	public void afficherViesRestantes(Joueur joueur) {
		System.out.print("Vies restantes du pirate"+joueur.getPion().getPirate()+" : ");
		for(int i=0;i<joueur.getPion().getVie();i++) {
			System.out.print("❤️ ");
		}
		System.out.println("");
	}
	@Override
	public void afficherDuelEgalite() {
		System.out.println("Wouah! Egalité! Les deux pirates s'en sortent indemnes!");
	}

}
