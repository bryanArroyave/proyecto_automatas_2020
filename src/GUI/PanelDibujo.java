package GUI;

import Logica.Automata;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelDibujo extends JPanel {

    public static Color COLOR_0 = new Color(125, 125, 125);//gris
    public static Color COLOR_1 = new Color(46, 217, 71);//verde
    public static Color COLOR_2 = new Color(237, 7, 38);//rojo
    public static Color COLOR_3 = new Color(86, 137, 219);//Azul
    public static Color COLOR_4 = new Color(212, 230, 18);//amarillo

    public PanelDibujo() {

        setBackground(Color.CYAN);
    }

    Automata instrumento;

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (instrumento != null) {

            for (int j = 0; j < instrumento.vectorInicial.length(); j++) {

                for (int i = 0; i < instrumento.vectorInicial.length(); i++) {
                    char caracter = instrumento.vectorInicial.charAt(i);

                    switch (caracter) {
                        case '0':
                            g.setColor(COLOR_0);
                            break;
                        case '1':
                            g.setColor(COLOR_1);
                            break;
                        case '2':
                            g.setColor(COLOR_2);
                            break;
                        case '3':
                            g.setColor(COLOR_3);
                            break;
                        case '4':
                            g.setColor(COLOR_4);
                            break;

                    }
                    g.fillRect(i * 20 + 10, j * 20 + 10, 20, 20);
                    g.setColor(Color.BLACK);
                    g.drawRect(i * 20 + 10, j * 20 + 10, 20, 20);

                }
            }
        } else {

        }

        repaint();
    }

    /*  public void pintarMatriz(Graphics g, int[][] A, int xinicial, int yinicial, Color color) {
        g.setColor(color);
        for (int i = 0; i < A.length; i++) {

            for (int j = 0; j < A[i].length; j++) {
                for (int k = 0; k < ReglaAudio.length; k++) {
                    if (ReglaAudio[k] == j) {
                        g.setFont(new Font("Arial", 0, 8));
                        g.setColor(Color.black);
                        g.drawString(j + "", xinicial + (8 * j), 100);
                    }
                }
                g.setFont(new Font("Arial", 0, 18));
                if (true) {
                    if (A[i][j] == 1) {
                        g.setColor(Color.black);

                    } else {
                        g.setColor(Color.white);
                    }
                } else {
                    g.setColor(ColorMatriz[A[i][j]]);
                }

                g.drawString("■", xinicial + (j * 8), yinicial + (8 * i));

            }

        }

    }*/
}
