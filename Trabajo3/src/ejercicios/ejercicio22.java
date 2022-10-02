package ejercicios;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ejercicio22 {

    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton confirmarButton;
    private JButton button1;
    private JTextField XXXXXXXXXXXXXXXXXXXTextField;
    private JTextField textField5;
    private JPanel root;

    public ejercicio22() {
        confirmarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            double salario,horas;
            String nombre = textField2.getText();
            salario = Double.parseDouble(textField1.getText());
            horas = Double.parseDouble(textField3.getText());
                if ((salario*horas)>=450000) {
                    textField5.setText(String.valueOf(salario*horas));
                    XXXXXXXXXXXXXXXXXXXTextField.setText(String.valueOf(nombre));
                }
                else {
                    textField5.setText(String.valueOf(salario*horas));
                }
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                XXXXXXXXXXXXXXXXXXXTextField.setText("");
                textField5.setText("");

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ejercicio22");
        frame.setContentPane(new ejercicio22().root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
