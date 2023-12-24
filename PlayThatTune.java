public class PlayThatTune {
    public static void main(String[] args) {
        int SAMPLING_RATE = 44100;

        double volume = 0.05;
        double tempo = 2.0;

        if (args.length >= 2) {
            volume = Double.parseDouble(args[0]);
            tempo = Double.parseDouble(args[1]);
        }
        // Set up the canvas for visualization
        StdDraw.setXscale(0, 10 * Math.PI);
        StdDraw.setYscale(-1.0, 1.0);

        while (!StdIn.isEmpty()) {
            // Read and play one note.
            int pitch = StdIn.readInt();
            double duration = StdIn.readDouble();

            double hz = 440 * Math.pow(2, pitch / 12.0);
            // multiply each note’s duration by the tempo
            int n = (int) (SAMPLING_RATE * (duration * tempo));
            double[] a = new double[n + 1];
            StdDraw.clear();
            StdDraw.enableDoubleBuffering();
            for (int i = 0; i <= n; i++) {
                // multiply each sample value by the volume
                a[i] = volume * Math.sin(2 * Math.PI * i * hz / SAMPLING_RATE);
                // Plot the sound wave on the canvas
                double x = 2 * Math.PI * i * hz / SAMPLING_RATE;

                StdDraw.setPenRadius(0.01);
                StdDraw.point(x, a[i]*5.0);
            }
           StdDraw.show();
           StdAudio.play(a);
        }
    }
}
