public class GeometricAndHarmonicMean {

    public static void main(String[] args) {
        double product = 1.0;
        double harmonicSum = 0.0;
        int count = 0;

        System.out.println("Enter positive floating-point numbers (Ctrl+D to end):");

        while (!StdIn.isEmpty()) {
            double number = StdIn.readDouble();
            if (number <= 0) {
                System.out.println("Only positive numbers are allowed. Please enter a positive number.");
                continue;
            }
            product *= number;
            harmonicSum += 1.0 / number;
            count++;
        }

        if (count == 0) {
            System.out.println("No valid input provided.");
            return;
        }

        double geometricMean = Math.pow(product, 1.0 / count);
        double harmonicMean = count / harmonicSum;

        System.out.println("Geometric Mean: " + geometricMean);
        System.out.println("Harmonic Mean: " + harmonicMean);
    }

}
