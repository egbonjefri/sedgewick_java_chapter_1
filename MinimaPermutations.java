import java.util.Random;

public class MinimaPermutations {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java RandomPermutation <n>");
            return;
        }

        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        int[] permutation = new int[n];
        int[][] output = new int[n][n];
        Random random = new Random();

        // Initialize the permutation array
        for (int i = 0; i < n; i++) {
            permutation[i] = i + 1;
        }

        // Shuffle the array to create m random permutations
        for(int j = 0; j < m; j++){
        for (int i = 0; i < n; i++) {
            int r = i + random.nextInt(n - i);
            int temp = permutation[i];
            permutation[i] = permutation[r];
            permutation[r] = temp;
            output[j][i] = permutation[i];
        }
        // Count and print the number of left-to-right minima
        int countMinima = 0;
        int currentMin = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (permutation[i] < currentMin) {
                currentMin = permutation[i];
                countMinima++;
            }
        }

        System.out.println("Number of left-to-right minima: " + countMinima);
        }
        //Print the 2D output array
        for (int[] row : output) {
            for (int column : row) {
                System.out.print(" "+column);
            }
                 System.out.println();
        }
    }
}
