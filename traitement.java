public class Traitement {

	private int score;
	private int pourcentage;
	
	
	public Traitement(){
		score = 0;
	}
	
	public Traitement(int s){
		this.score = s;
	}
	
	public void afficheScore(){
		System.out.println("Votre score est de "+ this.score);
		
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(int pourcentage) {
		this.pourcentage = pourcentage;
	}
	
}
