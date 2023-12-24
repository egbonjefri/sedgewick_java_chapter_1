public class MercatorProjection {
    public static void main(String[] args) {
        // Check if three command-line arguments are provided
        if (args.length != 3) {
            System.out.println("Usage: java MercatorProjection <center_longitude> <latitude> <longitude>");
            System.exit(1);
        }

        // Parse command-line arguments
        double centerLongitude = Double.parseDouble(args[0]);
        double latitude = Math.toRadians(Double.parseDouble(args[1]));  // Convert to radians
        double longitude = Math.toRadians(Double.parseDouble(args[2])); // Convert to radians

        // Calculate Mercator projection coordinates
        double x = longitude - Math.toRadians(centerLongitude);
        double y = 0.5 * Math.log((1 + Math.sin(latitude)) / (1 - Math.sin(latitude)));

        // Print the Mercator projection coordinates
        System.out.printf("Mercator Projection Coordinates (x, y): (%.6f, %.6f)\n", x, y);
    }
}
