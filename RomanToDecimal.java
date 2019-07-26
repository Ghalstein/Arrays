import java.util.*;

public class RomanToDecimal {

	// hashmap key for detemrining the values of each numeral
	private static HashMap<Character, Integer> map = new HashMap<>();

	// function that adds the elements to the hash
	private static void createHash() {
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
	}

	//converts the string of roman numerals to integers
	public static int convert(String romanNumerals) {
		// adds elements to the hash
		createHash();
		int value = 0;
		for (int i = 0; i < romanNumerals.length(); i++) {
			if (i < romanNumerals.length() - 1) {	
				if (map.get(romanNumerals.charAt(i)) < map.get(romanNumerals.charAt(i + 1) )) {
					value += map.get(romanNumerals.charAt(i)) - 2;
				}		
				else {
					value += map.get(romanNumerals.charAt(i));
				}
			}
			else {
				value += map.get(romanNumerals.charAt(i));
			}
		}
		return value;
	}

	public static void main(String args[]) {

		System.out.println(convert(args[0]));
	}
}