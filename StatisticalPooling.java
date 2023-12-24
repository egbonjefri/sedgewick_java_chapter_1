import java.util.Random;

public class StatisticalPooling {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java RandomVoterSampler <sampleSize>");
            return;
        }

        int sampleSize = Integer.parseInt(args[0]);

        // Read voters from standard input
        String[] voters = readVoters();

        // Ensure the sample size is not greater than the total number of voters
        if (sampleSize > voters.length) {
            System.out.println("Sample size cannot be greater than the total number of voters.");
            return;
        }

        // Randomly sample voters
        String[] sampledVoters = getRandomSample(voters, sampleSize);

        // Print the sampled voters
        for (String voter : sampledVoters) {
            System.out.println(voter);
        }
    }

    private static String[] readVoters() {
        // Read voters from standard input
        String[] voters = StdIn.readAllLines();
        return voters;
    }

    private static String[] getRandomSample(String[] voters, int sampleSize) {
        String[] sampledVoters = new String[sampleSize];
        Random random = new Random();

        // Create an array of indices
        int[] indices = new int[voters.length];
        for (int i = 0; i < voters.length; i++) {
            indices[i] = i;
        }

        // Randomly shuffle the indices
        for (int i = indices.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = indices[i];
            indices[i] = indices[j];
            indices[j] = temp;
        }

        // Take the first 'sampleSize' elements
        for (int i = 0; i < sampleSize; i++) {
            sampledVoters[i] = voters[indices[i]];
        }

        return sampledVoters;
    }
}
