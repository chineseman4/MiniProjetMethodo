import java.util.Scanner;

public class Question extends Reponse{
	
	public void affiche() {
		
		Scanner rep = new Scanner(System.in);
		String s;
		int score = 0;
		
		System.out.println("Question n°1 :");
		System.out.println("Quelle est la capitale de la Mongolie ?");
		System.out.println("Réponse : ");
		s = rep.nextLine();
		if (Reponse.verif(s)) {
			score ++;
		}
		
		System.out.println("Question n°2 :");
		System.out.println("Comment s'appelle l'acteur de 'Walker Texas ranger' ?");
		s = rep.nextLine();
		if (Reponse.verif(s)) {
			score ++;
		}
		
		System.out.println("Question n°3 :");
		System.out.println("Quel est le plat le plus mangé au monde ?");
		s = rep.nextLine();
		if (Reponse.verif(s)) {
			score ++;
		}
		
		System.out.println("Question n°4 :");
		System.out.println("Combien font pi divisé par 134,13 ?");
		s = rep.nextLine();
		if (Reponse.verif(s)) {
			score ++;
		}
		
		System.out.println("Question n°5 :");
		System.out.println("Combien de Stark sont morts dans 'Game of Thrones' ?");
		s = rep.nextLine();
		if (Reponse.verif(s)) {
			score ++;
		}
		
		System.out.println("Question n°6 :");
		System.out.println("Convertissez le nombre 348 en binaire");
		s = rep.nextLine();
		if (Reponse.verif(s)) {
			score ++;
		}
		
		System.out.println("Question n°7 :");
		System.out.println("A quelle couleur correspond le code '#fff' en CSS ?");
		s = rep.nextLine();
		if (Reponse.verif(s)) {
			score ++;
		}
		
		System.out.println("Question n°8 :");
		System.out.println("Comment s'appelle le 'Nokia 3310' ?");
		s = rep.nextLine();
		if (Reponse.verif(s)) {
			score ++;
		}
		
		System.out.println("Question n°9 :");
		System.out.println("Quel est ton code de CB ?");
		s = rep.nextLine();
		if (Reponse.verif(s)) {
			score ++;
		}
		
		System.out.println("Question n°10 :");
		System.out.println("Quel est le navigateur internet le moins bien ?");
		s = rep.nextLine();
		if (Reponse.verif(s)) {
			score ++;
		}
		
		System.out.println("\nVotre score : " + score + "\n");

		
	}
	


}
