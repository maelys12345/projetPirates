package jeu;

public class PlateauJeu {
	public int nbCases=31;
	private CaseSpeciale[] caseSpeciales=new CaseSpeciale[nbCases];
	private De[] des=new De[2];
	private int[] resultatDes=new int[2];
	
	public PlateauJeu() {
		De de1=new De();
		De de2=new De();
		des[0]=de1;
		des[1]=de2;
		CaseDuel duel1=new CaseDuel();
		CaseDuel duel2=new CaseDuel();
		CaseTornade tornade1=new CaseTornade();
		CaseTornade tornade2=new CaseTornade();
		CaseBombe bombe1=new CaseBombe(21);
		CaseBombe bombe2=new CaseBombe(28);
		CaseBombe bombe3=new CaseBombe(5);
		CaseBombe bombe4=new CaseBombe(16);
		CaseVolcan volcan=new CaseVolcan(14);
		ajouterCaseSpeciale(duel1, 7);
		ajouterCaseSpeciale(duel2, 19);
		ajouterCaseSpeciale(tornade1,11);
		ajouterCaseSpeciale(tornade2,26);
		ajouterCaseSpeciale(bombe1, bombe1.getNumero());
		ajouterCaseSpeciale(bombe2, bombe2.getNumero());
		ajouterCaseSpeciale(bombe3, bombe3.getNumero());
		ajouterCaseSpeciale(bombe4, bombe4.getNumero());
		ajouterCaseSpeciale(volcan, volcan.getNumero());
	}
	public void ajouterCaseSpeciale(CaseSpeciale caseSpeciale, int indice) {
		caseSpeciales[indice]=caseSpeciale;
	}
	public CaseSpeciale[] getTabCaseSpe() {
		return caseSpeciales;
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
