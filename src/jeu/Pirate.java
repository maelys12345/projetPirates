package jeu;

public enum Pirate {
	CAPITAINE_CROCHET("Capitaine Crochet","violet"),
	LUFFY("Luffy","rouge"),
	JACK_SPARROW("Jack Sparrow","marron"),
	FLAMEHEART("Flameheart","blanc"),
	VICTOR_MACBERNIK("Victor Macbernik","bleu");
	
	private String nom;
	private String couleur;
	private Pirate(String nom,String couleur) {
		this.nom=nom;
		this.couleur=couleur;
	}
	public String getNom() {
		return nom;
	}
	public String getCouleur() {
		return couleur;
	}

}
