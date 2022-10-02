package ejercicios;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ejercicio23 {
    private JPanel root;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton confirmarButton;
    private JTextField textField4;
    private JTextField textField5;
    private JButton borrarButton;

    public ejercicio23() {
        confirmarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            double A,B,C;
            A= Double.parseDouble(textField3.getText());
            B = Double.parseDouble(textField2.getText());
            C = Double.parseDouble(textField1.getText());
            double resultado1=((-B+Math.sqrt((B*B)-4*A*C))/(2*A));
            double resultado2=((-B-Math.sqrt((B*B)-4*A*C))/(2*A));
            textField4.setText(String.valueOf(resultado1));
            textField5.setText(String.valueOf(resultado2));
            }
        });
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
                textField5.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ejercicio23");
        frame.setContentPane(new ejercicio23().root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
