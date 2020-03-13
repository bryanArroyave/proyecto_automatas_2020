package Logica;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class Automata {
    
    String instrumento;
    int numeroEstados;
    int numeroTrancisiones;
    int posibilidades;
    int regla;
    JComboBox[] Campos;
    
    public Automata(String instrumento, int numeroEstados, int numeroTrancisiones, int posibilidades) {
        this.instrumento = instrumento;
        this.numeroEstados = numeroEstados;
        this.numeroTrancisiones = numeroTrancisiones;
        this.posibilidades = posibilidades;
        this.Campos = new JComboBox[this.numeroTrancisiones];
        
        this.CrearVectorTexto();
    }
    
    public JComboBox[] getCampos() {
        return Campos;
    }
    
    public void setCampos(JComboBox[] Campos) {
        
        this.Campos = Campos;
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
    
}
