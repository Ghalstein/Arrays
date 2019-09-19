import java.util.*;

public class Permutation {


	public static boolean valid(String str1, String str2) {
		// not same size false
		// converting to char array, sorting and seeing if the prinout is equal
		// O(nlog(n))
		char[] chars1 = str1.toCharArray();
		char[] chars2 = str2.toCharArray();
		Arrays.sort(chars1);
		Arrays.sort(chars2);
		if (Arrays.toString(chars1).equals(Arrays.toString(chars2))) {
			return true;
		}
		else return false;

	}

	public static void main(String[] args) {
		System.out.println(valid("tea", "eat"));
		System.out.println(valid("tea", "tet"));
	}
}