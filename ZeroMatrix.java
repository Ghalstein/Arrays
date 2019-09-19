/*
If zero appears anywhere in the row of the matrix set the entire row to zero
Try traversing through each row, if zero is found set the whole row to zero
else keep traversing
*/

import java.util.*;

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
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 3;
		matrix[1][0] = 1;
		matrix[1][1] = 0;
		matrix[1][2] = 3;
		matrix[2][0] = 1;
		matrix[2][1] = 2;
		matrix[2][2] = 0;
		zerofy(matrix);
		System.out.println(Arrays.deepToString(matrix));
	}
}