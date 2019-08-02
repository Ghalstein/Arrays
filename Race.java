public class Race {

	public static int[] race(double speedA, double speedB, double aLead) {
		double time = Math.abs((aLead)/(speedA - speedB));
		time *= 60 * 60;
		double seconds = time % 60;
		time /= 60;
		double minutes = time % 60;
		time /= 60;
		double hours = time;
		int[] arr = {(int)hours, (int)minutes, (int)seconds};
		return arr;
	}

	public static String arrToString(int[] arr) {

		String strArr = "[";

		for (int i = 0; i < arr.length - 1; ++i) {
			strArr += arr[i] + " ";
		}
		strArr += arr[arr.length - 1] + "]";

		return strArr;
	}

	public static void main(String[] args) {

		System.out.println(arrToString(race(720, 850, 70)));
	}
}