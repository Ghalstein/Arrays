import java.util.*;

public class PalidromePermutation {

	public static boolean valid(String str) {
		char[] chars = str.toCharArray();
		Arrays.sort(chars);
		boolean oddFound = false;
		int repeats = 1;
		for (int i = 0; i < chars.length - 1; ++i) {
			if (chars[i] == chars[i + 1]) {
				++repeats;
			}
			else {
				if (repeats % 2 == 1) {
					if (oddFound) {
						return false;
					}
					else {
						oddFound = true;
					}
				}
				repeats = 1;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(valid("racecar"));
		System.out.println(valid("tacocat"));
		System.out.println(valid("tea"));
	}
}