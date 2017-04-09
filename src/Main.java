public class Main {

	/**
	 * Concatenates a word to the phrase ", world!"
	 * @param word the word you want to concatenate
	 */
	private static void saySomethingToWorld (String word){
		String worldString = sayWorld();
		System.out.println(word + worldString);
		
		int n1 = 2;
		int n2 = 3;
		int result = add(n1, n2);

		System.out.println(n1 + "+" + n2 + "=" result);
	}

	/**
	 * Returns the phrase ", world!"
	 * @return ", world!"
	 */
	public static String sayWorld(){
		return ", world!";
	}

	public static int add(int a, int b){
		return a + b;
	}

	public static void main (String[] args){
		saySomethingToWorld("Hello");
	}
}