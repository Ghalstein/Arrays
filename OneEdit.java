// writing a function to check if a string is one edit aweay from being like another string
import java.util.*;

public class OneEdit {

	// one edit away includes inserting, remvoing or replacing
	private static HashMap<Character, Integer> hashChars1 = new HashMap<>();
	private static HashMap<Character, Integer> hashChars2 = new HashMap<>();
	public static boolean valid(String str1, String str2) {
		if (str1.length() - str2.length() > 1 || str1.length() - str2.length() < -1) {
			return false;
		}
		// making hash for first one
		for (int i = 0; i < str2.length(); ++i) {
			if (hashChars1.containsKey(str2.charAt(i))) {
				hashChars1.put(str2.charAt(i), hashChars1.get(str2.charAt(i)) + 1);
			}
			else {
				hashChars1.put(str2.charAt(i), 1);
			}
		}
		//making has for second string
		for (int i = 0; i < str1.length(); ++i) {
			if (hashChars2.containsKey(str1.charAt(i))) {
				hashChars2.put(str1.charAt(i), hashChars2.get(str1.charAt(i)) + 1);
			}
			else {
				hashChars2.put(str1.charAt(i), 1);
			}
		}
		boolean differenceFound = false;
		if (hashChars1.size() > hashChars2.size()) {
			for (HashMap.Entry<Character, Integer> entry : hashChars1.entrySet()) {
				if (!hashChars2.containsKey(entry.getKey())) {
					if (differenceFound) {
						return false;
					}
					else {
						differenceFound = true;
						continue;
					}
				}
				if (hashChars2.get(entry.getKey()) != entry.getValue()) {
					if (Math.abs(hashChars2.get(entry.getKey()) - entry.getValue()) > 1) {
						return false;
					}
					else if (differenceFound){
						return false;
					}
					else differenceFound = true;
				}
			}
		}
		else {
			for (HashMap.Entry<Character, Integer> entry : hashChars2.entrySet()) {
				if (!hashChars1.containsKey(entry.getKey())) {
					if (differenceFound) {
						return false;
					}
					else {
						differenceFound = true;
						continue;
					}
				}
				if (hashChars1.get(entry.getKey()) != entry.getValue()) {
					if (Math.abs(hashChars1.get(entry.getKey()) - entry.getValue()) > 1) {
						return false;
					}
					else if (differenceFound){
						return false;
					}
					else differenceFound = true;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(valid("eep", "expl"));
	}
}