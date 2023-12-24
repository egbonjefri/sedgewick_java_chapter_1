public class RelativelyPrime {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java RelativelyPrime <n>");
            return;
        }

        int n = Integer.parseInt(args[0]);

        // Print the table header
        System.out.print("  ");
        for (int j = 0; j < n; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        // Print the table rows
        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        //check the gcd for each row and column
            for (int j = 0; j < n; j++) {
                if (gcd(i, j) == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Function to calculate the greatest common divisor (GCD) of two numbers
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}