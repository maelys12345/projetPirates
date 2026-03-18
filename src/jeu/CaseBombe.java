package jeu;

public class CaseBombe extends CaseSpeciale {
	private int numero;
	public CaseBombe(int n) {
		numero=n;
	}
	public int getNumero() {
		return numero;
	}
	@Override
	public void appliquerEffet(IAffichage affichage, Joueur j1, Joueur j2, PlateauJeu plateau) {
		affichage.afficherBombeDeclenchee();
		if(j1.getPion().getCaseActuelle()==numero) {
			j1.getPion().changerVie(-1);
			if(j2.getPion().getCaseActuelle()==numero) {
				j2.getPion().changerVie(-1);
				affichage.afficherPiratesExplosent();
				affichage.afficherViesRestantes(j1);
				affichage.afficherViesRestantes(j2);
			}
			else {
				affichage.afficherPerdreUneVie(j1);
			}
		}
		else if(j2.getPion().getCaseActuelle()==numero) {
			j2.getPion().changerVie(-1);
			if(j1.getPion().getCaseActuelle()==numero) {
				j1.getPion().changerVie(-1);
				affichage.afficherPiratesExplosent();
				affichage.afficherViesRestantes(j1);
				affichage.afficherViesRestantes(j2);
			}
			else {
				affichage.afficherPerdreUneVie(j2);
			}
		}
	}

}
