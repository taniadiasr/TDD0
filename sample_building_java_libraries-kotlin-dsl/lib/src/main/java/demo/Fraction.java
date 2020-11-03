package demo;

public class Fraction {
    private int numerador;
    private int denominador;

    public Fraction() {}

    public Fraction(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int someFunction() {
        System.out.println(this.numerador/this.denominador);
        return (int) (this.numerador/this.denominador);
    }
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return String.format("%i/%i", this.getNumerador(), this.getDenominador());
    }
}
