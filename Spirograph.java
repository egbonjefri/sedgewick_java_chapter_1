
public class Spirograph {

    public static void main(String[] args) {
        // Read command-line arguments
        double R = Double.parseDouble(args[0]); // Radius of the fixed circle
        double r = Double.parseDouble(args[1]); // Radius of the rolling circle
        double a = Double.parseDouble(args[2]); // Pen offset from the center of the rolling circle

        // Set up drawing canvas
        StdDraw.setCanvasSize(800, 800);
        StdDraw.setXscale(-R - r - a, R + r + a);
        StdDraw.setYscale(-R - r - a, R + r + a);
        StdDraw.setPenRadius(0.005);

        // Draw the spirograph
        for (double t = 0.0; t <= 360.0; t += 0.1) {
            double tRadians = Math.toRadians(t);
            double x = (R + r) * Math.cos(tRadians) - (r + a) * Math.cos(((R + r) / r) * tRadians);
            double y = (R + r) * Math.sin(tRadians) - (r + a) * Math.sin(((R + r) / r) * tRadians);
            StdDraw.point(x, y);
        }
    }
}
