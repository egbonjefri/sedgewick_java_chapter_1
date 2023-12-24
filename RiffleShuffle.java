import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class RiffleShuffle {

    private static final Random rand = new Random();
    private static final int NUM_CARDS = 52;

    // Function to simulate a coin flip
    private static boolean flipCoin() {
        return rand.nextBoolean();
    }

    // Function to get the number of heads in n flips
    private static int binomial(int n) {
        int heads = 0;
        for (int i = 0; i < n; i++) {
            if (flipCoin()) {
                heads++;
            }
        }
        return heads;
    }

    // Function to shuffle the deck using GSR model
    private static List<Integer> gsrShuffle(int n) {
        int r = binomial(n);
        List<Integer> firstPile = new ArrayList<>(r);
        List<Integer> secondPile = new ArrayList<>(n - r);

        for (int i = 0; i < r; i++) {
            firstPile.add(i);
        }
        for (int i = r; i < n; i++) {
            secondPile.add(i);
        }

        List<Integer> shuffledDeck = new ArrayList<>(n);
        while (!firstPile.isEmpty() || !secondPile.isEmpty()) {
            double prob = firstPile.size() / (double) (firstPile.size() + secondPile.size());
            if (!firstPile.isEmpty() && (secondPile.isEmpty() || rand.nextDouble() < prob)) {
                shuffledDeck.add(firstPile.remove(0));
            } else if (!secondPile.isEmpty()) {
                shuffledDeck.add(secondPile.remove(0));
            }
        }

        return shuffledDeck;
    }
    // Function to update card position tracking
    private static void updateCardPositions(Map<Integer, int[]> cardPositions, List<Integer> deck) {
        for (int position = 0; position < deck.size(); position++) {
            int card = deck.get(position);
            cardPositions.get(card)[position]++;
        }
    }

    // Function to check if the deck is uniformly shuffled
    private static boolean isUniformlyShuffled(Map<Integer, int[]> cardPositions, int shuffleCount) {
        double expectedCount = shuffleCount / (double) NUM_CARDS;

        for (int card = 0; card < NUM_CARDS; card++) {
            for (int position = 0; position < NUM_CARDS; position++) {
                double observedCount = cardPositions.get(card)[position];
                double deviation = Math.abs(observedCount - expectedCount);
                if (deviation > expectedCount * 0.05) { // Allowing 5% deviation
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Map<Integer, int[]> cardPositions = new HashMap<>();
        for (int i = 0; i < NUM_CARDS; i++) {
            cardPositions.put(i, new int[NUM_CARDS]);
        }

        int shuffleCount = 0;
        boolean isUniformlyShuffled = false;

        while (!isUniformlyShuffled) {
            List<Integer> deck = gsrShuffle(NUM_CARDS);
            shuffleCount++;
            updateCardPositions(cardPositions, deck);

            isUniformlyShuffled = isUniformlyShuffled(cardPositions, shuffleCount);
        }

        System.out.println("Number of shuffles needed: " + shuffleCount);
    }
}
          // Check if deck is nearly uniformly shuffled
          /*
           * 
    Determining if a deck is "uniformly shuffled" can be quite complex,especially in a computational sense. 
    For a truly uniform shuffle, every possible arrangement of the deck should be equally likely. 
    However, checking this condition directly is impractical due to the vast number of possible arrangements
     (52! for a standard deck, which is about 8.07×10^67 arrangements).
     Keep track of the positions of each card over a number of shuffles.
      If the deck becomes uniformly shuffled, each card should have an equal probability of 
      appearing in each position.
           */