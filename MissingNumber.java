
public class MissingNumber {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide an integer argument n.");
            return;
        }

        int n = Integer.parseInt(args[0]);
        int sumOfNNumbers = n * (n + 1) / 2;
        int sumOfInputNumbers = 0;

        System.out.println("Enter " + (n - 1) + " distinct integers between 1 and " + n + ":");
        for (int i = 0; i < n - 1; i++) {
            sumOfInputNumbers += StdIn.readInt();
        }

        int missingNumber = sumOfNNumbers - sumOfInputNumbers;
        System.out.println("The missing number is: " + missingNumber);
    }
}
