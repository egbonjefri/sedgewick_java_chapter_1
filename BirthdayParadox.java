import java.util.Random;
import java.util.HashSet;

public class BirthdayParadox {
    public static void main(String[] args) {
        int trials = 10000;  // Number of experiments to run
        Random random = new Random();
        int totalPeople = 0;

        for (int t = 0; t < trials; t++) {
            HashSet<Integer> birthdays = new HashSet<>();
            int people = 0;
            while (true) {
                int birthday = random.nextInt(365);  // Assign a random birthday
                people++;
                if (!birthdays.add(birthday)) {  // Check for a shared birthday
                    break;
                }
            }
            totalPeople += people;
        }

        double average = (double) totalPeople / trials;
        System.out.println("Average number of people needed: " + average);
    }
}
