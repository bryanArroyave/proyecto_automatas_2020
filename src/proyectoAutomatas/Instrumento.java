package proyectoAutomatas;

import java.applet.AudioClip;
import java.awt.Font;
import java.text.DecimalFormat;
import java.util.HashMap;
import javax.swing.JComboBox;

import javax.swing.JOptionPane;

public class Instrumento {

    public String instrumento;
    int numeroEstados;
    int numeroTrancisiones;
    int posibilidades;
    int regla;

    JComboBox[] Campos;
    public HashMap<Integer, String> conversorNota;
    public HashMap<String, String> mapRegla;
    public String[] Matriz;
    public String[] d;
    public String vectorInicial;
    public String vectorRegla;

    public AudioClip[] Sonando;
    public String notaActual = "NA";

    public Instrumento(String instrumento, int numeroEstados, int numeroTrancisiones, int posibilidades) {
        this.instrumento = instrumento;
        this.numeroEstados = numeroEstados;
        this.numeroTrancisiones = numeroTrancisiones;
        this.posibilidades = posibilidades;
        this.Campos = new JComboBox[this.numeroTrancisiones];
        this.llenarSonando();
        this.CrearVectorTexto();
    }

    public JComboBox[] getCampos() {
        return Campos;
    }

    public void setCampos(JComboBox[] Campos) {

        this.Campos = Campos;
        calcularVectorInicial();

    }

    public void llenarSonando() {
        Sonando = new AudioClip[10];

        conversorNota = new HashMap<>();
        conversorNota.put(0, "do");
        conversorNota.put(1, "do");
        conversorNota.put(2, "re");
        conversorNota.put(3, "mi");
        conversorNota.put(4, "fa");
        conversorNota.put(5, "sol");
        conversorNota.put(6, "la");
        conversorNota.put(7, "si");
        conversorNota.put(8, "do");
        conversorNota.put(9, "do");
        try {
            Sonando[0] = java.applet.Applet.newAudioClip(getClass().getResource("/Musica/" + instrumento + "/" + "_do" + ".wav"));
            Sonando[1] = java.applet.Applet.newAudioClip(getClass().getResource("/Musica/" + instrumento + "/" + "_do" + ".wav"));
            Sonando[2] = java.applet.Applet.newAudioClip(getClass().getResource("/Musica/" + instrumento + "/" + "_re" + ".wav"));
            Sonando[3] = java.applet.Applet.newAudioClip(getClass().getResource("/Musica/" + instrumento + "/" + "_mi" + ".wav"));
            Sonando[4] = java.applet.Applet.newAudioClip(getClass().getResource("/Musica/" + instrumento + "/" + "_fa" + ".wav"));
            Sonando[5] = java.applet.Applet.newAudioClip(getClass().getResource("/Musica/" + instrumento + "/" + "_sol" + ".wav"));
            Sonando[6] = java.applet.Applet.newAudioClip(getClass().getResource("/Musica/" + instrumento + "/" + "_la" + ".wav"));
            Sonando[7] = java.applet.Applet.newAudioClip(getClass().getResource("/Musica/" + instrumento + "/" + "_si" + ".wav"));
            Sonando[8] = java.applet.Applet.newAudioClip(getClass().getResource("/Musica/" + instrumento + "/" + "_do" + ".wav"));
            Sonando[9] = java.applet.Applet.newAudioClip(getClass().getResource("/Musica/" + instrumento + "/" + "_do" + ".wav"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no se encontro el instrumento " + instrumento);
        }
    }

    public void recorrerD() {
        String reglaBase = convertirReglaBase();

        mapRegla = new HashMap<>();
        for (int i = 0; i < d.length; i++) {
            mapRegla.put(d[i], String.valueOf(reglaBase.charAt(i)));
        }
    }

    public void actualizarNota(int actual) {
        notaActual = conversorNota.get(actual);
        System.out.println("actual " + actual + " cambia a " + notaActual);

    }

    public void CrearVectorTexto() {

        for (int i = 0; i < Campos.length; i++) {

            Campos[i] = new JComboBox();
            for (int j = 0; j < this.numeroEstados; j++) {
                Campos[i].addItem(j);
            }
            Campos[i].setFont(new Font("Arial", 0, 14));
            Campos[i].setBounds((53 * i), 0, 50, 30);
            Campos[i].setVisible(true);
        }

    }

    public void calcularVectorInicial() {

        //saca los primero 4 digitos
        String primeros = "", ultimos = "";
        vectorInicial = "";
        Matriz = new String[Campos.length];

        for (int i = 0; i < Campos.length; i++) {

            if (i < 4) {
                primeros += String.valueOf(Campos[i].getSelectedItem());
                ultimos = String.valueOf(Campos[Campos.length - 1 - i].getSelectedItem()) + ultimos;
            }
            vectorInicial += String.valueOf(Campos[i].getSelectedItem());
        }
        llenarInicial();
        vectorRegla = primeros + ultimos;
    }

    public void llenarInicial() {
        for (int i = 0; i < Matriz.length; i++) {
            if (i == 0) {
                Matriz[i] = vectorInicial;
            } else {
                String cad = "";
                for (int j = 0; j < vectorInicial.length(); j++) {
                    cad += "0";
                }
                Matriz[i] = cad;
            }
        }

    }

    public void setRegla(int regla) {

        this.regla = regla;
    }

    public String toString() {

        return "instumento: " + instrumento
                + "\nnumeroEstados: " + numeroEstados
                + "\nnumeroTrancisiones: " + numeroTrancisiones
                + "\nposibilidades: " + posibilidades
                + "\nregla: " + regla;
    }

    private String calcularFormato() {
        String cad = "";
        for (int i = 0; i < d.length; i++) {
            cad += "0";
        }
        return cad;
    }

    public String convertirReglaBase() {
        String formatoDeseado = calcularFormato();
        String formato8 = "00000000";
        DecimalFormat formateador = new DecimalFormat(formato8);
        String digitos[] = new String[numeroEstados];

        for (int i = 0; i < numeroEstados; i++) {
            digitos[i] = String.valueOf(i);
        }

        String baseNueva = "";
        int resto, aux = regla;

        while (aux > 0) {
            resto = aux % numeroEstados;
            baseNueva = digitos[resto] + baseNueva;
            aux /= numeroEstados;
        }
        String cad = "";
        int cont = 0;

        baseNueva = formateador.format(Integer.parseInt(baseNueva));
        if (numeroEstados > 2) {
            for (int i = 0; i < calcularFormato().length() - 8; i++) {
                if (cont == 8) {
                    cont = 0;
                }
                cad += baseNueva.charAt(cont);

                cont++;
            }
        }

        baseNueva = cad + baseNueva;

        return regla == 0 ? formatoDeseado : baseNueva;

    }

}
