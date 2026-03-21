package jeu;

public class CaseVolcan extends CaseSpeciale {
	private int numero;
	public CaseVolcan(int n) {
		numero=n;
	}
	public int getNumero() {
		return numero;
	}
	@Override
	public void appliquerEffet(IAffichage affichage, Joueur j1, Joueur j2, PlateauJeu plateau) {
		if(j1.getPion().getCaseActuelle()==numero) {
			affichage.decrireCaseVolcan(j1);
			j1.allerANouvelleCase(affichage, numero-5);
		}
		else {
			affichage.decrireCaseVolcan(j2);
			j2.allerANouvelleCase(affichage, numero-5);
		}
	}

}
