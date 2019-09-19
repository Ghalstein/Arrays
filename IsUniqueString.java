import java.util.*;

public class IsUniqueString {

	// hash for keeping track of hash set
	private static HashSet<Character> characters = new HashSet<>();

	public static boolean valid(String str) {
		for (int i = 0; i < str.length(); ++i) {
			//tests whether hash set contains the key
			if (characters.contains(str.charAt(i))) {
				return false;
			}
			characters.add(str.charAt(i));
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(valid("TEA"));
		System.out.println(valid("not tea"));
	}
}