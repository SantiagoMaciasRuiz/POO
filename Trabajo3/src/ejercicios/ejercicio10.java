package ejercicios;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ejercicio10 {
    private JPanel root;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton borrarButton;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JButton confirmarButton;

    public ejercicio10() {
        confirmarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            double inscripcion,patrimonio,estrato;
            double matricula = 50000;
            inscripcion = Double.parseDouble(textField6.getText());
            String nombre = textField4.getText();
            patrimonio = Double.parseDouble(textField7.getText());
            estrato = Double.parseDouble(textField5.getText());
            if ((patrimonio > 2000000) && (estrato > 3)) {
                matricula += patrimonio * (0.03);
                textField1.setText(String.valueOf(inscripcion));
                textField2.setText(String.valueOf(nombre));
                textField3.setText(String.valueOf(matricula));
                }
            else {
                textField1.setText(String.valueOf(inscripcion));
                textField2.setText(String.valueOf(nombre));
                textField3.setText(String.valueOf(matricula));

            }

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
                textField6.setText("");
                textField7.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ejercicio10");
        frame.setContentPane(new ejercicio10().root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
