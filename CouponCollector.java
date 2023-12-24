public class CouponCollector {

    // Function to calculate the nth harmonic number
    private static double harmonicNumber(int n) {
        double harmonic = 0;
        for (int i = 1; i <= n; i++) {
            harmonic += 1.0 / i;
        }
        return harmonic;
    }

    // Function to simulate the coupon collector's experiment
    private static int collectCoupons(int n) {
        boolean[] collected = new boolean[n];
        int count = 0, distinct = 0;

        while (distinct < n) {
            int coupon = (int) (Math.random() * n); // Random coupon
            count++;
            if (!collected[coupon]) {
                distinct++;
                collected[coupon] = true;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 1000; // Number of different coupons
        int trials = 10000; // Number of trials to run

        double expectedCoupons = n * harmonicNumber(n);
        double totalCoupons = 0;

        for (int i = 0; i < trials; i++) {
            totalCoupons += collectCoupons(n);
        }

        double averageCoupons = totalCoupons / trials;

        System.out.println("Expected number of coupons (n * Hn): " + expectedCoupons);
        System.out.println("Average number of coupons collected in " + trials + " trials: " + averageCoupons);
    }
}
