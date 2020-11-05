package demo;

public class Fraction {
    private int numerador;
    private int denominador;

    public Fraction() {}

    public Fraction(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public boolean someFunction(Object obj) {
        String errorMessage = "Mistyped detected: ";
        try {
            if (obj.getClass().getName().contains("Fraction") ){
                Fraction local = (Fraction) obj;
                if (local.getDenominador() != 0){
                    return true;
                }
                else {
                    errorMessage += "zero in the denominador of the Fraction";
                }
            }
            else {
                if (obj.getClass().getTypeName().contains("Integer")) {
                    return true;
                }
                else {
                    errorMessage += obj.getClass().getName();
                }
            }
            // If we got here, is not a valid type so let's print that out :)
            System.out.println(errorMessage);
        }
        catch (Exception e){
            System.out.println("Something went wrong! Error: %s" + e.toString());
        }
        return false;
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
