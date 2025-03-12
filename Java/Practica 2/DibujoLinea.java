import javax.swing.*;
import java.awt.*;
class Punto {
    float x;
    float y;
    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }
}
class Linea extends JPanel {
    Punto p1, p2;
    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
        setPreferredSize(new Dimension(400, 400));
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawLine((int)(p1.x*10), (int)(p1.y*10), (int)(p2.x*10), (int)(p2.y*10));
    }
    public void dibujaLinea() {
        JFrame frame = new JFrame("Dibujar Línea");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.pack();
        frame.setVisible(true);
    }
}
public class DibujoLinea{
    public static void main(String[] args) {
        Punto p1 = new Punto(25.0f, 25.0f);
        Punto p2 = new Punto(3.0f, 3.0f);
        Linea linea = new Linea(p1, p2);
        linea.dibujaLinea();
    }
}
