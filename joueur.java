
public class Joueur {

	private String joueur;
	private int score;
	
	public Joueur(String j, int s){
		this.setJoueur(j);
		this.setScore(s);
	}
	
	public Joueur(){
		setJoueur("Joueur 1");
		setScore(0);
	}

	public String getJoueur() {
		return joueur;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void setJoueur(String joueur ) {
		this.joueur = joueur;
	}
	
	public String toString() {
		return this.joueur + ", " + this.score +" points.";
	}
}
