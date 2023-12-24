public class CentroidCalculator {
    public static void main(String[] args) {
        double totalMass = 0;
        double totalWeightedX = 0;
        double totalWeightedY = 0;

        // Input positions and masses for each object
        while (!StdIn.isEmpty()) {
            double mass = StdIn.readDouble();
            double x = StdIn.readDouble();
            double y = StdIn.readDouble();

            // Update total mass and weighted coordinates
            totalMass += mass;
            totalWeightedX += mass * x;
            totalWeightedY += mass * y;
        }

        // Calculate the centroid
        double centroidX = totalWeightedX / totalMass;
        double centroidY = totalWeightedY / totalMass;

        // Print the centroid
        System.out.printf("Centroid: (%.2f, %.2f)%n", centroidX, centroidY);
    }
}


// java RandomMassPositionGenerator 5 | java CentroidCalculator