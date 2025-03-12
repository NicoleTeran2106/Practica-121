package Area;
public class Main {
    public static void main(String[] args) {
        Area calc = new Area();
        System.out.println("area del circulo: " + calc.area(5)); 
        System.out.println("area del rectangulo: " + calc.area(4.0, 6.0));
        System.out.println("area del triangulo: " + calc.area(3, 8));
        System.out.println("area del trapecio: " + calc.area(4.0, 6.0, 5.0));
        System.out.println("area del poligono: " + calc.area(4, 6));
    }
}
