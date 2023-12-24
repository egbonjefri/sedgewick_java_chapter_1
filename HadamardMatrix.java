public class HadamardMatrix {

    public static void main(String[] args) {
        if (args.length != 1 || !isPowerOfTwo(Integer.parseInt(args[0]))) {
            System.out.println("Usage: java HadamardMatrix <n>, where n is a non-negative integer and 2^n is the order of the Hadamard matrix.");
            return;
        }
        int n = Integer.parseInt(args[0]); // Order of the Hadamard matrix, must be a power of 2
        boolean[][] hadamardMatrix = constructHadamard((int) Math.pow(2, n));

        // Print the Hadamard matrix
        for (int i = 0; i < hadamardMatrix.length; i++) {
            for (int j = 0; j < hadamardMatrix.length; j++) {
                System.out.print((hadamardMatrix[i][j] ? "T " : "F ") + " ");
            }
            System.out.println();
        }
    }

    private static boolean[][] constructHadamard(int size) {
        boolean[][] matrix = new boolean[size][size];

        if (size == 1) {
            matrix[0][0] = true;
        } else {
            boolean[][] smallerMatrix = constructHadamard(size / 2);

            // Fill the Hadamard matrix using Sylvester's construction
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (i < size / 2 && j < size / 2) { // Top-left quadrant
                        matrix[i][j] = smallerMatrix[i][j];
                    } else if (i < size / 2 && j >= size / 2) { // Top-right quadrant
                        matrix[i][j] = smallerMatrix[i][j - size / 2];
                    } else if (i >= size / 2 && j < size / 2) { // Bottom-left quadrant
                        matrix[i][j] = smallerMatrix[i - size / 2][j];
                    } else { // Bottom-right quadrant
                        matrix[i][j] = !smallerMatrix[i - size / 2][j - size / 2];
                    }
                }
            }
        }
        return matrix;
    }
        // Method to check if a number is a non-negative integer and a power of 2
        private static boolean isPowerOfTwo(int number) {
            return number >= 0 && (number & (number - 1)) == 0;
        }
}
