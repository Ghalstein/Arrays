import java.util.*;

public class ThreeSum {
	private static Hashtable<Integer, Integer> hashTable = new Hashtable<>();
	private static ArrayList<ArrayList<Integer>> arrList = new ArrayList<>();
	private static void createHash(ArrayList<Integer> intArr) {
		int index = 0;
		for (int element : intArr) {
			hashTable.put(element, -1);
		}
	}

	public static ArrayList<ArrayList<Integer>> findMatch(ArrayList<Integer> arr) {
		createHash(arr);
		ArrayList<ArrayList<Integer>> arrOfArrays = new ArrayList<>();
		Hashtable<String, Integer> taken = new Hashtable<>();
		for (int i = 0; i < arr.size(); i++ ) {	
			for (int j = i+ 1; j < arr.size(); j++) {
				if (hashTable.containsKey(-(arr.get(i) + arr.get(j)))) {
					ArrayList<Integer> tempArr = new ArrayList<>();
					tempArr.add(arr.get(i));
					tempArr.add(arr.get(j));
					tempArr.add(-(arr.get(i) + arr.get(j)));
					Collections.sort(tempArr);
					String test = tempArr.toString();
					if (!taken.containsKey(test)) {
						taken.put(test, j);
						arrOfArrays.add(tempArr);
					}
				}
			}
		}
		return arrOfArrays;
	}

	public static void printNestedArrList(ArrayList<ArrayList<Integer>> arr) {
		for (ArrayList<Integer> list : arr) {
			String strArr = "";
			for (int element : list) {
				strArr += element + " ";
			}
			System.out.println(strArr);
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i =0; i < args.length; ++i) {
			arr.add(Integer.parseInt(args[i]));
		}
		printNestedArrList(findMatch(arr));
	}
}

