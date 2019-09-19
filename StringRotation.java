/*
find if a string is a roation of the otehr string
first take ones string's first character
then traverse through the other string
make a few conditions
stop by the end of stringif not continuing through
have a counter keeping track of the every iteration to do so
*/

public class StringRotation {

	public static boolean valid(String str1, String str2) {
		//validations for strings
		if (str1.length() != str2.length()) return false;
		//initital letter
		char init = str1.charAt(0);
		int reps = 0;
		for (int i = 0; i < str2.length(); ++i) {

			if (str2.charAt(i) == str1.charAt(reps)) {
				++reps;
			}
			else if (str2.charAt(i) == init) {
				reps = 1;
			}
			else {
				reps = 0;
			}
		}
		if (reps > 0) {
			int initReps = reps;
			for (int i = 0; i < str1.length() - initReps; ++i) {
				if (str1.charAt(reps) == str2.charAt(i)) {
					++reps;
				}
				else {
					return false;
				}
			}
		}
		if (reps == str1.length()) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(valid("tea", "ate"));
		System.out.println(valid("tea", "tet"));
		System.out.println(valid("waterbottle", "erbottlewat"));
	}
}