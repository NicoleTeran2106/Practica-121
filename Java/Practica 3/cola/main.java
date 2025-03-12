package cola;

public class main {

	public static void main(String[] args) {
        System.out.println("\n=== Prueba de Cola ===");
        Cola cola = new Cola(3);
        cola.insert(10);
        cola.insert(20);
        cola.insert(30);
        System.out.println("Elemento al frente: " + cola.peek());
        System.out.println("Sacando elemento: " + cola.remove());
        System.out.println("Elemento al frente: " + cola.peek());
        System.out.println("Cola vacía" + cola.isEmpty());
        System.out.println("Cola llena" + cola.isFull());
        System.out.println("Tamaño de la cola: " + cola.getSize());
    }
}