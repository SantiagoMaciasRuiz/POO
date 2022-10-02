package figuras;
public class Rombo {
    double lado; // Atributo que define el lado del rombo
    double diagonalmayor; //Atributo que define la diagonal mayor de un rombo
    double diagonalmenor; //Atributo que define la diagonal menor de un rombo
    public Rombo(double lado, double diagonalmayor, double diagonalmenor) {
        this.lado = lado;
        this.diagonalmayor = diagonalmayor;
        this.diagonalmenor = diagonalmenor;
    }
    double calcularArea() {
        return ((diagonalmayor * diagonalmenor) / 2);
    }
    double calcularPerímetro() {
        return lado+lado+lado+lado;
    }
}
