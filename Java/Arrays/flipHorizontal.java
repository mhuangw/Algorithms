// Flips a 2D array across the horizontal axis
void flipHorizontal(int[][] matrix) {
	int rows = matrix.length;
	int cols = matrix[0].length;
	for(int i = 0; i < rows / 2; i++) {
		for(int j = 0; j < cols; j++) {
			int temp = matrix[i][j];
			matrix[i][j] = matrix[rows-1-i][j]
			matrix[rows-1-i][j] = matrix[i][j];
		}
	}
}