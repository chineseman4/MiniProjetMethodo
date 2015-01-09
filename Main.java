

import java.util.Scanner;

public class Main extends Question{
	
	public static void main(String[] args)
	{
			Question quest = new Question();
			Joueur j = new Joueur();
			Scanner scan = new Scanner(System.in);
			int i;
			
			System.out.println("Menu\n1 : Lancer le quiz\n2: Quitter");
			
			i = scan.nextInt();
			switch (i) {
			case 1 :
				System.out.println("Choisissez un pseudo");
				scan.nextLine();
				System.out.println("Vous etes le joueur "+ j.getJoueur());
				quest.affiche();
				main(args);
				break;
			case 2 :
				break;
			}
	}
}
