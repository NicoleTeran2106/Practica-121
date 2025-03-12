package cola;

public class Cola {
    private long[] arreglo;
    private int inicio;
    private int fin;
    private int n;
    private int size;
    public Cola(int n) {
        this.n = n;
        this.arreglo = new long[n];
        this.inicio = 0;
        this.fin = -1;
        this.size = 0;
    }
    public void insert(long e) {
        if (!isFull()) {
            fin = (fin + 1) % n;
            arreglo[fin] = e;
            size++;
        } else {
            System.out.println("La cola está llena.");
        }
    }
    public long remove() {
        if (!isEmpty()) {
            long elemento = arreglo[inicio];
            inicio = (inicio + 1) % n;
            size--;
            return elemento;
        } else {
            System.out.println("La cola está vacía.");
            return -1;
        }
    }
    public long peek() {
        if (!isEmpty()) {
            return arreglo[inicio];
        }
        return -1;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == n;
    }
    public int getSize() {
        return size;
    }
}
