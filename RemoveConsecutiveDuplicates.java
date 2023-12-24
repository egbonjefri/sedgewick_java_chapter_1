
public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        if (!StdIn.isEmpty()) {
            int currentNumber = StdIn.readInt();
            System.out.print(currentNumber);

            while (!StdIn.isEmpty()) {
                int nextNumber = StdIn.readInt();
                if (nextNumber != currentNumber) {
                    currentNumber = nextNumber;
                    System.out.print(" " + currentNumber);
                }
            }
        } else {
            System.out.println("No input provided.");
        }
    }
}
