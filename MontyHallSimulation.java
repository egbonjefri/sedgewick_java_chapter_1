import java.util.Random;

public class MontyHallSimulation {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: MontyHallSimulation <number_of_simulations>");
            System.exit(1);
        }

        int n = Integer.parseInt(args[0]); // Number of simulations
        int switchWins = 0; // Counter for wins with switching
        int stayWins = 0; // Counter for wins without switching

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int carBehind = random.nextInt(3); // Randomly place the car behind one of the three doors
            int initialChoice = random.nextInt(3); // Randomly select a door initially

            // Monty opens one of the other two doors with a goat behind it
            /*
             * The loop continues to select a new door until the conditions are met, 
             * guaranteeing that Monty doesn't accidentally reveal the car or the 
             * initially chosen door.
             */
            int openedDoor;
            do {
                openedDoor = random.nextInt(3);
            } while (openedDoor == carBehind || openedDoor == initialChoice);

            // Decide whether to switch or stay
            int finalChoice;
            do {
                finalChoice = random.nextInt(3);
            } while (finalChoice == initialChoice || finalChoice == openedDoor);

            // Check if you won with or without switching
            if (finalChoice == carBehind) {
                if (initialChoice == finalChoice) {
                    stayWins++; // Win without switching
                } else {
                    switchWins++; // Win with switching
                }
            }
        }

        double switchWinPercentage = (double) switchWins / n * 100;
        double stayWinPercentage = (double) stayWins / n * 100;

        System.out.println("Simulated " + n + " games.");
        System.out.println("Chances of winning by switching: " + switchWinPercentage + "%");
        System.out.println("Chances of winning by staying: " + stayWinPercentage + "%");
    }
}
