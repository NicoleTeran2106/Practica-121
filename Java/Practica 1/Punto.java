package main;
public class Punto {
    public float x;
    public float y;
    public Punto(float a, float b) {
        x = a;
        y = b;
    }
    public float[] cartesiano() {
        return new float[]{x, y};
    }
    public double[] polar() {
        double r = Math.sqrt(x * x + y * y);
        double theta = Math.atan2(y, x);
        return new double[]{r, theta};
    }
    public String toString() {
        return "Punto(" + x + ", " + y + ")";
    }
}