package figuras;

public class trapecio {
    int altura; // Atributo que define la altura de un trapecio
    int lado; // Atributo que define un lado del trapecio
    int basemayor; //Atributo que define la base mayor de un trapecio
    int basemenor; //Atributo que define la base menor de un trapecio
    public trapecio(int altura, int basemayor, int basemenor, int lado) {
        this.altura = altura;
        this.lado = lado;
        this.basemayor = basemayor;
        this.basemenor = basemenor;
    }
    double calcularArea() {
        double a = (((basemenor+basemayor)*altura)/2);
        return a;
    }
    double calcularPerímetro() {
        return ((2*lado)+basemayor+basemenor);
    }
}
