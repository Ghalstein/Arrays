public class URLify {

	public static String create(String str) {
		// blank url where chars will be added to
		String url = "";
		boolean space = false;
		for (int i = 0; i < str.length(); ++i) {
			if (str.charAt(i) != ' ') {
				url += str.charAt(i);
				space = false;
			}
			else if (!space){
				space = true;
				url += "%20";
			}
		}
		return url;
	}

	public static void main(String[] args) {
		System.out.println(create("www. tea    .com   "));
	}
}