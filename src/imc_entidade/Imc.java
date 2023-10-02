package imc_entidade;

public class Imc {

    public double peso;
    public double altura;
    public double resultado;

    public void imc(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double imcCalc() {
        resultado = peso / Math.pow(altura, 2);
        if (resultado < 17) {
            System.out.println("Muito abaixo do peso");
        } else if (resultado >= 17 && resultado <= 18.49) {
            System.out.println("Abaixo do peso");
        } else if (resultado >= 18.50 && resultado <= 24.99) {
            System.out.println("Peso normal");
        } else if (resultado >= 25 && resultado <= 29.99) {
            System.out.println("Acima do peso");
        } else if (resultado >= 30 && resultado <= 34.99) {
            System.out.println("Obsidade I");
        } else if (resultado >= 35 && resultado <= 39.99) {
            System.out.println("Obsidade II (Severa)");
        } else if (resultado >= 40) {
            System.out.println("Obsidade III (Mórbida)");
        }
        return resultado;
    }

}
