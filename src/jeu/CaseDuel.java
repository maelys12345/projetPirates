package jeu;

public class CaseDuel extends CaseSpeciale {
	@Override
	public void appliquerEffet(IAffichage affichage,Joueur j1, Joueur j2,PlateauJeu plateau) {
		affichage.decrireCaseDuel();
		j1.lancerUnDe(affichage,plateau);
		int valDe1=plateau.getResultatDe(0);
		j2.lancerUnDe(affichage,plateau);
		int valDe2=plateau.getResultatDe(0);
		if(valDe1>valDe2) {
			j1.getPion().changerVie(1);
			affichage.afficherGagnerUneVie(j1);
			j2.getPion().changerVie(-1);
			affichage.afficherPerdreUneVie(j2);
		}
		else if(valDe1<valDe2) {
			j1.getPion().changerVie(-1);
			affichage.afficherPerdreUneVie(j1);
			j2.getPion().changerVie(1);
			affichage.afficherGagnerUneVie(j2);
		}
		else {
			affichage.afficherDuelEgalite();
			affichage.afficherViesRestantes(j1);
			affichage.afficherViesRestantes(j2);
		}

	}

}
