package GUI;

import Logica.Automata;
import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JPanel;

public class PanelDibujo extends JPanel implements Runnable {

    public static Color COLOR_0 = new Color(125, 125, 125);//gris
    public static Color COLOR_1 = new Color(46, 217, 71);//verde
    public static Color COLOR_2 = new Color(237, 7, 38);//rojo
    public static Color COLOR_3 = new Color(86, 137, 219);//Azul
    public static Color COLOR_4 = new Color(212, 230, 18);//amarillo

    public boolean run = false;
    public boolean pintar = false;
    ColorRGB color;
    public int time;

    public PanelDibujo() {

        setBackground(Color.CYAN);
        new Thread(this).start();
        color = ColorRGB.aleatorio();
    }

    Automata instrumento;
    int iterador = 0;

    public void cambiarSecuencia() {

        if (iterador == instrumento.Matriz.length) {
            iterador = 0;
        }
        for (int i = 0; i < instrumento.Matriz.length; i++) {
            String vecinos = vecinos(iterador, i);
        }

    }

    public void run2() {
        String[] M = instrumento.Matriz;
        String nueva = "";
        if (iterador == M.length - 1) {
            M[0] = M[M.length - 1];
            iterador = 0;
        }

        for (int i = 0; i < M.length; i++) {

            nueva += instrumento.mapRegla.get(vecinos(iterador, i));
            // System.out.println("cambia: " + vecinos(iterador, i) + " a " + instrumento.mapRegla.get(vecinos(iterador, i)));
        }
        //  System.out.println("final " + nueva);
        M[iterador + 1] = nueva;
        iterador++;

    }

    public String vecinos(int i, int j) {

        String anterior = "";
        String siguiente = "";

        if (j == 0) {
            anterior = instrumento.Matriz[i].charAt(instrumento.Matriz.length - 1) + "";
            siguiente = instrumento.Matriz[i].charAt(1) + "";
        } else if (j == instrumento.Matriz.length - 1) {
            anterior = instrumento.Matriz[i].charAt(instrumento.Matriz.length - 2) + "";
            siguiente = instrumento.Matriz[i].charAt(0) + "";

        } else {
            anterior = instrumento.Matriz[i].charAt(j - 1) + "";
            siguiente = instrumento.Matriz[i].charAt(j + 1) + "";
        }

        return anterior + instrumento.Matriz[i].charAt(j) + siguiente;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color.Retornarse());
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        g.setColor(Color.black);
        if (instrumento != null) {

            for (int j = 0; j < instrumento.Matriz.length; j++) {

                for (int i = 0; i < instrumento.Matriz[j].length(); i++) {
                    char caracter = instrumento.Matriz[j].charAt(i);

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

        if (run && pintar) {
            pintar = false;
            run2();
        }

        repaint();
    }

    @Override
    public void run() {
        while (true) {

            try {
                Thread.sleep(time);
                pintar = true;
            } catch (InterruptedException ex) {

            }
        }
    }
}
