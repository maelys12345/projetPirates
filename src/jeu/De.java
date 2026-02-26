package jeu;
import java.security.SecureRandom;
import java.util.Random;

public class De {
	private static int nbFace = 6;
	private int resultat;
	private Random random;
	
	public De() {
		try {
			random=SecureRandom.getInstanceStrong();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void lancer() {
		resultat=random.nextInt(nbFace - 1)+1;
	}
	public int getResultat() {
		return resultat;
	}

}
