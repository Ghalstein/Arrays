import java.util.Scanner;

public class Increment {

	public static int arrayToDecimal (int[] arr) {
		int increment = 1;
		int num = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			num += increment * arr[i];
			increment *= 10;
		}
		return num;
	}

	public static int increment (int[] intArr, int operand) {
		int num = arrayToDecimal(intArr);
		num += operand;
		return num;
	}

	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[3];
		arr[0] = input.nextInt();
		arr[1] = input.nextInt();
		arr[2] = input.nextInt();

		System.out.println(increment(arr, 5));
	}
}