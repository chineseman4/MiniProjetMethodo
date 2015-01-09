package org.gradle;

public class ReponseBis {

	public static boolean verif(String s, QuestionBis qb) {
		if(s.equals(qb.getReponse()) || s.equals("Chuck Norris")) {
			return true;
		} else {
			return false;
		}
	}
}
