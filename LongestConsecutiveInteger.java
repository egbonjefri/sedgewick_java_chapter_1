
public class LongestConsecutiveInteger {
    public static void main(String[] args) {
        int longestRunLength = 0;
        int longestRunNumber = 0;
        int currentRunLength = 1;
        int currentRunNumber;

        if (!StdIn.isEmpty()) {
            currentRunNumber = StdIn.readInt();
            longestRunNumber = currentRunNumber;

            while (!StdIn.isEmpty()) {
                int nextNumber = StdIn.readInt();
                if (nextNumber == currentRunNumber) {
                    currentRunLength++;
                } else {
                    currentRunNumber = nextNumber;
                    currentRunLength = 1;
                }

                if (currentRunLength > longestRunLength) {
                    longestRunLength = currentRunLength;
                    longestRunNumber = currentRunNumber;
                }
            }

            System.out.println("Longest run: " + longestRunLength + " consecutive " + longestRunNumber + "s");
        } else {
            System.out.println("No input provided.");
        }
    }
}
