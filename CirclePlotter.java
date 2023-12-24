
public class CirclePlotter {

    public static void main(String[] args) {
        // Check for the correct number of command-line arguments
        if (args.length != 2) {
            System.out.println("Usage: java CirclePlotter <n> <p>");
            System.exit(1);
        }

        // Parse command-line arguments
        int n = Integer.parseInt(args[0]);
        double p = Double.parseDouble(args[1]);

        // Set up the canvas
        StdDraw.setScale(-1.5, 1.5);
      //  StdDraw.circle(0, 0, 1);

        // Generate n equally spaced points on the circumference of a circle
        double[] x = new double[n];
        double[] y = new double[n];
        for (int i = 0; i < n; i++) {
            double theta = 2 * Math.PI * i / n;
            x[i] = Math.cos(theta);
            y[i] = Math.sin(theta);
                    // Plot the circle points
            StdDraw.setPenRadius(0.02);
            StdDraw.point( x[i], y[i]);
        }



        // Draw lines with probability p for each pair of points
        StdDraw.setPenRadius(0.005);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.random() < p) {
                    StdDraw.line(x[i], y[i], x[j], y[j]);
                }
            }
        }
    }
}
