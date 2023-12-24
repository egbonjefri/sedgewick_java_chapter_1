public class BinomialDistribution {

    public static void main(String[] args) {
        // Get the command-line argument for the number of coin flips
        int n = Integer.parseInt(args[0]);

        // Create a ragged array for the binomial coefficients
        long[][] a = new long[n+1][];

        // Initialize the array
        for (int i = 0; i <= n; i++) {
            a[i] = new long[i + 1];
            a[i][0] = 1;
        }

        // Compute the binomial coefficients
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k < i; k++) {
                a[i][k] = a[i - 1][k - 1] + a[i - 1][k];
            }
            a[i][i] = 1;
        }

        // Print the binomial distribution as fractions
        for (int i = 0; i <= n; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.printf("%d/%d ", a[i][k], (1 << i));
            }
            System.out.println();
        }
    }
}

/*
 * In binary arithmetic, 1 << i is equivalent to raising 2 to the power of i. 
 * This is because shifting a 1 bit to the left i times in binary is the same as multiplying by 2, i times. 
 * Thus, 1 << i calculates 2^i. In the context of the binomial distribution, 2^i is the total number of outcomes 
 * when flipping a coin i times.
 */