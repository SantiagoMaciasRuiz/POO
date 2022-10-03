package ejercicios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ejercicio40 {
    private JTextField textField1;
    private JPanel root;
    private JButton aceptarButton;

    public ejercicio40() {
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            double numbs;
            String numeros = textField1.getText();
            String lista[]= numeros.split(",");
            for(int i=0; i<lista.length;i++){
                numbs =Double.parseDouble(lista[i]);
                double raiz = Math.sqrt(numbs) ;
                double cuadrado = Math.pow(numbs,2);
                double cubo = Math.pow(numbs,3);
                JOptionPane.showMessageDialog(null,"Raiz:"+raiz+"\ncuadrado:"+cuadrado+"\ncubo:"+cubo);


            }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ejercicio40");
        frame.setContentPane(new ejercicio40().root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
