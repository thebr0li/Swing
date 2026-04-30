import javax.swing.JFrame;

/**
 * Ejemplo 1: Ventana base con JFrame
 * Programación Avanzada - UDA
 */
public class EjemploJFrame {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Mi Primera Ventana Swing");

        // tamaño
        ventana.setSize(400, 300);

        // centrar en pantalla
        ventana.setLocationRelativeTo(null);

        // cerrar aplicación al cerrar la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Hacer visible
        ventana.setVisible(true);
    }
}