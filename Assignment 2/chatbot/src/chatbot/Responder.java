package chatbot;

import java.util.ArrayList;

public class Responder{
	private ArrayList<String> questions = new ArrayList<String>();
	private ArrayList<String> responses = new ArrayList<String>();
	
	public Responder(String[] q, String[] a) {
		for (String question: q) {
			questions.add(question);
		}
	
		for (String response: a) {
			responses.add(response);
		}
	}
	
	/*
	 * Checks if the string is contained or matches questions and returns number of matches found
	 * Returns: count of matches to questions
	 */
	public int check(String q) {
		int count = 0;
		String[] match = q.split(" ");
		for (String word: match) {
			if (questions.contains(word)) {
				count++;
			}
		}
		return count;
	}
	
	// Returns a string randomly selected from the array of responses.
	public String respond() {
		int rand = (int)Math.random()*responses.size();
		return responses.get(rand);
	}
}