public class Checkerboard {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Checkerboard <n>");
            return;
        }

        int n = Integer.parseInt(args[0]);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("* "); // Print asterisk for even positions
                } else {
                    System.out.print("  "); // Print space for odd positions
                }
            }
            System.out.println(); // Move to the next row
        }
    }
}
