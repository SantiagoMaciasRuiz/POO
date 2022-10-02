package figuras;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class interfaz {
    private JPanel root;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField diagonalMayorTextField;
    private JTextField textField6;
    private JTextField textField7;
    private JButton confirmarDatosButton;
    private JTextField textField5;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
    private JTextField textField11;
    private JTextField textField12;
    private JTextField textField13;
    private JTextField textField14;
    private JTextField textField15;
    private JTextField textField16;
    private JTextField textField17;
    private JTextField textField18;
    private JTextField textField20;
    private JTextField textField21;
    private JTextField textField22;
    private JTextField textField23;
    private JTextField textField24;
    private JTextField textField25;
    private JButton borrarButton;
    private JTextField textField19;
    private JTextArea textArea1;

    public interfaz() {
        confirmarDatosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Circulo figura1 = new Circulo(Integer.parseInt(textField1.getText()));
                Rectángulo figura2 = new Rectángulo(Integer.parseInt(textField3.getText()),Integer.parseInt(textField4.getText()));
                Cuadrado figura3 = new Cuadrado(Integer.parseInt(textField2.getText()));
                TriánguloRectángulo figura4 = new TriánguloRectángulo(Integer.parseInt(textField11.getText()),Integer.parseInt(textField12.getText()));
                Rombo figura5 = new Rombo(Double.parseDouble(diagonalMayorTextField.getText()),Double.parseDouble(textField6.getText()),Double.parseDouble(textField7.getText()));
                trapecio figura6 = new trapecio(Integer.parseInt(textField5.getText()),Integer.parseInt(textField9.getText()),Integer.parseInt(textField10.getText()),Integer.parseInt(textField8.getText()));
                textField13.setText(String.valueOf(figura1.calcularArea()));
                textField14.setText(String.valueOf(figura3.calcularArea()));
                textField15.setText(String.valueOf(figura2.calcularArea()));
                textField16.setText(String.valueOf(figura5.calcularArea()));
                textField17.setText(String.valueOf(figura6.calcularArea()));
                textField18.setText(String.valueOf(figura4.calcularArea()));
                textField20.setText(String.valueOf(figura1.calcularPerímetro()));
                textField21.setText(String.valueOf(figura3.calcularPerímetro()));
                textField22.setText(String.valueOf(figura2.calcularPerímetro()));
                textField23.setText(String.valueOf(figura5.calcularPerímetro()));
                textField24.setText(String.valueOf(figura6.calcularPerímetro()));
                textField25.setText(String.valueOf(figura4.calcularPerímetro()));
                textField19.setText(String.valueOf(figura4.determinarTipoTriángulo()));
            }
        });
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField13.setText("");
                textField14.setText("");
                textField15.setText("");
                textField16.setText("");
                textField17.setText("");
                textField18.setText("");
                textField20.setText("");
                textField21.setText("");
                textField22.setText("");
                textField23.setText("");
                textField24.setText("");
                textField25.setText("");
                textField19.setText("");
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
                textField5.setText("");
                textField6.setText("");
                textField7.setText("");
                textField11.setText("");
                textField12.setText("");
                textField8.setText("");
                textField9.setText("");
                textField10.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("interfaz");
        frame.setContentPane(new interfaz().root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
