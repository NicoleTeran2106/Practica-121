package main;
public class main {
    public static void main(String[] args) {
        Punto p1 = new Punto(3, 4);
        System.out.println("Coordenadas: ");
        float[] cartesianas = p1.cartesiano();
        System.out.println("eje x = " + cartesianas[0] + " eje y  = " + cartesianas[1]);
        System.out.println("\nPolares: ");
        double[] polares = p1.polar();
        System.out.println("p1 = " + polares[0] + ", p2 = " + polares[1] + " rad");
    }
}
