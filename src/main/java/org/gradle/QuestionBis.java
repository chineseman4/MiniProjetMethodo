package org.gradle;

public class QuestionBis {

	private String question;
	private String reponse;
	

	public QuestionBis(String question, String reponse)
	{
		this.question = question;
		this.reponse = reponse;
	}


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public String getReponse() {
		return reponse;
	}


	public void setReponse(String reponse) {
		this.reponse = reponse;
	}


	@Override
	public String toString() {
		return question ;
	}
	
	
}
