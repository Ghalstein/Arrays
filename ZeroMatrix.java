/*
If zero appears anywhere in the row of the matrix set the entire row to zero
Try traversing through each row, if zero is found set the whole row to zero
else keep traversing
*/

public class ZeroMatrix {

	public static void zerofy(int[][] matrix) {
		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[i].length; ++j) {
				if (matrix[i][j] == 0) {
					for (int k = 0; k < matrix[i].length; ++k) {
						matrix[i][k] = 0;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		
	}
}