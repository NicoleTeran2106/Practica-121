import javax.swing.*;
import java.awt.*;
class Punto {
    public float x;
    public float y;
    public Punto(float x, float y){
        this.x = x;
        this.y = y;
    }
} 
class Circulo extends JPanel {
    Punto centro;
    int radio;
    public Circulo(Punto centro, int radio) {
        this.centro = centro;
        this.radio = radio;
        setPreferredSize(new Dimension(400, 400));
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawOval((int)(centro.x*10), (int)(centro.y*10), 2 * radio * 10, 2 * radio * 10);
    }
    public void dibujaCirculo() {
        JFrame frame = new JFrame("Dibujar Círculo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.pack();
        frame.setVisible(true);
    }
}
public class DibujoCirculo{
    public static void main(String[] args) {
        Punto centro = new Punto(5.0f, 5.0f);
        int radio = 10;
        Circulo circulo = new Circulo(centro, radio);
        circulo.dibujaCirculo();
    }
}
