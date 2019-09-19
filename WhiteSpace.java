public class WhiteSpace {

	public static String reduce(String str) {
		// blank url where chars will be added to
		String url = "";
		for (int i = 0; i < str.length(); ++i) {
			if (str.charAt(i) != ' ') {
				url += str.charAt(i);
			}
			
		}
		return url;
	}

	public static void main(String[] args) {
		System.out.println(reduce("www. tea    .com   "));
	}
}