public class SudokuValidator {

	private static boolean checkColumns(int[][] arr) {
		boolean[][] truth = new boolean[arr.length][arr.length];
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] == 0) {
					continue;
				}
				if (!truth[i][arr[i][j] - 1]) {
					truth[i][arr[i][j]] = true;
				}
				else {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {

	}
}