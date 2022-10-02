package ejercicios;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ejercicio7 {
    private JPanel root;
    private JButton confirmarButton;
    private JButton borrarButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;

    public ejercicio7() {
        confirmarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            double A,B;
            A = Double.parseDouble(textField1.getText());
            B = Double.parseDouble(textField2.getText());
            if (A>B){
                textField3.setText("A es mayor que B");
            }
            else if (A==B){
                textField3.setText("A es igual que B");
            }
            else {
                textField3.setText("A es menor que B");
            }
            }

        });
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ejercicio7");
        frame.setContentPane(new ejercicio7().root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
