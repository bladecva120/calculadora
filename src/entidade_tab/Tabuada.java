package entidade_tab;

public class Tabuada {

    public int op;
    public int n1;

    public void adição() {
        for (int i = 0; i <= 10; i++) {
            System.out.println((int) n1 + " + " + i + " = " + ((int) n1 + i));
        }
    }

    public void subtração() {
        for (int i = 0; i < 10 + 1; i++) {
            if (i < n1){
                for (i = n1; i < 10 + n1; i++){
                    System.out.println(i + " - " + (int) n1 + " = " + (i - (int)n1));
                }
            }else {
                System.out.println((int) n1 + " - " + i + " = " + ((int)n1 - i));
            }
            
        }
    }

    public void multiplicação() {
        for (int i = 0; i <= 10; i++) {
            System.out.println((int) n1 + " x " + i + " = " + ((int)n1 * i));
        }
    }

    public void divisão() {
        for (int i = 0; i <= 10; i++) {
            System.out.printf(i + " : " + n1 + " = %.2f%n", (i / (double)n1));
        }
    }
}
