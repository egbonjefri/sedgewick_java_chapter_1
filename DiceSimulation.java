import java.util.Random;

public class DiceSimulation {
    public static void main(String[] args) {
        int numSimulations = 1000000; // Number of simulations
        int numRolls = 6; // Number of rolls for the first scenario
        int numRollsTwice = 12; // Number of rolls for the second scenario
        int countAtLeastOnce = 0; // Counter for at least one 1
        int countAtLeastTwice = 0; // Counter for at least two 1s

        Random random = new Random();

        for (int i = 0; i < numSimulations; i++) {
            int onesCount = 0;
            int onesCountTwice = 0;

            // Simulate rolling a die 'numRolls' times
            for (int j = 0; j < numRolls; j++) {
                int roll = random.nextInt(6) + 1; // Simulate a die roll (1 to 6)
                if (roll == 1) {
                    onesCount++;
                }
            }

            // Simulate rolling a die 'numRollsTwice' times
            for (int j = 0; j < numRollsTwice; j++) {
                int roll = random.nextInt(6) + 1;
                if (roll == 1) {
                    onesCountTwice++;
                }
            }

            // Check for at least one 1 in the first scenario
            if (onesCount > 0) {
                countAtLeastOnce++;
            }

            // Check for at least two 1s in the second scenario
            if (onesCountTwice >= 2) {
                countAtLeastTwice++;
            }
        }

        double probabilityAtLeastOnce = (double) countAtLeastOnce / numSimulations;
        double probabilityAtLeastTwice = (double) countAtLeastTwice / numSimulations;

        System.out.println("Probability of getting at least one 1 in " + numRolls + " rolls: " + probabilityAtLeastOnce);
        System.out.println("Probability of getting at least two 1s in " + numRollsTwice + " rolls: " + probabilityAtLeastTwice);
    }
}
