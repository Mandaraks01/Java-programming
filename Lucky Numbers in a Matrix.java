public static List<Integer> luckyNumbers(int[][] matrix) {
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < matrix.length; i++) {
        int minCol = 0;                       // column of the row minimum
        for (int j = 1; j < matrix[i].length; j++) {
            if (matrix[i][j] < matrix[i][minCol]) {
                minCol = j;
            }
        }
        boolean isMaxInColumn = true;
        for (int r = 0; r < matrix.length; r++) {
            if (matrix[r][minCol] > matrix[i][minCol]) {
                isMaxInColumn = false;
            }
        }
        if (isMaxInColumn) {
            result.add(matrix[i][minCol]);
        }
    }
    return result;
}
