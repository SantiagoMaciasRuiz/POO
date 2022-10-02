package figuras;

public class Rectángulo {
    int base; // Atributo que define la base de un rectángulo
    int altura; // Atributo que define la altura de un rectángulo
    Rectángulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    double calcularArea() {
        return base * altura;
    }
    double calcularPerímetro() {
        return (2 * base) + (2 * altura);
    }
}

