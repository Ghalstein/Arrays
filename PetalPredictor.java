public class PetalPredictor {

	private static String[] words = {"I love you", "a little", "a lot", "passionately", "madly", "not at all"};

	// figures out which phrase the last petal will be
	public static String compute(int n) {
		if (n < 1) {
			return "nothing";
		}

		int index = n % words.length;


		return words[index - 1];
	}
	public static void main(String[] args) {
		System.out.println(compute(11));
	}
}