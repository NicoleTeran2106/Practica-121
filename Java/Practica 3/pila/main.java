package pila;

public class main {

	public static void main(String[] args) {
        System.out.println("=== Prueba de Pila ===");
        Pila pila = new Pila(3);
        pila.push(10);
        pila.push(20);
        pila.push(30);
        System.out.println("Elemento en la cima: " + pila.peek());
        System.out.println("Sacando elemento: " + pila.pop());
        System.out.println("Elemento en la cima: " + pila.peek());
        System.out.println("¿Pila vacía? " + pila.isEmpty());
        System.out.println("¿Pila llena? " + pila.isFull());
    }
}
