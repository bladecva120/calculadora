package tab_entidade;

public class Tabuada {

    public int n1;

    public void adi��o() {
        for (int i = 0; i <= 10; i++) {
            System.out.println((int) n1 + " + " + i + " = " + ((int) n1 + i));
        }
    }

    public void subtra��o() {
        for (int i = 0; i <= 10 + 1; i++) {
            if (i < n1) {
                for (i = n1; i < 10 + n1; i++) {
                    System.out.println(i + " - " + (int) n1 + " = " + (i - (int) n1));
                }
            } else {
                System.out.println((int) n1 + " - " + i + " = " + ((int) n1 - i));
            }

        }
    }

    public void multiplica��o() {
        for (int i = 0; i <= 10; i++) {
            System.out.println((int) n1 + " x " + i + " = " + ((int) n1 * i));
        }
    }

    public void divis�o() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf(n1 + " : " + i + " = %.2f%n", (n1 / (double) i));
        }
    }
}
