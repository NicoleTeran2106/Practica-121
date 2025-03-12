package Area;

public class Area {
    public double area(double radio) {
        return Math.PI * radio * radio;
    }

    public double area(double base, double altura) {
        return base * altura;
    }

    public double area(int base, int altura) {
        return (base * altura) / 2.0;
    }

    public double area(double baseMayor, double baseMenor, double altura) {
        return ((baseMayor + baseMenor) * altura) / 2.0;
    }

    public double areaPoligono(int perimetro, int apotema) {
        return (perimetro * apotema) / 2.0;
    }

    public static void main(String[] args) {
        Area areaCalculator = new Area();

        System.out.println("area del circulo: " + areaCalculator.area(5.0)); 
        System.out.println("area del rectangulo: " + areaCalculator.area(4.0, 6.0)); // b=4, a=6
        System.out.println("area del triangulo: " + areaCalculator.area(4, 5)); // b=4, a=5
        System.out.println("area del trapecio: " + areaCalculator.area(5.0, 3.0, 4.0)); // b1= 5, b2 = 3, a= 4
        System.out.println("area del poligono: " + areaCalculator.areaPoligono(20, 5)); // pe=20, apt=5
    }
}