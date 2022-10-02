package ejercicios;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ejercicio19 {
    private JPanel root;
    private JTextField textField1;
    private JButton borrarButton;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton confirmar;

    public ejercicio19() {
        confirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            double lado,h,area,perimetro;
            h=0;
            area=0;
            perimetro =0;
            lado = Double.parseDouble(textField1.getText());
            h = (lado*Math.sqrt(3))/2 ;
            area = (Math.sqrt(3)/4)*Math.pow(lado,2);
            perimetro = (3*lado);
            textField2.setText(String.valueOf(perimetro));
            textField3.setText(String.valueOf(h));
            textField4.setText(String.valueOf(area));
            }
        });
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ejercicio19");
        frame.setContentPane(new ejercicio19().root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
