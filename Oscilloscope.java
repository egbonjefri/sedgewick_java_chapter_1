public class Oscilloscope {

    
        public static void main(String[] args) {
            // Parse command-line arguments
            double Ax = Double.parseDouble(args[0]);
            double wx = Double.parseDouble(args[1]);
            double phix = Double.parseDouble(args[2]);
            double Ay = Double.parseDouble(args[3]);
            double wy = Double.parseDouble(args[4]);
            double phiy = Double.parseDouble(args[5]);
    
            // Setup StdDraw
            StdDraw.setCanvasSize(800, 800);
            StdDraw.setXscale(-1.1 * Ax, 1.1 * Ax);
            StdDraw.setYscale(-1.1 * Ay, 1.1 * Ay);
            StdDraw.setPenRadius(0.005);
    
            // Draw the Lissajous pattern
            for (double t = 0.0; t <= 100; t += 0.01) {
                double x = Ax * Math.sin(wx * t + phix);
                double y = Ay * Math.sin(wy * t + phiy);
                StdDraw.point(x, y);
            }
        }
    }
     
