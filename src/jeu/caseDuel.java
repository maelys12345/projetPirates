package jeu;

public class caseDuel extends CaseSpeciale {

	@Override
	public void appliquerEffet(Joueur j1, Joueur j2,PlateauJeu plateau) {
		j1.lancerUnDe(plateau);
		int valDe1=plateau.getResultatDe(0);
		j2.lancerUnDe(plateau);
		int valDe2=plateau.getResultatDe(0);
		if(valDe1>valDe2) {
			j1.getPion().changerVie(1);
			j2.getPion().changerVie(-1);
		}
		else if(valDe1<valDe2) {
			j1.getPion().changerVie(-1);
			j2.getPion().changerVie(1);
		}

	}

}
