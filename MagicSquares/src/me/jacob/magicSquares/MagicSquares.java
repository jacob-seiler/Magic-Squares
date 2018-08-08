package me.jacob.magicSquares;

/**
 * Name: Jacob Seiler
 * Teacher: Mrs. Costin
 * Course: ICS4U
 * 
 * The Class MagicSquares determines if the given values are a magic square.
 */
public class MagicSquares {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		int[][] square = {{3, 5, 7}, {9, 5, 1}, {3, 5, 7}}; // The square values

		if (isMagic(square)) {
			int sum = square[0][0] + square[0][1] + square[0][2]; // Calculate magic number
			System.out.println("That is a magic square. The magic number is " + sum); // Print value
		} else {
			System.out.println("That is not a magic square."); // Tell the user the square is not magic
		}
	}

	/**
	 * Checks if the given values are a magic square.
	 *
	 * @param square the array that has the values of the square
	 * @return true, if the array is a magic square
	 */
	private static boolean isMagic(int[][] square) {
		int sum = square[0][0] + square[0][1] + square[0][2]; // The magic number (and the sum of column 1)

		// Check row 1
		if (square[0][0] + square[1][0] + square[2][0] != sum)
			return false;

		// Check row 2
		if (square[0][1] + square[1][1] + square[2][1] != sum)
			return false;

		// Check row 3
		if (square[0][2] + square[1][2] + square[2][2] != sum)
			return false;

		// Check column 2
		if (square[1][0] + square[1][1] + square[1][2] != sum)
			return false;

		// Check column 3
		if (square[2][0] + square[2][1] + square[2][2] != sum)
			return false;

		// Check diagonal 0,0 to 2,2
		if (square[0][0] + square[1][1] + square[2][2] != sum)
			return false;

		// Check diagonal 2,0 to 0,2
		if (square[2][0] + square[1][1] + square[0][2] != sum)
			return false;

		return true;
	}

}
