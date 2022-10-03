package ejercicios;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ejercicio41 {
    private JTextField textField1;
    private JButton aceptarButton;
    private JTextField textField2;
    private JPanel root;
    private JButton CALCULARButton;

    public ejercicio41() {
        CALCULARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            double numbs;
            double max=-6789;
            String numeros = textField1.getText();
            String lista[]= numeros.split(",");
            for(int i=0; i<lista.length;i++){
                numbs =Double.parseDouble(lista[i]);
                if(numbs>max){
                    max = numbs;
                    textField2.setText(String.valueOf(max));
                }
            }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ejercicio41");
        frame.setContentPane(new ejercicio41().root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
