public class SubsetRandomizer {

	// used to randomize a subset of the array
	private static int[] randomize (int size, int[] arr, boolean[] truth) {
		// subset array decalred
		int[] subset = new int[size];
		if (size > arr.length) {
    	return subset; // quits out if the size entered is greater than array's length
    }
    int count = 0; // counter for adding to the subset
    while (count < size) {
    	int i = (int)(Math.random() * (arr.length));
    	if (!truth[i]) {
    		subset[count] = arr[i];
    		truth[i] = true;
    		count++;
    	}
    }
    return subset;
	}

	// prints the array
	private static void printArr (int[] arr) {
		for (int element : arr) {
			System.out.print(element + " "); // prints the elements to console
		}
	}
     
  public static void main(String args[]) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int sizeOfSubset = Integer.parseInt(args[0]);
    boolean[] truthTable = new boolean[arr.length];
    printArr(randomize(sizeOfSubset, arr, truthTable));
	}
}