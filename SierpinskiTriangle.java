import java.util.Random;

public class SierpinskiTriangle {
    public static void main(String[] args) {
        // Set up the drawing canvas
        StdDraw.setScale(0, 1);
        StdDraw.setPenRadius(0.001);

        // Define the vertices of the triangle
        double[] x = {0.5, 0.0, 1.0};
        double[] y = {0.0, 1.0, 1.0};

        // Draw the initial triangle
        StdDraw.point(x[0], y[0]);
        StdDraw.point(x[1], y[1]);
        StdDraw.point(x[2], y[2]);

        // Choose an initial point
        double px = 0.5;
        double py = Math.sqrt(3) / 4;

        Random random = new Random();
        int iterations = 50000;

        // Draw the Sierpinski triangle using the chaos game method
        for (int i = 0; i < iterations; i++) {
            int r = random.nextInt(3);
            px = (px + x[r]) / 2;
            py = (py + y[r]) / 2;
            StdDraw.point(px, py);
        }
    }
}
