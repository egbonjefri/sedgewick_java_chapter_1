public class Minesweeper {
    public static void main(String args[]) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        double p = Double.parseDouble(args[2]);
        boolean[][] array1 = new boolean[m][n];
        int[][] array2 = new int[m][n];
    
        // Initialize array1 with p bombs
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.random() < p) {
                    array1[i][j] = true;
                }
            }
        }
    
        // Calculate the number of neighboring bombs for each cell
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Iterate over the rows surrounding the current cell (i, j). 
                /*
                 * Math.max(i - 1, 0) ensures that ii does not go below 0, 
                 * which would be outside the bounds of the array.
                 * For example, if i is 0 (meaning the current cell is in the first row),
                 *  i - 1 would be -1, but Math.max ensures that ii starts from 0
                 */
                for (int ii = Math.max(i - 1, 0); ii <= Math.min(i + 1, m - 1); ii++) {
                    for (int jj = Math.max(j - 1, 0); jj <= Math.min(j + 1, n - 1); jj++) {
                        // Check if cell (ii, jj) has a bomb and is not the current cell (i, j) itself.
                        if (array1[ii][jj] && !(ii == i && jj == j)) {
                            array2[i][j]++;
                        }
                    }
                }
            }
        }
    
        // Print the bomb positions
        System.out.println("Bomb Positions :");
        for (boolean[] row : array1) {
            for (boolean cell : row) {
                System.out.print(cell ? "* " : ". ");
            }
            System.out.println();
        }
    
        // Print the count of neighboring bombs
        System.out.println("Count of Neighboring Bombs :");
        for (int[] row : array2) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
