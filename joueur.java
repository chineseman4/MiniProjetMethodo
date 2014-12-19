
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
	
	public void afficheJoueur(){
		System.out.println("Vous etes le joueur "+ this.joueur);
		System.out.println("Votre score est de "+ this.score);
	}

	public String getJoueur() {
		return joueur;
	}

	public void setJoueur(String joueur) {
		this.joueur = joueur;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
