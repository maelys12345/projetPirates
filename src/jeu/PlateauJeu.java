package jeu;

public class PlateauJeu {
	public static int nbCases=30;
	private CaseSpeciale[] caseSpeciales=new CaseSpeciale[nbCases];
	private De[] des=new De[2];
	private int[] resultatDes=new int[2];
	
	public PlateauJeu() {
		De de1=new De();
		De de2=new De();
		des[0]=de1;
		des[1]=de2;
	}
	public void ajouterCaseSpeciale(CaseSpeciale caseSpeciale, int indice) {
		caseSpeciales[indice]=caseSpeciale;
	}
	public void setResultatDes(int indice,int resultat) {
		if(indice<2) {
			resultatDes[indice]=resultat;
		}
	}
	public De getDe(int indice) {
		if(indice<2) {
			return des[indice];
		}
		return null;
	}
	public int getResultatDe(int indice) {
		if(indice<2) {
			return resultatDes[indice];
		}
		return 0;
	}

}
