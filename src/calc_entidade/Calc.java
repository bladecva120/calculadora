package calc_entidade;

/**
 *
 * @author BLADE CVA120
 */
public class Calc {

    public double n1;
    public double n2;

    public void linhaApp() {
        System.out.println("========================");
    }

    public void linha() {
        System.out.println("--------------------------------------------");
    }

    public double adição() {
        return n1 + n2;
    }

    public double subtração() {
        return n1 - n2;
    }

    public double multiplicação() {
        return n1 * n2;
    }

    public double divisão() {
        return n1 / n2;
    }

}
