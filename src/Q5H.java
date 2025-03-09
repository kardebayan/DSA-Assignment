public class Q5H {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = (Math.random() < 0.5) ? 0 : 1;
            }
        }

        System.out.println("Generated 4x4 Matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int maxRowIndex = 0, maxRowCount = 0;
        for (int i = 0; i < 4; i++) {
            int rowCount = 0;
            for (int j = 0; j < 4; j++) {
                if (matrix[i][j] == 1) {
                    rowCount++;
                }
            }
            if (rowCount > maxRowCount) {
                maxRowCount = rowCount;
                maxRowIndex = i;
            }
        }

        int maxColIndex = 0, maxColCount = 0;
        for (int j = 0; j < 4; j++) {
            int colCount = 0;
            for (int i = 0; i < 4; i++) {
                if (matrix[i][j] == 1) {
                    colCount++;
                }
            }
            if (colCount > maxColCount) {
                maxColCount = colCount;
                maxColIndex = j;
            }
        }

        System.out.println("The largest row index: " + maxRowIndex);
        System.out.println("The largest column index: " + maxColIndex);
    }
}
