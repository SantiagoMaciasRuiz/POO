package ejercicios;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class interfaz {
    private JPanel root;
    private JPanel pregunta1;
    private JPanel pregunta2;
    private JPanel pregunta3;
    private JPanel pregunta4;
    private JPanel pregunta5;
    private JTextField dato2;
    private JTextField dato3;
    private JTextField dato4;
    private JTextField dato5;
    private JButton confirmarButton;
    private JTextField dato1;
    private JButton borrar;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;


    public interfaz() {
        confirmarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            double horasTrabajadas,valorHoraTrabajada,porcRetencionFuente;
            String codigoEmpleado = dato1.getText();
            horasTrabajadas = Double.parseDouble(dato3.getText());
            valorHoraTrabajada = Double.parseDouble(dato4.getText());
            porcRetencionFuente = Double.parseDouble(dato5.getText());
            String nombreEmpleado =dato2.getText();
            double salarioBruto=horasTrabajadas*valorHoraTrabajada;
            double retencionFuente=salarioBruto*(porcRetencionFuente/100);
            double salarioNeto = ((salarioBruto)-(retencionFuente));
            textField1.setText(String.valueOf(codigoEmpleado));
            textField2.setText(String.valueOf(nombreEmpleado));
            textField3.setText(String.valueOf(salarioBruto));
            textField4.setText(String.valueOf(retencionFuente));
            textField5.setText(String.valueOf(salarioNeto));
            }
        });
        borrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
                textField5.setText("");
                dato1.setText("");
                dato2.setText("");
                dato3.setText("");
                dato4.setText("");
                dato5.setText("");
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

