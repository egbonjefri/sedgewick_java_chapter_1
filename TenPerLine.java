

public class TenPerLine {
    public static void main(String[] args) {
        int count = 0;

        while (!StdIn.isEmpty()) {
            int number = StdIn.readInt();
            StdOut.printf("%3d ", number);
            count++;

            if (count % 10 == 0) {
                StdOut.println();
            }
        }

        if (count % 10 != 0) {
            StdOut.println();
        }
    }
}
