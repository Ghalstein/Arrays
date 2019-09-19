/*
Program that compresses the repeats in a string to the character followed by the number of times
Will use a hashmap to map out the repeats and increment for each repeat 
Then will iterate trhoguh the hashmap to create the new compressed string
*/

import java.util.*;

public class StringCompress {


	// creates a hashmap that tallies the repeats and appearence  
	private static HashMap<Character, Integer> hashString(String str) {
		HashMap<Character, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < str.length(); ++i) {
			// if the key already appeared just increment the value else create it
			if (hashMap.containsKey(str.charAt(i))) {
				hashMap.put(str.charAt(i), hashMap.get(str.charAt(i)) + 1);
			}
			else {
				hashMap.put(str.charAt(i), 1);
			}
		}
		return hashMap;
	}

	public static String create(String str) {
		HashMap<Character, Integer> hash = hashString(str);

		// iterate through hasmap to create compressed String
		String compressedStr = "";
		for (HashMap.Entry<Character, Integer> entry : hash.entrySet()) {
			compressedStr += entry.getKey() + "" + entry.getValue();
		}
		return compressedStr;
	}

	// if the repeats can only be consecutive
	public static String consecutive(String str) {
		StringBuilder compressedStr = new StringBuilder();

		// iterate through the string and add as repeat is broken
		int count = 1;
		for (int i = 0; i < str.length() - 1; ++i) {

			if (str.charAt(i) == str.charAt(i + 1)) {
				++count; 
			}
			else {
				compressedStr.append(str.charAt(i));
				compressedStr.append(count);
				count = 1;
			}
		}
		// including the final character
		compressedStr.append(str.charAt(str.length() - 1));
		compressedStr.append(count);

		return compressedStr.toString();
	}

	public static void main(String[] args) {
		System.out.println(create("aabcccccaaa"));
		System.out.println(consecutive("aabcccccaaa"));
	}
}