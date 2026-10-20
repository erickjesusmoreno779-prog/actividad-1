/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edadfecha;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author erick
 */
public class edadfecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Formulario f = new Formulario();
        f.setVisible(true); 
    }
}

class Formulario extends JFrame {
    private JTextField txtescfecha;
    private JTextField txtres;
    private JLabel lbltit1;
    private JLabel lbltit2;
    private JLabel lbltit3;
    private JButton btncal;
    private JButton btnlimp;

    public Formulario() {
        Container panel = this.getContentPane();
        panel.setLayout(null);
        this.setBounds(100, 100, 600, 480);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lbltit1 = new JLabel("Ingresa tu fecha de nacimiento: ");
        lbltit1.setBounds(10, 40, 200, 30);
        panel.add(lbltit1);
        
        lbltit3 = new JLabel("EJEMPLO DD/MM/AAAA ");
        lbltit3.setBounds(10, 80, 200, 30);
        panel.add(lbltit3);
        
        txtescfecha = new JTextField();
        txtescfecha.setBounds(210, 40, 100, 30);
        panel.add(txtescfecha);
        
        lbltit2 = new JLabel("Tienes los siguientes años y meses:");
        lbltit2.setBounds(10, 120, 220, 30);
        panel.add(lbltit2);
        
        txtres = new JTextField();
        txtres.setBounds(230, 120, 200, 30);
        txtres.setEditable(false); // Para evitar modificaciones manuales en el resultado
        panel.add(txtres);
        
        btncal = new JButton("Calcular");
        btncal.setBounds(10, 200, 100, 30);
        panel.add(btncal);
        
        btnlimp = new JButton("Limpiar");
        btnlimp.setBounds(220, 200, 100, 30);
        panel.add(btnlimp);
        
        btncal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String textoFecha = txtescfecha.getText().trim();
                    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate fechaNacimiento = LocalDate.parse(textoFecha, formato);
                    LocalDate fechaActual = LocalDate.now();

                    if (fechaNacimiento.isAfter(fechaActual)) {
                        JOptionPane.showMessageDialog(null, "La fecha de nacimiento no puede ser posterior a la fecha actual.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    Period periodo = Period.between(fechaNacimiento, fechaActual);
                    int anios = periodo.getYears();
                    int meses = periodo.getMonths();

                    // Construcción dinámica de la respuesta
                    String resultado = anios + (anios == 1 ? " año y " : " años y ") 
                                     + meses + (meses == 1 ? " mes" : " meses");

                    txtres.setText(resultado);
                } catch (DateTimeParseException ex) {
                    JOptionPane.showMessageDialog(null, "Ingresa una fecha válida con formato DD/MM/AAAA", "Formato incorrecto", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        btnlimp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtescfecha.setText("");
                txtres.setText("");
                txtescfecha.requestFocus();
            }
        });
    }
}