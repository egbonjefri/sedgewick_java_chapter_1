public class BooleanMatrixMultiplication {
    public static void main(String[] args) {
        boolean[][] matrixA = {
            {true, false, true},
            {false, true, false},
            {true, true, false}
        };

        boolean[][] matrixB = {
            {true, false, true},
            {false, true, true},
            {true, true, false}
        };

        int size = matrixA.length;
        boolean[][] resultMatrix = new boolean[size][size];

        // Multiply matrices using OR and AND operations
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                boolean result = false;
                for (int k = 0; k < size; k++) {
                    // Perform OR operation between matrixA[i][k] and matrixB[k][j]
                    /*
                     * |= (bitwise OR assignment): This is a compound assignment operator. 
                     * It combines the logical AND result with the current value of result
                     *  using the bitwise OR operation and assigns the result back to result.
                     *  It's equivalent to result = result | (matrixA[0][0] && matrixB[0][0])
                     */
                    result |= matrixA[i][k] && matrixB[k][j];
                }
                resultMatrix[i][j] = result;
            }
        }

        // Print the result matrix
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(resultMatrix[i][j] ? "1 " : "0 ");
            }
            System.out.println();
        }
    }
}
