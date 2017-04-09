public class Main {

	/**
	 * Concatenates a word to the phrase ", world!"
	 * @param word the word you want to concatenate
	 */
	private static void saySomethingToWorld (String word){
		String worldString = sayWorld();
		System.out.println(word + worldString);
	}

	/**
	 * Returns the phrase ", world!"
	 * @return ", world!"
	 */
	public static String sayWorld(){
		return ", world!";
	}

	public static void main (String[] args){
		saySomethingToWorld("Hello");
	}
}