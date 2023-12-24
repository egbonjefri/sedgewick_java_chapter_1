import java.util.Scanner;

public class RandomWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String champion = ""; // The current champion word
        int i = 0; // Counter for the number of words read

        while (scanner.hasNext()) {
            String word = scanner.next();
            i++;

            // Use Knuth's method to select the word as the champion with probability 1/i
            if (Math.random() < 1.0 / i) {
                champion = word;
            }
        }

        scanner.close();

        // Print the surviving champion word
        System.out.println("The randomly selected word is: " + champion);
    }
}
/*
 * The Knuth method
 * Start with an array of elements to be shuffled.
 * Begin from the last element in the array (index n-1).
 * Generate a random integer between 0 and the current index (inclusive).
 * Swap the element at the current index with the element at the randomly generated index.
 * Decrement the index and repeat steps 3-5 until reaching the first element (index 0).
*/
