package figuras;
public class Circulo {
    int Radio; // Atributo que define el radio de un círculo
    Circulo(int Radio) {
        this.Radio = Radio;
    }
    double calcularArea() {
        return Math.PI*Math.pow(Radio,2);
    }
    double calcularPerímetro() {
        return 2*Math.PI*Radio;
    }
}

