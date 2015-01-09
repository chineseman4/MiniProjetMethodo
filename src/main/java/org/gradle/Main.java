package org.gradle;


import java.util.ArrayList;
import java.util.Scanner;


public class Main{
	
	public static void main(String[] args)
	{
			ArrayList<QuestionBis> alQb = new ArrayList<QuestionBis>();
			alQb.add(new QuestionBis("Quelle est la capitale de la Mongolie ?", "Oulan-Bator"));
			alQb.add(new QuestionBis("Comment s'appelle l'acteur de 'Walker Texas ranger' ?","Chuck Norris"));
			alQb.add(new QuestionBis("Quel est le plat le plus mangé au monde ?","Poulet Mayo"));
			alQb.add(new QuestionBis("Combien font pi divisé par 134,13 ?","?"));
			alQb.add(new QuestionBis("Combien de Stark sont morts dans 'Game of Thrones ?","Tous"));
			alQb.add(new QuestionBis("Convertissez le nombre 348 en binaire", "101011100"));
			alQb.add(new QuestionBis("A quelle couleur correspond le code '#fff' en CSS ?", "Noir"));
			Joueur j = new Joueur();
			Scanner scan = new Scanner(System.in);
			Scanner scan2 = new Scanner(System.in);
			int i;
			String rep;
			String s;
			
			System.out.println("Menu\n1 : Lancer le quiz\n2: Quitter");
			
			i = scan.nextInt();
			switch (i) {
			case 1 :
				System.out.println("Choisissez un pseudo");
				s = scan2.nextLine();
				j = new Joueur(s,0);
				System.out.println("Vous etes le joueur "+ j.getJoueur());
				for(int x = 0; x < alQb.size(); x++)
				{
					System.out.println("Question "+ (x+1)+": " + alQb.get(x));
					rep = scan2.nextLine();
					if (ReponseBis.verif(rep, alQb.get(x)))
					{
						System.out.println("Bonne reponse!");
						j.setScore(j.getScore()+1);
					}
					else
						System.out.println("dommage!");
				}
				System.out.println("Quizz fini voici votre score: " + j.getScore());
				main(args);
				break;
			case 2 :
				break;
			}
			scan.close();
	}
}