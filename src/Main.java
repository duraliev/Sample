public class Main {

	/**
	 * Concatenates a word to the phrase ", world"
	 * @param word the word you want to concatenate
	 */
	private static void saySomethingToWorld (String word){
		System.out.println(word + ", world!");
	}

	public static void main (String[] args){
		saySomethingToWorld("Hello");
	}
}